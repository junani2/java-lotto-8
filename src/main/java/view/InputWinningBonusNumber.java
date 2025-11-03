package view;

import static camp.nextstep.edu.missionutils.Console.readLine;

public class InputWinningBonusNumber {
    public static int readBonusNumber() {

        System.out.println("보너스 번호를 입력해 주세요.");
        return (Integer.parseInt(readLine()));
    }
}
