package view;

import lotto.WinningLotto;

import java.util.List;

import static view.InputWinningBonusNumber.readBonusNumber;
import static view.InputWinningNumber.readNumber;

public class InputWinningLotto {
    public WinningLotto inputWinningLotto() {

        String numbers;
        while (true) {
            try {
                numbers = readNumber();
                new WinningLotto(numbers );
                break;
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }

        int bonus;
        while (true) {
            try {
                bonus = readBonusNumber();
                WinningLotto temp = new WinningLotto(numbers,bonus);
                break;
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
        return new WinningLotto(numbers, bonus);
    }
}
