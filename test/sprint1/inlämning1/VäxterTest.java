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

        assert(igge.getVätskeMängd() == 0.2);
        assert(igge.getVätskeMängd() != 2);

        assert (p1.getVätskeMängd() == p1.getLängd() * 3);
        assert (p1.getVätskeMängd() != p1.getVätskeMängd() * 2);

        assert (p2.getVätskeMängd() == p2.getLängd() * 3);
        assert (p2.getVätskeMängd() != p2.getLängd() * 1);

        assert(k.getVätskeMängd() == k.getLängd() * 0.2 + 0.1);
        assert(k.getVätskeMängd() != k.getLängd() * 0.2 + 0.2);

        assert(k2.getVätskeMängd() == k2.getLängd() * 0.2 + 0.1);
        assert(k2.getVätskeMängd() != k2.getLängd() * 0.5 + 0.1);

    }
}