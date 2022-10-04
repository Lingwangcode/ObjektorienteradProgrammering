package sprint1.inlämning1;

public class Palmer extends Växter{


    public Palmer(){};
    public Palmer(String namn, double längd) {
        super(längd, namn, Vätsketyp.KRANVATTEN);
    }


    @Override
    public void vätskInfo() {
        System.out.println( getNamn() + " behöver " + getLängd() * 3 + " liter " + getVätsketyp() + " per dag.");
    }



}
