package sprint1.inlämning1;

public abstract class Växter implements Utskrift{
    private String namn;
    private double längd;

    public Växter(){};
    public Växter(double längd, String namn) {
        this.längd = längd;
        this.namn = namn.trim().toLowerCase();
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
