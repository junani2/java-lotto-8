package lotto;

import util.WinningNumberParser;

public class WinningLotto extends Lotto {
    private final int bonusNumber;

    public WinningLotto(String winningInput, String bonusInput) {

        super(WinningNumberParser.parse(winningInput));
        int bonus = Integer.parseInt(bonusInput);
        super.addBonusNumber(bonus);
        this.bonusNumber = bonus;
    }

    public int getBonusNumber() {
        return bonusNumber;
    }
}

