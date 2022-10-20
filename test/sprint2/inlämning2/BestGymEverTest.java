package sprint2.inlämning2;

import org.junit.jupiter.api.Test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

class BestGymEverTest {

    BestGymEver b = new BestGymEver();
    Customer c1 = new Customer("Alhambra Aromes", "7703021234", "2022-07-01");
    Customer c2 = new Customer("Emma Wang", "8204021234", "2019-12-02");
    @Test
    public void isDateWithinAYearTest() {
        assert (b.isDateWithinAYear(c1));
        assert (!b.isDateWithinAYear(c2));
    }

    @Test
    public void readCustomersTest(){
        try {

            List<Customer> c = b.readCustomers();

            assert (c.get(0).getName().equals("alhambra aromes"));
            assert (c.get(0).getSocialSecurityNo().equals("7703021234"));
            assert (c.get(0).getMenbershipDate().equals("2022-07-01"));
            assert (c.get(13).getName().equals("nahema ninsson"));
            assert (c.get(13).getSocialSecurityNo().equals("7805211234"));
            assert (c.get(13).getMenbershipDate().equals("2022-08-04"));
            assert (c.size() == 14);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void writeCustomerTest(){

        b.writeCustomers(c2);

        try(Scanner scan = new Scanner("test/sprint2/inlämning2/customers1.txt")){

            while (scan.hasNextLine()) {
                String f = scan.nextLine();
                System.out.println(f);
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}