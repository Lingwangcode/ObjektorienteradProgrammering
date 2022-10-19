package sprint2.inlämning2;

import org.junit.jupiter.api.Test;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class FilterUtilTest {

    FilterUtil fu = new FilterUtil();
    Customer m1 = new Customer ("Anna Andersson", "7502031234", "2022-05-03");
    Customer m2 = new Customer ("Per Persson", "8505132345", "2019-12-29");

    Path p = Paths.get("test/sprint2/inlämning2/customers.txt");
    Path p2 = Paths.get("test/sprint2/inlämning2/customers1.txt");

    List<Customer> c = List.of(m1);


    @Test
    public void isDateWithinAYearTest(){
        assert (fu.isDateWithinAYear(m1));
        assert (!fu.isDateWithinAYear(m2));
    }

    @Test
    public void getMemberTest() {


    }
    @Test
    public void readCustomersTest() {

      /*  assert (customerList.get(0).getName().equals("Alhambra Aromes"));
        assert (customerList.get(0).getPersonNumber().equals("7703021234"));
        assert (customerList.get(0).getMenbershipDate().equals("2022-07-01"));

        assert (customerList.get(2).getName().equals("Chamade Coriola"));
        assert (customerList.get(2).getPersonNumber().equals("8512021234"));
        assert (customerList.get(2).getMenbershipDate().equals("2018-03-12"));

       */

    }




}
