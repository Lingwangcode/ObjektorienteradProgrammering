package sprint2.övning3;

import java.util.Scanner;

public class ScannerTest {

    public ScannerTest(){
        Scanner scanner = new Scanner(System.in);
        String s = "";
        while(true){
            if (scanner.hasNextLine()){
                s = scanner.nextLine();
                System.out.println("Du skrev: " + s);
            }
        }
    }
    public static void main(String[] args) {
        ScannerTest s = new ScannerTest();
    }
}
