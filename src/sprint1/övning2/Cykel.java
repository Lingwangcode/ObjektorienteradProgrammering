package sprint1.övning2;

public class Cykel extends Fordon implements Printable{
    private int antalVäxlar;
    private int växelJustNu;

    public Cykel(int hastighet, double vikt, int antalVäxlar, int växelJustNu) {
        super(hastighet, vikt);
        this.antalVäxlar = antalVäxlar;
        this.växelJustNu = växelJustNu;
    }

    public int getAntalVäxlar() {
        return antalVäxlar;
    }

    public int getVäxelJustNu() {
        return växelJustNu;
    }

    public void växla(){

    }

    @Override
    public void printMe() {
        System.out.println("\nCyckeln har antal växlar: " +getAntalVäxlar() + "\nVäxel just nu är " + getVäxelJustNu() +
                "\nHastigheten nu är " + getHastighet() + "\nVikten är " + getVikt());
    }

    @Override
    public void printUt() {
        System.out.println("printUt()");
        System.out.println("\nBilen har antal växlar: " +getAntalVäxlar() + "\nVäxel just nu är: " + getVäxelJustNu() +
                "\nHastigheten nu är: " + getHastighet() + "\nVikten är: " + getVikt());
    }
}
