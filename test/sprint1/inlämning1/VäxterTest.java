package sprint1.inlämning1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VäxterTest {

    Kaktusar igge = new Kaktusar();
    Palmer p1 = new Palmer("laura", 9);
    Palmer p2 = new Palmer("sabal minor", 6);
    KöttätandeVäxter k = new KöttätandeVäxter(0.9);
    KöttätandeVäxter k2 = new KöttätandeVäxter(3);

    @Test
    void getVätskaMängd() {

        assert(igge.getVätskaMängd() == 0.2);
        assert(igge.getVätskaMängd() != 2);

        assert (p1.getVätskaMängd() == p1.getLängd() * 3);
        assert (p1.getVätskaMängd() != p1.getVätskaMängd() * 2);

        assert (p2.getVätskaMängd() == p2.getLängd() * 3);
        assert (p2.getVätskaMängd() != p2.getLängd() * 1);

        assert(k.getVätskaMängd() == k.getLängd() * 0.2 + 0.1);
        assert(k.getVätskaMängd() != k.getLängd() * 0.2 + 0.2);

        assert(k2.getVätskaMängd() == k2.getLängd() * 0.2 + 0.1);
        assert(k2.getVätskaMängd() != k2.getLängd() * 0.5 + 0.1);

    }
}