package test;

import domain.LottoGenerate;
import lotto.Lotto;
import org.junit.jupiter.api.Test;
import view.BuyingLottos;

import java.util.List;

public class RandomNumberTest {

    @Test
    void 로또_발급하기_출력_테스트() {
        LottoGenerate lottoGenerate = new LottoGenerate();
        List<Lotto> lottos = lottoGenerate.generate(8);

        BuyingLottos.printLottos(lottos);
    }
}
