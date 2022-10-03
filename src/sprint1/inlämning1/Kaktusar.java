package sprint1.inlämning1;

public class Kaktusar extends Växter{

    final String vätsketyp = "mineralvatten";

    final double vätskBehov = 0.2;


    public Kaktusar() {
        super(2, "igge");
    }

    @Override
    public void vätskInfo() {
        System.out.println(getNamn() + " behöver " + vätskBehov + " liter " + vätsketyp +" per dag.");
    }
}
