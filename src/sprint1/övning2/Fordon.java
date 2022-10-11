package sprint1.övning2;

public abstract class Fordon {
    private int hastighet;
    private double vikt;


    public Fordon(){};

    public Fordon(int hastighet, double vikt){
        this.hastighet = hastighet;
        this.vikt = vikt;
    }

    public int getHastighet() {
        return hastighet;
    }

    public double getVikt() {
        return vikt;
    }

    public int ändraHastighet(int hastighet){
        return hastighet;
    }
     public abstract void printMe();
}
