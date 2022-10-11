package sprint1.övning2;

public class Bil extends Fordon implements Printable{
    private int antalVäxlar;
    private int växelJustnu;

    public Bil(int antalVäxlar, int växelJustnu, int hastighet, double vikt){
        super(hastighet, vikt);
        this.antalVäxlar = antalVäxlar;
        this.växelJustnu = växelJustnu;
    }

    public int getAntalVäxlar() {
        return antalVäxlar;
    }

    public int getVäxelJustNu() {
        return växelJustnu;
    }

    public void växla(){

    }

    @Override
    public void printMe() {
        System.out.println("\nBilen har antal växlar: " +getAntalVäxlar() + "\nVäxel just nu är: " + getVäxelJustNu() +
                "\nHastigheten nu är: " + getHastighet() + "\nVikten är: " + getVikt());

    }

    @Override
    public void printUt() {
        System.out.println("printUt()");
        System.out.println("\nBilen har antal växlar: " +getAntalVäxlar() + "\nVäxel just nu är: " + getVäxelJustNu() +
                "\nHastigheten nu är: " + getHastighet() + "\nVikten är: " + getVikt());
    }
}
