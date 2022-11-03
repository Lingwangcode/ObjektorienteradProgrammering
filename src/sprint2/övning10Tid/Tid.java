package sprint2.övning10Tid;

import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Tid {

    public void getTimeZone(){
        Scanner scan = new Scanner(System.in);
        String toronto = "";
        String stockholm = "";
        String shanghai = "";
        while (true){

            System.out.println("Stad?");
            String svar = scan.nextLine().trim().toLowerCase();
            if(svar == null || svar.isBlank()){
                break;
            }
            if (svar.equals("toronto")){
                toronto = "America/Toronto";
                System.out.println(getRightTime(toronto));
            }
            else if (svar.equals("stockholm")){
                stockholm = "Europe/Stockholm";
                System.out.println(getRightTime(stockholm));
            }
            else if (svar.equals("shanghai")){
                shanghai = "Asia/Shanghai";
                System.out.println(getRightTime(shanghai));
            }
            else {
                System.out.println("Fel inmatning.");
            }
        }



    }
    public String getRightTime(String z){

        Instant i = Instant.now();

        ZoneId zoneId = ZoneId.of(z);
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm:ss");
        ZonedDateTime time = i.atZone(zoneId);

        return dtf.format(time);
    }


    public static void main(String[] args) {

        Tid t = new Tid();
        t.getTimeZone();
    }
}
