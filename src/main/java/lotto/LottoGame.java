package lotto;

import domain.LottoGenerator;
import domain.LottoResult;
import domain.WinningLotto;
import prize.Prize;
import view.BuyingLottos;
import view.InputAmount;
import view.InputWinningNumber;
import view.WinningStatistics;

import java.util.Map;

public class LottoGame {

    public void run() {

        //금액 입력
        int amount = InputAmount.purchase();

        //구매한 로또 출력
        LottoGenerator lottos = new LottoGenerator();
        BuyingLottos.printLottos(lottos.generate(amount));

        //번호 입력 + 보너스 번호로 객체 만들기
        InputWinningNumber inputWinningNumber = new InputWinningNumber();
        String inputNumber = inputWinningNumber.readNumber();
        String inputBonusNumber = inputWinningNumber.readBonusNumber();
        WinningLotto winningLotto = new WinningLotto(inputNumber, inputBonusNumber);

        //비교하기
        Map<Prize, Integer> result = LottoResult.calculate(lottos.generate(amount), winningLotto);

        //출력하기
        WinningStatistics.printStatistics(result, amount);
    }
}
