package sprint1.övning2;

import java.util.ArrayList;
import java.util.List;

public class HuvudprogramFordon {
    List<Fordon> fordonList = new ArrayList<>();
    List<Printable> fordonList1 = new ArrayList<>();

    public HuvudprogramFordon() {
        Bil bil = new Bil(4, 3, 80, 1880.9);
        Båt båt = new Båt(60, 5005.9, 4000.85);
        Tåg tåg = new Tåg(50, 8000.5, 10);
        Cykel cykel = new Cykel(20, 85, 3, 1);

        Fordon f = new Bil(3, 2, 50, 2020.50);

        fordonList.add(bil);
        fordonList.add(båt);
        fordonList.add(tåg);
        fordonList.add(cykel);
        fordonList.add(f);

        printOut(fordonList);

        Printable bil1 = new Bil(4, 3, 80, 1880.9);
        Printable båt1 = new Båt(60, 5005.9, 4000.85);
        Printable tåg1 = new Tåg(50, 8000.5, 10);
        Printable cykel1 = new Cykel(20, 85, 3, 1);

        fordonList1.add(båt1);
        fordonList1.add(tåg1);
        fordonList1.add(cykel1);
        fordonList1.add(bil1);

        printOut2(fordonList1);


    }

    public void printOut(List<Fordon> fordonList) {
        for (Fordon i : fordonList) {
            i.printMe();
        }

    }

    public void printOut2(List<Printable> fordonList1) {
        for (Printable fordon : fordonList1) {
            fordon.printUt();
        }
    }
    public static void main(String[]args){
            HuvudprogramFordon h = new HuvudprogramFordon();
    }


}