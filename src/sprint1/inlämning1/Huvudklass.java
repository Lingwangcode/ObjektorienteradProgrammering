package sprint1.inlämning1;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class Huvudklass {
    public Huvudklass(){

        Palmer palmenLaura = new Palmer("laura", 5);
        Palmer palmenPutte = new Palmer("putte",1);
        KöttätandeVäxter meatloaf = new KöttätandeVäxter();

        Växter kaktusenIgge = new Kaktusar(); //Polymofism

        while(true){
            String svar = JOptionPane.showInputDialog(null,"Vilken växt ska få vätska?");
            if (svar == null || svar.isBlank()) {

                System.out.println("Programmet avslutas");
                break;
            }

            if(svar.trim().toLowerCase().equals(palmenLaura.getNamn())){
                palmenLaura.vätskInfo();
            }
            else if (svar.trim().toLowerCase().equals(palmenPutte.getNamn())){
                palmenPutte.vätskInfo();
            }
            else if (svar.trim().toLowerCase().equals(meatloaf.getNamn())){
                meatloaf.vätskInfo();
            }
            else if (svar.trim().toLowerCase().equals(kaktusenIgge.getNamn())){
                kaktusenIgge.vätskInfo();
            }
            else
                System.out.println("Fel växtnamn, försök igen!");

        }


    }

    public static void main(String[] args) {
        Huvudklass hv = new Huvudklass();
    }
}
