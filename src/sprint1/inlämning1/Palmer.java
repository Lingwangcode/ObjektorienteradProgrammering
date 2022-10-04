package sprint1.inlämning1;

public class Palmer extends Växter{

    //private double mängdVätska;

    public Palmer(){};
    public Palmer(String namn, double längd) {
        super(längd, namn, Vätsketyp.KRANVATTEN, (längd * 3));

    }




    @Override
    public void vätskInfo() {

        System.out.println( getNamn() + " behöver " + getMängdVätska() + " liter " + getVätsketyp() + " per dag.");
    }



}
