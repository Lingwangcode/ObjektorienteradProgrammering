package sprint1.inlämning1;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class Huvudklass {

    List<Växter>växterList = new ArrayList<>();
    public Huvudklass(){

        Palmer palmenLaura = new Palmer("laura", 5);
        Palmer palmenPutte = new Palmer("putte",1);
        KöttätandeVäxter meatloaf = new KöttätandeVäxter();

        Växter kaktusenIgge = new Kaktusar();

        växterList.add(palmenLaura);
        växterList.add(palmenPutte);
        växterList.add(meatloaf);
        växterList.add(kaktusenIgge);

        vätskBehöv();

    }
    public void vätskBehöv(){
        while(true){
            String svar = JOptionPane.showInputDialog(null,"Vilken växt ska få vätska?");
            if (svar == null || svar.isBlank()) {

                System.out.println("Programmet avslutas");
                break;
            }

            if(svar.trim().toLowerCase().equals(växterList.get(0).getNamn())){
                växterList.get(0).vätskInfo();
            }
            else if (svar.trim().toLowerCase().equals(växterList.get(1).getNamn())){
                växterList.get(1).vätskInfo();
            }
            else if (svar.trim().toLowerCase().equals(växterList.get(2).getNamn())){
                växterList.get(2).vätskInfo();
            }
            else if (svar.trim().toLowerCase().equals(växterList.get(3).getNamn())){
                växterList.get(3).vätskInfo();
            }
            else
                System.out.println("Fel växtnamn, försök igen!");

        }

    }


    public static void main(String[] args) {
        Huvudklass hv = new Huvudklass();
    }
}
