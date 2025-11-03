package lotto;

import prize.Prize;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LottoResult {

    public static Map<Prize, Integer> calculate(List<Lotto> lottos, WinningLotto winningLotto) {
        Map<Prize, Integer> result = new HashMap<>();

        //prize 값 초기화
        for (Prize prize : Prize.values()) {
            result.put(prize, 0);
        }

        for (Lotto lotto : lottos) {
            int matchCount = (int) lotto.getNumbers().stream()
                    .filter(winningLotto.getNumbers()::contains)
                    .count();
            boolean matchBonus = lotto.getNumbers().contains(winningLotto.getBonusNumber());

            Prize prize = null;
            if (matchCount == 6)  prize = Prize.SIX;
            if (matchCount == 5 && matchBonus)  prize = Prize.FIVE_BONUS;
            if (matchCount == 5) prize = Prize.FIVE;
            if (matchCount == 4) prize = Prize.FOUR;
            if (matchCount == 3) prize = Prize.THREE;

            if (prize != null) {
                result.put(prize, result.get(prize) + 1);
            }
        }
        return result;
    }
}
