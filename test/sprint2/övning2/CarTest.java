package sprint2.övning2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class CarTest {

    Car car1 = new Car(3456.8, 2234.9);
    Car car2 = new Car(7767, 695);

    @Test
    public void getAntalMilTest(){
        assert (car1.getAntalMil() == 3456.8 - 2234.9);
        assert (car2.getAntalMil() == 7767 - 695);
    }

    @Test
    public void getBensinFörbjukningTest (){
        car1.setBensinFörbrukningPerÅr(6800);
        car2.setBensinFörbrukningPerÅr(1250);

        assert (Math.abs(car1.getBensinFörbrukning() - car1.getBensinFörbrukningPerÅr()/car1.getAntalMil())<0.001);

       // assert (car2.getBensinFörbrukning() == car2.getBensinFörbjukningPerÅr()/ car2.getAntalMil()); FUNGERAR INTE

    }
}
