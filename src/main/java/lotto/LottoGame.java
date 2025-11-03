package lotto;

import prize.Prize;
import view.BuyingLottos;
import view.InputAmount;
import view.InputWinningLotto;
import view.WinningStatistics;

import java.util.List;
import java.util.Map;

import static view.InputWinningBonusNumber.readBonusNumber;
import static view.InputWinningNumber.readNumber;

public class LottoGame {

    public void run() {

        //금액 입력
        int amount = InputAmount.purchase();

        //구매한 로또 출력
        LottoGenerator lottoGenerator = new LottoGenerator();
        List<Lotto> lottos = lottoGenerator.generate(amount);

        //로또 출력하기
        BuyingLottos.printLottos(lottos);

        //번호 입력 + 보너스 번호로 WinningLotto 객체 만들기
        InputWinningLotto inputWinningLotto = new InputWinningLotto();
        WinningLotto winningLotto = inputWinningLotto.inputWinningLotto();

        //비교하기
        Map<Prize, Integer> result = LottoResult.calculate(lottos, winningLotto);

        //출력하기
        WinningStatistics.printStatistics(result, amount);
    }
}
