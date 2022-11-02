package sprint2.övning11;

import javax.swing.*;
import java.time.Duration;
import java.time.LocalTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Locale;
import java.util.Scanner;

public class Videobandspelare {

    public double resBandLength(double bandLength, double usedLength){
        double resLength = bandLength - usedLength;
        return resLength;
    }

    public double countLength(LocalTime time1, LocalTime time2){

        Duration d = Duration.between(time1, time2);

        return d.getSeconds()/60;
    }

    public LocalTime parseToLocalTime(String string){
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm");
        LocalTime time = LocalTime.parse(dtf.format(LocalTime.parse(string)));

        return time;
    }

    public boolean isLengthEnough(double d){
        if (d < 0){
            return false;
        }
        else {
            return true;
        }
    }

    public void dialog(){
        try {
            while (true) {
                String answer = JOptionPane.showInputDialog(null, "Videobandets längd?");
                if (answer == null || answer.isBlank()){
                    break;
                }
                double bandLength = Double.parseDouble(answer);
                answer = JOptionPane.showInputDialog(null, "Hittills använd tid av bandet?");
                double usedLength = Double.parseDouble(answer);
                double res1 = resBandLength(bandLength, usedLength);

                answer = JOptionPane.showInputDialog(null, "Vilken tid börjar tv-programmet?");
                String answer2 = JOptionPane.showInputDialog(null, "Vilken tid avslutar tv-programmet?");
                Double tvProgramLength = countLength(parseToLocalTime(answer), parseToLocalTime(answer2)); // antal minuter tv-program
                LocalTime now = LocalTime.now();
                System.out.println(now);
                LocalTime programStart = parseToLocalTime(answer);
                double betweenPrograms = countLength(now, programStart); // antal minuter mellan nu och programmets start.
                double res2 = resBandLength(res1, betweenPrograms); // längden kvar på bandet från tv-programmet start.
                double res3 = resBandLength(res2, tvProgramLength); //längden kvar på bandet från tv-programmet slut.


                if (isLengthEnough(res3) == true) {

                    System.out.println("Tv-program får plats i bandet");
                    System.out.println(res3);
                } else {
                    double overLength = Math.abs(res3);
                    System.out.println("Tv-program får INTE plats i bandet, den är " + overLength + " min för lång");
                }
            }
        }catch (NumberFormatException e){
            System.out.println("Inmatning är inte ett nummer");
            e.printStackTrace();
        }catch (DateTimeParseException e){
            System.out.println("Du har angett fel tids format! (Rätt format HH:mm) ");
            e.printStackTrace();
        }

    }
}
