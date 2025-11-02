package util;

import camp.nextstep.edu.missionutils.Randoms;
import domain.Lotto;

import java.util.Collections;
import java.util.List;

public class LottoRandomNumber {

    public static Lotto pick(){

        List<Integer> numbers = Randoms.pickUniqueNumbersInRange(1,45,6);
        Collections.sort(numbers);
        return new Lotto(numbers);
    }
}
