package sprint2.inlämning2;

import sprint1.inlämning1.Huvudklass;

import javax.swing.*;
import java.nio.file.Path;
import java.nio.file.Paths;

public class HuvudProgram {

    Customer c = new Customer();
    FilterUtil f = new FilterUtil();

    final Path p = Paths.get("test/sprint2/inlämning2/customers.txt");
    final Path write = Paths.get("test/sprint2/inlämning2/customers1.txt");

    public HuvudProgram(){

        f.readCustomers(p);
        f.getMember();

        while (true) {

            String svar = JOptionPane.showInputDialog(null, "Vänligen skriv in ditt för- och efternamn " +
                    "eller personnummer: ");

            if (svar == null || svar.isBlank()) {
                break;
            }

            String input = svar.trim().toLowerCase();

            f.checkMembership(write, input);

        }

    }

    public static void main(String[] args) {
        HuvudProgram h = new HuvudProgram();
    }
}
