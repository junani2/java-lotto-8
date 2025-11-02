package domain;

import lotto.Lotto;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LottoResult {

    public static Map<String, Integer> calculate(List<Lotto> lottos, WinningLotto winningLotto) {
        Map<String, Integer> result = new HashMap<>();
        result.put("3",0);
        result.put("4",0);
        result.put("5",0);
        result.put("5b",0);
        result.put("6",0);

        for (Lotto lotto : lottos) {
            int matchCount = (int) lotto.getNumbers().stream()
                    .filter(winningLotto.getNumbers()::contains)
                    .count();
            boolean matchBonus = lotto.getNumbers().contains(winningLotto.getBonusNumber());

            if(matchCount == 6)
                result.put("6", result.get("6")+1);
            if(matchCount ==5 && matchBonus)
                result.put("5b", result.get("5b")+1);
            if(matchCount ==5 && !matchBonus)
                result.put("5", result.get("5")+1);
            if(matchCount ==4)
                result.put("4", result.get("4")+1);
            if(matchCount ==3)
                result.put("3", result.get("3")+1);
        }
        return result;
    }
}
