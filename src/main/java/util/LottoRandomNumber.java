package util;

import camp.nextstep.edu.missionutils.Randoms;
import lotto.Lotto;

import java.util.List;

public class LottoRandomNumber {

    public Lotto pick(){

        List<Integer> numbers = Randoms.pickUniqueNumbersInRange(1,45,6);
        return new Lotto(numbers);
    }
}
