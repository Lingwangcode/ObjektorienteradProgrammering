package sprint2.övning1;

import org.junit.jupiter.api.Test;

public class CircleTest {

    Circle c1 = new Circle(4);
    Circle c2 = new Circle(16);


    @Test
    public void getAreaTest(){
        assert(c1.getArea() == (int) (4 * Math.PI));
        assert (c2.getArea() == (int) (64 * Math.PI));
    }

    @Test
    public void getCicumferenceTest(){
        assert (c1.getCircumference() == (int) (c1.getDiameter() * Math.PI));
        assert (c2.getCircumference() == (int) (c2.getDiameter() * Math.PI));
    }


}
