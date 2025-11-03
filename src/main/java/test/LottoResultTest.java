package test;

import lotto.LottoResult;
import lotto.WinningLotto;
import lotto.Lotto;
import org.junit.jupiter.api.Test;
import prize.Prize;

import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LottoResultTest {

    @Test
    void 당첨_결과_통계를_정상적으로_계산한다() {
        WinningLotto winningLotto = new WinningLotto("1,2,3,4,5,6", 10);

        //6개 일치
        Lotto lotto1 = new Lotto(List.of(1, 2, 3, 4, 5, 6));
        //5개 일치+보너스 일치
        Lotto lotto2 = new Lotto(List.of(1, 2, 3, 4, 5, 10));
        // 5개만 일치
        Lotto lotto3 = new Lotto(List.of(1, 2, 3, 4, 5,11 ));
        // 4개만 일치
        Lotto lotto4 = new Lotto(List.of(3, 4, 5, 6, 8, 9));
        // 3개만 일치
        Lotto lotto5 = new Lotto(List.of(1, 2, 3, 11, 12, 13));

        List<Lotto> lottos = List.of(lotto1, lotto2, lotto3, lotto4, lotto5);

        Map<Prize, Integer> result = LottoResult.calculate(lottos, winningLotto);

        assertEquals(1, result.get(Prize.SIX));
        assertEquals(1, result.get(Prize.FIVE_BONUS));
        assertEquals(1, result.get(Prize.FIVE));
        assertEquals(1, result.get(Prize.FOUR));
        assertEquals(1, result.get(Prize.THREE));


    }
}
