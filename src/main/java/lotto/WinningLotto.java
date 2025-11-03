package lotto;

import util.WinningNumberParser;

public class WinningLotto extends Lotto {
    private final int bonusNumber;

    public WinningLotto(String winningInput, int bonusInput) {

        super(WinningNumberParser.parse(winningInput));
        int bonus = bonusInput;
        super.addBonusNumber(bonus);
        this.bonusNumber = bonus;
    }

    public int getBonusNumber() {
        return bonusNumber;
    }

    public WinningLotto(String numbers) {
        super(WinningNumberParser.parse(numbers));
        this.bonusNumber = -1;
    }
}

