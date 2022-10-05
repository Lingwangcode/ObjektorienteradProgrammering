package sprint1.inlämning1;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class Huvudklass {
    public Huvudklass(){

        Palmer palmenLaura = new Palmer("laura", 5);
        Växter palmenPutte = new Palmer("putte",1); //Polymofism
        KöttätandeVäxter meatloaf = new KöttätandeVäxter(0.7);
        Kaktusar kaktusenIgge = new Kaktusar();

        while(true){

            String svar = JOptionPane.showInputDialog(null,"Vilken växt ska få vätska?");
            if (svar == null || svar.isBlank()) {
                System.out.println("Programmet avslutas");
                break;
            }
            if(svar.toLowerCase().contains(palmenLaura.getNamn())){
                palmenLaura.vätskInfo();
            }
            else if(svar.toLowerCase().contains(palmenPutte.getNamn())){
                palmenPutte.vätskInfo();
            }
            else if (svar.toLowerCase().contains(meatloaf.getNamn())){
                meatloaf.vätskInfo();
            }
            else if (svar.toLowerCase().contains(kaktusenIgge.getNamn())){
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
