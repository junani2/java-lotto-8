package view;

import exception.ErrorMessage;

import static camp.nextstep.edu.missionutils.Console.readLine;

public class InputAmount {

    //로또 구입 금액
    public static int amount() {

        try {
            System.out.println("구입금액을 입력해 주세요.");
            int amount = Integer.parseInt(readLine());

            if (amount < 1000) {
                throw new IllegalArgumentException(ErrorMessage.INPUT_MIN_AMOUNT_ERROR.getMessage());
            }
            if (amount % 1000 != 0) {
                throw new IllegalArgumentException(ErrorMessage.INPUT_AMOUNT_UNIT_ERROR.getMessage());
            }
            return amount;

        } catch (IllegalArgumentException e) {
            System.out.println("[Error]" + e.getMessage());
            return amount();
        }
    }
}
