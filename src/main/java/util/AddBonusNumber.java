package util;

import exception.ErrorMessage;

import java.util.List;

public class AddBonusNumber {
    private final List<Integer> numbers;

    public void addBonusNumber(int bonus){

        if (bonus < 1 || bonus > 45) {
            throw new IllegalArgumentException(ErrorMessage.NUMBER_OUT_OF_RANGE.getMessage());
        }
        if (numbers.contains(bonus)) {
            throw new IllegalArgumentException(ErrorMessage.DUPLICATE_NUMBER.getMessage());
        }
        numbers.add(bonus);
    }
}
