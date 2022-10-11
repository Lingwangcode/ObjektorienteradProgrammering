package sprint1.övning2;

public class Tåg extends Fordon implements Printable{
    private int antalVagnar;

    public Tåg(int hastighet, double vikt, int antalVagnar) {
        super(hastighet, vikt);
        this.antalVagnar = antalVagnar;
    }

    public int getAntalVagnar() {
        return antalVagnar;
    }

    public void kopplaVagn(){

    }

    @Override
    public void printMe() {
        System.out.println("\nTågets hastighet är: " + getHastighet() + "\nTågets vikt är: " + getVikt() + "\nAntalvagnar: "
        + getAntalVagnar());
    }

    @Override
    public void printUt() {
        System.out.println("printUt()");
        System.out.println("\nTågets hastighet är: " + getHastighet() + "\nTågets vikt är: " + getVikt() + "\nAntalvagnar: "
                + getAntalVagnar());
    }
}
