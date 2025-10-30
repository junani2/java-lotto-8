package view;


import static camp.nextstep.edu.missionutils.Console.readLine;

public class InputWinningNumber {

    public String readNumber() {

        System.out.println("당첨 번호를 입력해 주세요.");
        return readLine();
    }

    public String readBonusNumber() {

        System.out.println("보너스 번호를 입력해 주세요.");
        return readLine();
    }
}
