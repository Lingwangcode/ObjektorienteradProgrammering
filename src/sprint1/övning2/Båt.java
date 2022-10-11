package sprint1.övning2;

public class Båt extends Fordon implements Printable{

    private double dödvikt;

    public Båt(int hastighet, double vikt, double dödvikt) {
        super(hastighet, vikt);
        this.dödvikt = dödvikt;
    }

    public double getDödvikt() {
        return dödvikt;
    }

    public void sväng (){

    }

    @Override
    public void printMe() {
        System.out.println("\nBåtens hastighet nu är: " + getHastighet() + "\nVikten är: " + getVikt() + "\nDödvikten är: "
        + dödvikt);


    }

    @Override
    public void printUt() {
        System.out.println("printUt()");
        System.out.println("\nBåtens hastighet nu är: " + getHastighet() + "\nVikten är: " + getVikt() + "\nDödvikten är: "
                + dödvikt);
    }
}
