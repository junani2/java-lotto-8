package domain;

import util.WinningNumberParser;

import java.util.List;

public class WinningLotto {
    private final List<Integer> numbers;
    private final int bonusNumber;

    public WinningLotto(String winningInput, String bonusInput){
        this.numbers = WinningNumberParser.parse(winningInput);
        this.bonusNumber = Integer.parseInt(bonusInput);
    }
    public List<Integer> getNumbers(){
        return numbers;
    }
    public int getBonusNumber(){
        return bonusNumber;
    }
}

