package sprint1.inlämning1;

public class Palmer extends Växter{

    public Palmer(String namn, double längd) {
        super(längd, namn, Vätsketyp.KRANVATTEN, (längd * 3));

    }



    @Override //Interface
    public void vätskInfo() {

        System.out.println(getNamn() + " behöver " + getMängdVätska() + " liter " + getVätsketyp() + " per dag.");
    }



}
