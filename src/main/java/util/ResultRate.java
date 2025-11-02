package util;

import java.util.Map;

public class ResultRate {
    private static final int[] PRIZES = { 0,0, 5000, 50000, 1500000, 30000000, 2000000000};

    public static double getMoney(Map<String, Integer> result, int amount){
        int totalRate = result.get("6") *  PRIZES[6]
                + result.get("5b") *  PRIZES[5]
                + result.get("5") *  PRIZES[4]
                + result.get("4") *  PRIZES[3]
                + result.get("3") *  PRIZES[2];

        double rate = (double)totalRate / amount*100;
        return  Math.round(rate*10)/10.0;
    }
}
