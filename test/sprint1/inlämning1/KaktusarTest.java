package sprint1.inlämning1;

import org.junit.jupiter.api.Test;

class KaktusarTest {

    Kaktusar igge = new Kaktusar() {
    };

    @Test
    void vätskInfo() {
        assert(igge.getVätskaMängd() == 0.2);
        assert(igge.getVätskaMängd() != 2);

    }



}