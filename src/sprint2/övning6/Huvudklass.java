package sprint2.övning6;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Huvudklass {

    Change c = new Change(false);
        int price;
        int pay;
        int change;
        List<Integer> res = new ArrayList<>();
    public Huvudklass(){

        if (!c.test) {
            Scanner scan = new Scanner(System.in);

            System.out.println("Pris?");
            if (scan.hasNextInt()) {
                price = scan.nextInt();

                System.out.println("Hur mycket pengar betalar du?");
                if (scan.hasNextInt()) {
                    pay = scan.nextInt();

                    if (pay == price) {
                        System.out.println("Det blev ingen växel");
                    } else if (pay < price) {
                        System.out.println("Du lämnade för lite pengar");
                    } else {
                        change = c.changeAmount(price, pay);
                        res = c.iteration(change);


                        for (int i = 0; i < res.size(); i++) {
                            for (int j = 0; j < c.currency.size(); j++) {

                            }
                            if (c.currency.get(i) == 1 || c.currency.get(i) == 2 || c.currency.get(i) == 5 || c.currency.get(i) == 10) {
                                if (res.get(i) > 0) {
                                    System.out.println("Antal " + c.currency.get(i) + "-kronor: " + res.get(i));
                                }
                            } else {
                                if (res.get(i) > 0) {
                                    System.out.println("Antal " + c.currency.get(i) + "-lappar: " + res.get(i));
                                }
                            }


                        }
                        System.out.println("Växel blir: " + change);

                    }

                }
            } else {
                System.out.println("Fel inmatning");
            }
        }
    }


    public static void main(String[] args) {
        Huvudklass h = new Huvudklass();
    }
}
