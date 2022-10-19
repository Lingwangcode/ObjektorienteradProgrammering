package sprint2.inlämning2;

import sprint1.inlämning1.Växter;

import javax.swing.*;
import java.beans.Customizer;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.Instant;
import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class FilterUtil {

    private List<Customer> memberList = new ArrayList<>();
    private List<Customer> memberBefore = new ArrayList<>();
    private List<Customer> customerList = new ArrayList<>();

    public boolean isDateWithinAYear(Customer m){

        LocalDate menbershipDate = LocalDate.parse(m.getMenbershipDate());
        LocalDate now = LocalDate.now();
        LocalDate aYearAgo = now.minusYears(1);

        return ((menbershipDate.isAfter(aYearAgo)) & (menbershipDate.isBefore(now)));

    }

    public void readCustomers(Path p){

        String firstLine = "";
        String secondLine = "";

        try(Scanner scan = new Scanner(p)){
            while (scan.hasNextLine()){
                firstLine = scan.nextLine();
                secondLine = scan.nextLine();

                String[] firstrow = firstLine.split(",");

                Customer m = new Customer(firstrow[1].trim().toLowerCase(), firstrow[0].trim(), secondLine.trim());
                customerList.add(m);

            }

        }
        catch (IOException e){
            e.printStackTrace();
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }


    public void getMember(){

        for (Customer m: customerList) {

            if (isDateWithinAYear(m)){
                memberList.add(m);
            }
            else{
                memberBefore.add(m);
            }
        }

    }

    public void checkMembership(Path write, String input){


        for (int i = 0; i < customerList.size(); i++) {

            if (input.equals(customerList.get(i).getName()) || input.equals(customerList.get(i).getPersonNumber())) {

                for (int j = 0; j < memberList.size(); j++) {

                    if (input.equals(memberList.get(j).getName()) || input.equals(memberList.get(j).getPersonNumber())) {

                                System.out.println("Välkommen!");
                                writeCustomers(write, memberList.get(j));
                    }
                }
                for (int b = 0; b < memberBefore.size(); b++) {

                    if (input.equals(memberBefore.get(b).getName()) || input.equals(memberBefore.get(b).getPersonNumber())) {

                                System.out.println("Ditt medlemskap har tyvärr gått ut.");

                    }
                }

            }


        }

    }

    public void writeCustomers(Path write, Customer m){

        try(BufferedWriter bw = new BufferedWriter(new FileWriter(write.toFile(), true))){

                LocalDate ld = LocalDate.now();
                bw.write(m.getName() + ", " + m.getPersonNumber() + "\n" +  m.getMenbershipDate() + " \nBesökt datum: " + ld + "\n\n");

        }
        catch (IOException e){
            e.printStackTrace();
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }

}
