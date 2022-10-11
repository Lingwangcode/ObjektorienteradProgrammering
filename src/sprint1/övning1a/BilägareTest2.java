package sprint1.övning1a;


public class BilägareTest2 {

    public BilägareTest2(){
        Bil bil1 = new Bil("WER456", "UV78","Saab");
        Bil bil2 = new Bil("GJH789", "OV23", "Mercedes");
        Bil bil3 = new Bil("QWE123", "YX98", "Volvo");
        Bil bil4 = new Bil("LIK123", "AG90", "BMW");
        Bilägare person1 = new Bilägare("Joe", "Saluvägen2", 43);
        Bilägare person2 = new Bilägare("Victor", "Väsbyvägen 4", 34);
        bil1.carSales(person1);
        bil2.carSales(person1);
        bil2.carBuyer();
        bil2.carSales(person2);
        bil3.carSales(person2);
        bil4.carSales(person2);

        printBil(bil1);
        printBil(bil2);
        printBil(bil3);
        printBil(bil4);


    }
    private void printBil(Bil bil){
        if (bil.getOwner() == null){
            System.out.println("Bilen med regnummer " + bil.getMake() + " har ingen ägare");
        }
        else {
            System.out.println("Bilen med regnummer " + bil.getMake() + " är av typen "
                    + bil.getModell() + " och ägs av "+ bil.getOwner().getName());
        }
    }


    public static void main(String[] args) {
       BilägareTest2 biltest = new BilägareTest2();

    }
}
