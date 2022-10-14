package sprint2.övning2;

import javax.swing.*;
import java.util.Scanner;

public class Huvudklass {
    public Huvudklass(){
        Car car = new Car();
        Scanner scan = new Scanner(System.in);
        String temp;
        double svar;

        try {
            while (true) {
                System.out.println("Dagens mätarställning: ");
                if (scan.hasNextLine()) {
                    temp = scan.nextLine();
                    svar = Double.parseDouble(temp);
                    car.setDagensMätarställning(svar);
                }
                System.out.println("Förra årets mätarställning:");
                if (scan.hasNextLine()) {
                    temp = scan.nextLine();
                    svar = Double.parseDouble(temp);
                    car.setFörraÅretsMätarställning(svar);
                }
                System.out.println("Antal liter bensin som förbrukas per år: ");
                if (scan.hasNextLine()) {
                    temp = scan.nextLine();
                    svar = Double.parseDouble(temp);
                    car.setBensinFörbrukningPerÅr(svar);
                }

                System.out.println("Antal körda mil: " + car.getAntalMil() + "\nAntal liter besin: " +
                        car.getBensinFörbrukningPerÅr() + "\nFörbrukning per mil: " + car.getBensinFörbrukning());

            }
        }catch (Exception e){
            System.out.println(e.getMessage());

        }

       /* try{

            while (true) {

                String s = (JOptionPane.showInputDialog(null, "Dagens mätarställning:"));
                double s1 = Double.parseDouble(s);
                car.setDagensMätarställning(s1);
                s = (JOptionPane.showInputDialog(null, "Förra årets mätarställning:"));
                s1 = Double.parseDouble(s);
                car.setFörraÅretsMätarställning(s1);
                s = (JOptionPane.showInputDialog(null, "Antal liter bensin som förbrukas per år: "));
                s1 = Double.parseDouble(s);
                car.setBensinFörbrukningPerÅr(s1);

                System.out.println("Antal körda mil: " + car.getAntalMil() + "\nAntal liter besin: " +
                        car.getBensinFörbrukningPerÅr() + "\nFörbrukning per mil: " + car.getBensinFörbrukning());

            }
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

        */


    }

    public static void main(String[] args) {
        Huvudklass h = new Huvudklass();
    }
}
