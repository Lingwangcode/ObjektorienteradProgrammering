package sprint2.övning5;
import static javax.swing.JOptionPane.*;
import java.util.*;
public class ExceptionTest {
    public static void main (String[] arg) {
        String indata = showInputDialog
                ("Ange antal dagar, pris per dag samt bilmodell");

        try{
            Scanner sc = new Scanner(indata);
            int antalDagar  = sc.nextInt();
            double dagsPris = sc.nextDouble();
            String bil = sc.next();
            double totPris = dagsPris * antalDagar;
            String s = String.format("Totalt pris för %s: %.2f",
                    bil, totPris);
            showMessageDialog(null, s);
        }
        catch (InputMismatchException e){
            e.printStackTrace();
            System.out.println("Imputmismatchexception called");
        }
        catch (NoSuchElementException e){
            e.printStackTrace();
            System.out.println("NoSuchElementException fel");
        }
        catch(Exception e){
            e.printStackTrace();
            System.out.println("exception called");
        }

       // catch(Exception e){
          //  e.printStackTrace();
       // }

    }
}
