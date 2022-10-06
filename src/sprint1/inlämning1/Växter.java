package sprint1.inlämning1;

public abstract class Växter implements Utskrift{
    private String namn;
    private double längd;
    private double vätskeMängd;
    private Vätsketyp vätsketyp; //Enum

    public Växter(double längd, String namn, Vätsketyp vätsketyp, double vätskeMängd) {
        this.längd = längd;
        this.namn = namn.toLowerCase();
        this.vätsketyp = vätsketyp;
        this.vätskeMängd = vätskeMängd;
    }

    public Vätsketyp getVätsketyp() {
        return vätsketyp;
    }

    public double getVätskeMängd() { return vätskeMängd; }

    public String getNamn() {
        return namn;
    }

    public double getLängd() {
        return längd;
    }

    @Override //Interface
    public void vätskeInfo() {
        System.out.println("Default vätskeInfo");
    }
}
