package sprint2.inlämning2;

import java.util.List;

public class Customer {

    private String name;
    private String personNumber;
    private String menbershipDate;


    public void setName(String name) {
        this.name = name;
    }

    public void setPersonNumber(String personNumber) {
        this.personNumber = personNumber;
    }

    public Customer (){};

    public Customer(String name, String personNumber, String menbershipDate) {
        this.name = name;
        this.personNumber = personNumber;
        this.menbershipDate = menbershipDate;
    }

    public String getName() {
        return name;
    }

    public String getPersonNumber() {
        return personNumber;
    }

    public String getMenbershipDate() {
        return menbershipDate;
    }


}
