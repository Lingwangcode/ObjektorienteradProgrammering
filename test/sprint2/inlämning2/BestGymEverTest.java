package sprint2.inlämning2;

import org.junit.jupiter.api.Test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.List;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

class BestGymEverTest {

    BestGymEver b = new BestGymEver();

    LocalDate date1 = LocalDate.now().minusMonths(11);
    LocalDate date2 = LocalDate.now().minusYears(1).minusDays(1);
    String dataS1 = date1.toString();
    String dataS2 = date2.toString();

    Customer c1 = new Customer("Alhambra Aromes", "7703021234", dataS1);
    Customer c2 = new Customer("Emma Wang", "8204021234", dataS2);
    @Test
    public void isDateWithinAYearTest() {
        try {

            assert (b.isDateWithinAYear(c1));
            assert (!b.isDateWithinAYear(c2));

        }catch (DateTimeParseException e){
            e.printStackTrace();
        }
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
        Path p = Paths.get("test/sprint2/inlämning2/customers1.txt");

        try(Scanner scan = new Scanner(p)){

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