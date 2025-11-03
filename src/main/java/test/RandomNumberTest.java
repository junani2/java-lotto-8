package test;

import lotto.LottoGenerator;
import lotto.Lotto;
import org.junit.jupiter.api.Test;
import view.BuyingLottos;

import java.util.List;

public class RandomNumberTest {

    @Test
    void 로또_발급하기_출력_테스트() {
        LottoGenerator lottoGenerate = new LottoGenerator();
        List<Lotto> lottos = lottoGenerate.generate(8);

        BuyingLottos.printLottos(lottos);
    }
}
