package sprint1.inlämning1;

public class Palmer extends Växter{

    public Palmer(String namn, double längd) {
        super(längd, namn, Vätsketyp.KRANVATTEN, (längd * 3));

    }

    @Override //interface
    public void vätskInfo() {

        System.out.println(getNamn() + " behöver " + getVätskaMängd() + " liter " + getVätsketyp() + " per dag.");
    }



}
