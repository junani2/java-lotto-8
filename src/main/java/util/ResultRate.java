package util;

import prize.Prize;

import java.util.Map;

public class ResultRate {
    public static double earningRate(Map<Prize, Integer> result, int amount) {
        int totalRate = result.getOrDefault(Prize.SIX, 0) * Prize.SIX.getMoney()
                + result.getOrDefault(Prize.FIVE_BONUS, 0) * Prize.FIVE_BONUS.getMoney()
                + result.getOrDefault(Prize.FIVE, 0) * Prize.FIVE.getMoney()
                + result.getOrDefault(Prize.FOUR, 0) * Prize.FOUR.getMoney()
                + result.getOrDefault(Prize.THREE, 0) * Prize.THREE.getMoney();


        double rate = (double) totalRate / amount * 100;
        return Math.round(rate * 10) / 10.0;
    }
}
