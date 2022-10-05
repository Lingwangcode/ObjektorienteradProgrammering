package sprint1.inlämning1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KöttätandeVäxterTest {

    KöttätandeVäxter k = new KöttätandeVäxter(0.9);
    KöttätandeVäxter k2 = new KöttätandeVäxter(3);
    @Test
    void vätskInfo() {
        assert (k.getVätskaMängd() == k.getLängd() * 0.2 + 0.1);
        assert (k.getVätskaMängd() != k.getLängd() * 0.2 + 0.3);

        assert(k2.getVätskaMängd() == k2.getLängd() * 0.2 + 0.1);
        assert(k2.getVätskaMängd() != k2.getLängd() * 0.5 + 0.1);
    }
}