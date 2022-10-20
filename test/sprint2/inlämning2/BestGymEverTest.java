package sprint2.inlämning2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BestGymEverTest {

    BestGymEver b = new BestGymEver();
    Customer c1 = new Customer("Alhambra Aromes", "7703021234", "2022-07-01");
    Customer c2 = new Customer("Bear Belle", "8204021234", "2019-12-02");
    @Test
    void isDateWithinAYear() {
        assert (b.isDateWithinAYear(c1));
        assert (!b.isDateWithinAYear(c2));
    }



}