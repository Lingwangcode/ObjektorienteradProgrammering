package sprint1.inlämning1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PalmerTest {

    Palmer p1 = new Palmer("laura", 9);
    Palmer p2 = new Palmer("sabal minor", 6);

    @Test
    void vätskInfo() {
        assert (p1.getVätskaMängd() == p1.getLängd() * 3);
        assert (p1.getVätskaMängd() != p1.getVätskaMängd() * 2);
        assert (p2.getVätskaMängd() == p2.getLängd() * 3);
        assert (p2.getVätskaMängd() != p2.getLängd() * 1);
    }
}