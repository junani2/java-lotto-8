package view;

import prize.Prize;
import util.ResultRate;

import java.util.Map;

public class WinningStatistics {

    public static void printStatistics(Map<Prize, Integer> result, int amount){
        System.out.println("당첨 통계");
        System.out.println("---");

        for(Prize prize : Prize.values() ){
            int count  =  result.getOrDefault(prize,0);

            if(prize == Prize.FIVE_BONUS){
                System.out.printf("5개 일치, 보너스 볼 일치 (%s원) - %d개\n", formatMoney(prize.getMoney()),count);
            }
            if(prize !=  Prize.FIVE_BONUS){
                System.out.printf("%d개 일치 (%s원) - %d개\n",prize.getMatchCount(),formatMoney(prize.getMoney()),count);
            }
        }
        System.out.println("총 수익률은" + ResultRate.earningRate(result, amount)+"%입니다.");

    }

    private static String formatMoney(int money) {
        return String.format("%,d", money);
    }
}
