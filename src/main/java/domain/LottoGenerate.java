package domain;

import util.LottoRandomNumber;

import java.util.ArrayList;
import java.util.List;

public class LottoGenerate {

    public List<Lotto> generate(int amount){
        List<Lotto> buyingLotto = new ArrayList<>();

        for (int i = 0; i < amount; i++) {
            buyingLotto.add(LottoRandomNumber.pick());
        }
        return buyingLotto;
    }
}
