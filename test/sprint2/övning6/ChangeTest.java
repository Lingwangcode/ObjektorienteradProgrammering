package sprint2.övning6;

import org.junit.jupiter.api.Test;
import sprint2.övning6.Change;

import java.util.List;

public class ChangeTest {

    boolean test = true;
    Change c = new Change(test);


    @Test
    public void changeAmountTest(){
        int price = 250;
        int pay = 500;
        assert (c.changeAmount(price, pay) == 250);
    }

    @Test
    public void currencyListTest(){
        assert (c.currency.get(0) == 500);
        assert (c.currency.get(1) == 100);
        assert (c.currency.get(2) == 50);
        assert (c.currency.get(3) == 20);
        assert (c.currency.get(4) == 10);
        assert (c.currency.get(5) == 5);
        assert (c.currency.get(6) == 2);
        assert (c.currency.get(7) == 1);
        assert (c.currency.size() == 8);
    }

    @Test
    public void currencyAmountTest(){
        int pay = 500;
        int currency = 100;
        assert (c.currencyAmount(500, 100) == 5);
    }

    @Test
    public void restTest(){
        int pay = 500;
        int currency = 200;
        assert (c.rest(500, 200) == 100);
    }

    @Test
    public void iterationTest(){
        int change = 524;
        List<Integer> res = c.iteration(change);
        assert (res.get(0) == 1);
        assert (res.get(1) == 0);
        assert (res.get(2) == 0);
        assert (res.get(3) == 1);
        assert (res.get(4) == 0);
        assert (res.get(5) == 0);
        assert (res.get(6) == 2);
        assert (res.get(7) == 0);
    }


}
