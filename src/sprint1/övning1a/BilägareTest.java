package sprint1.övning1a;

public class BilägareTest {
    public static void main(String[] args) {
        Bilägare person1 = new Bilägare("John", "Ekebydalsvägen 1", 43);
        Bilägare person2 = new Bilägare("Olle", "Tallhammarsvägen 2", 54);
        Bilägare person3 = new Bilägare("Johanna", "Kungsvägen 7", 34);
        Bil bil1 = new Bil("DEW123", "OS28", "Volvo");
        Bil bil2 = new Bil("NUY456", "TX33", "BMW");

        bil1.carSales(person1);
        bil2.carSales(person2);
        bil1.carBuyer();
        bil2.carSales(person3);

        printBil(bil1);
        printBil(bil2);

    }
    private static void printBil(Bil bil){
        if (bil.getOwner() == null){
            System.out.println("Bilen med regnummer " + bil.getRegisterNr() + " har ingen ägare");
        }
        else {
            System.out.println("Bilen med regnummer " + bil.getRegisterNr() + " är av typen "
                    + bil.getModell() + " och ägs av "+ bil.getOwner().getName());
        }
    }
}
