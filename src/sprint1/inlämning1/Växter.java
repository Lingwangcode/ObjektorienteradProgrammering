package sprint1.inlämning1;

public abstract class Växter implements Utskrift{
    private String namn;
    private double längd;

    private double vätskaMängd;
    private Vätsketyp vätsketyp; //Enum

    public Växter(double längd){
        this.längd = längd;
    };
    public Växter(double längd, String namn, Vätsketyp vätsketyp, double vätskaMängd) {
        this.längd = längd;
        this.namn = namn.trim().toLowerCase();
        this.vätsketyp = vätsketyp;
        this.vätskaMängd = vätskaMängd;
    }

    public Vätsketyp getVätsketyp() {
        return vätsketyp;
    }

    public double getMängdVätska() {
        return vätskaMängd;
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
