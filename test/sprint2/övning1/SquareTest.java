package sprint2.övning1;

import org.junit.jupiter.api.Test;

public class SquareTest {
    Square s1 = new Square(4,5);
    Square s2 = new Square(3,4);

    @Test
    public void getAreaTest(){
        assert(s1.getArea() == 20);
        assert (s2.getArea() == 12);
    }

    @Test
    public void getCicumferenceTest(){
        assert (s1.getCircumference() == 18);
        assert (s2.getCircumference() == 14);
    }
}
