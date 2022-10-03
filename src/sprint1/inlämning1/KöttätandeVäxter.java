package sprint1.inlämning1;

public class KöttätandeVäxter extends Växter{

    final String vätsketyp = "proteindryck";
    public KöttätandeVäxter() {
        super(0.7, "meatloaf");

    }


    @Override
    public void vätskInfo() {
        System.out.println(getNamn() + " behöver " + (0.1 + 0.2 * getLängd()) + " liter " + vätsketyp + " per dag.");

    }

}
