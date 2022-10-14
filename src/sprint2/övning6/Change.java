package sprint2.övning6;

import java.util.ArrayList;
import java.util.List;

public class Change {

   protected boolean test;
    public Change(boolean test){
        this.test = test;
    }

    List<Integer>currency = List.of(500,100,50,20,10,5,2,1);

    public int changeAmount (int price, int pay){
        return pay - price;
    }

    public int currencyAmount(int pay, int currency){
        return pay /currency;
    }

    public int rest(int pay, int currency){
        return pay % currency;
    }

    public List<Integer> iteration(int pay){
        List<Integer> res = new ArrayList<>();
        for (int i = 0; i < currency.size(); i ++){
           res.add(currencyAmount(pay,currency.get(i)));
           pay = rest(pay, currency.get(i));
        }
        return res;

    }
}

