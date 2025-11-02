package test;

import domain.LottoResult;
import domain.WinningLotto;
import domain.Lotto;
import org.junit.jupiter.api.Test;
import prize.Prize;
import view.WinningStatistics;

import java.util.List;
import java.util.Map;

public class StatisticsOuput {
    @Test
    void 수익률_계산() {
        WinningLotto winningLotto = new WinningLotto("1,2,3,4,5,6", "10");

        //3개 일치
        Lotto lotto1 = new Lotto(List.of(1, 2, 3, 11, 13, 14));
        //꽝
        Lotto lotto3 = new Lotto(List.of(7, 8, 9, 10, 11, 12));
        Lotto lotto4 = new Lotto(List.of(13, 14, 15, 16, 17, 18));
        Lotto lotto5 = new Lotto(List.of(19, 20, 21, 22, 23, 24));

        List<Lotto> lottos = List.of(lotto1, lotto3, lotto4, lotto5);

        Map<Prize, Integer> result = LottoResult.calculate(lottos, winningLotto);

        WinningStatistics .printStatistics(result,13000);
    }
}
