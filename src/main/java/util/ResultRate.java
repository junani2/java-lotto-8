package util;

import prize.Prize;

import java.util.Map;

public class ResultRate {
    private static final int[] PRIZES = { 0,0, 5000, 50000, 1500000, 30000000, 2000000000};

    public static double earningRate (Map<Prize, Integer> result, int amount){
        int totalRate = result.getOrDefault(Prize.SIX, 0) * Prize.SIX.getMoney()
                + result.getOrDefault(Prize.FIVE_BONUS, 0) * Prize.FIVE_BONUS.getMoney()
                + result.getOrDefault(Prize.FIVE, 0) * Prize.FIVE.getMoney()
                + result.getOrDefault(Prize.FOUR, 0) * Prize.FOUR.getMoney()
                + result.getOrDefault(Prize.THREE, 0) * Prize.THREE.getMoney();


        double rate = (double)totalRate / amount*100;
        return  Math.round(rate*10)/10.0;
    }
}
