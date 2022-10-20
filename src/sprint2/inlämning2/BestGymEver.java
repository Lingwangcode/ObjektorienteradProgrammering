package sprint2.inlämning2;

import sprint1.inlämning1.Växter;

import javax.swing.*;
import java.beans.Customizer;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.Instant;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class BestGymEver {

    final Path p = Paths.get("test/sprint2/inlämning2/customers.txt");
    final Path write = Paths.get("test/sprint2/inlämning2/customers1.txt");
    private List<Customer> memberList = new ArrayList<>(); //Sparar giltiga medlemar
    private List<Customer> memberBefore = new ArrayList<>();// Sparar medlemar vars medlemskap har gått ut.


    public boolean isDateWithinAYear(Customer m) throws DateTimeParseException{ //kollar ifall datum passerat 1 år.

            LocalDate menbershipDate = LocalDate.parse(m.getMenbershipDate());
            LocalDate now = LocalDate.now();
            LocalDate aYearAgo = now.minusYears(1).minusDays(1);

            return ((menbershipDate.isAfter(aYearAgo)) & (menbershipDate.isBefore(now)));

    }

    public List<Customer> readCustomers() throws IOException, IndexOutOfBoundsException { //Läser customersfil, sparar i customerList

        List <Customer> customerList = new ArrayList<>();

        try(Scanner scan = new Scanner(p)){
            while (scan.hasNextLine()){
                String firstLine = scan.nextLine();
                String secondLine = scan.nextLine();

                String[] firstrow = firstLine.split(",");

                Customer m = new Customer(firstrow[1].trim().toLowerCase(), firstrow[0].trim(), secondLine.trim());
                customerList.add(m);

            }
        }
        return customerList;
    }

    public void getMember() throws IOException { // går igenom customerlista, delar dem i två listor.

        try {
            for (Customer m : readCustomers()) {

                if (isDateWithinAYear(m)) {
                    memberList.add(m);
                } else {
                    memberBefore.add(m);
                }
            }
        }
        catch (DateTimeParseException e){
            System.out.println("Fel datumformatet i customersfilen");
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

    public void checkMembership() throws IOException {

            String svar = JOptionPane.showInputDialog(null, "Vänligen skriv in ditt för- och efternamn " +
                    "eller personnummer: ");

            if (svar == null || svar.isBlank()) {
                return;
            }

            String input = svar.trim().toLowerCase();


            for (int i = 0; i < readCustomers().size(); i++) {

                if (input.equals(readCustomers().get(i).getName()) || input.equals(readCustomers().get(i).getSocialSecurityNo())) {

                    for (int j = 0; j < memberList.size(); j++) {

                        if (input.equals(memberList.get(j).getName()) || input.equals(memberList.get(j).getSocialSecurityNo())) {

                            System.out.println("Välkommen!");
                            writeCustomers(memberList.get(j));
                            return;
                        }
                    }

                    for (int b = 0; b < memberBefore.size(); b++) {

                        if (input.equals(memberBefore.get(b).getName()) || input.equals(memberBefore.get(b).getSocialSecurityNo())) {

                            System.out.println("Ditt medlemskap har tyvärr gått ut.");
                            return;

                        }
                    }
                }

            }

            if (input != null) {
                System.out.println("namnet / personnummer du angivit finns inte i vår medlemlista. " +
                        "Vänligen kontrollera och försök igen.");
            }
    }

    public void writeCustomers(Customer m){

        try(BufferedWriter bw = new BufferedWriter(new FileWriter(write.toFile(), true))){

                LocalDate ld = LocalDate.now();
                bw.write(m.getName() + ", " + m.getSocialSecurityNo() + " \nBesökt datum: " + ld + "\n");

        }
        catch (IOException e){
            e.printStackTrace();
        }
    }


}
