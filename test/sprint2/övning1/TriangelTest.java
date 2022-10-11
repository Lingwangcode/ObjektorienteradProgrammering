package sprint2.övning1;

import org.junit.jupiter.api.Test;

public class TriangelTest {

    Triangel t1 = new Triangel(4, 4);
    Triangel t2 = new Triangel(5, 4);

    @Test
    public void likbenTriangelTest(){
        assert(t1.likbenTriangel());
        assert(!t2.likbenTriangel());
    }

    @Test
    public void getAreaTest(){
        assert(t1.getArea() == 8);
        assert (t2.getArea() == 10);
    }

    @Test
    public void getCicumferenceTest(){
        assert (t1.getCircumference() == 12);
        assert (t1.getCircumference() != 8);
    }
}
