package sprint2.övning3;

import java.util.Scanner;

public class ScannerTest {

    public ScannerTest(){
        Scanner scanner = new Scanner(System.in);
        //String s = "";
        StringBuilder s = new StringBuilder();
        while(true){
            if (scanner.hasNextLine()){
                s.append(scanner.nextLine());
                System.out.println("Du skrev: " + s);
            }
        }
    }
    public static void main(String[] args) {
        ScannerTest s = new ScannerTest();
    }
}
