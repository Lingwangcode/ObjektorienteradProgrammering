package sprint1.inlämning1;

public class Kaktusar extends Växter{

    final double vätskBehov = 0.2;


    public Kaktusar() {
        super(2, "igge", Vätsketyp.MINERALVATTEN);
    }

    @Override
    public void vätskInfo() {
        System.out.println(getNamn() + " behöver " + vätskBehov + " liter " + getVätsketyp() +" per dag.");
    }
}
