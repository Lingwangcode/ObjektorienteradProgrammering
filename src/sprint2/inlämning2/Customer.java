package sprint2.inlämning2;

import java.util.List;

public class Customer {

    private String name;
    private String socialSecurityNo;
    private String menbershipDate;


    public Customer(String name, String socialSecurityNo, String menbershipDate) {
        this.name = name;
        this.socialSecurityNo = socialSecurityNo;
        this.menbershipDate = menbershipDate;
    }

    public String getName() {
        return name;
    }

    public String getSocialSecurityNo() {
        return socialSecurityNo;
    }

    public String getMenbershipDate() {
        return menbershipDate;
    }


}
