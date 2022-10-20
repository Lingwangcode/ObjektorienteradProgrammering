package sprint2.inlämning2;

import sprint1.inlämning1.Huvudklass;

import javax.swing.*;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class HuvudProgram {

    BestGymEver f = new BestGymEver();

    public HuvudProgram() throws IOException {

        f.readCustomers();
        f.getMember();
        f.checkMembership();

    }

    public static void main(String[] args) {
        try {

            HuvudProgram h = new HuvudProgram();

        }
        catch (IOException e){
            System.out.println("Det gick inte att läsa filen");
            e.printStackTrace();
        }
        catch (IndexOutOfBoundsException e){
            System.out.println("Fel med innehållet i filen");
            e.printStackTrace();
        }

    }
}
