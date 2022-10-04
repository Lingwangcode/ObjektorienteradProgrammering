package sprint1.inlämning1;

public abstract class Växter implements Utskrift{
    private String namn;
    private double längd;
    private Vätsketyp vätsketyp; //Enum

    public Växter(){};
    public Växter(double längd, String namn, Vätsketyp vätsketyp) {
        this.längd = längd;
        this.namn = namn.trim().toLowerCase();
        this.vätsketyp = vätsketyp;
    }

    public Vätsketyp getVätsketyp() {
        return vätsketyp;
    }

    public String getNamn() {
        return namn;
    }

    public double getLängd() {
        return längd;
    }

    @Override
    public void vätskInfo() {

    }
}
