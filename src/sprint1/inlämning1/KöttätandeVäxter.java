package sprint1.inlämning1;

public class KöttätandeVäxter extends Växter{

    public KöttätandeVäxter() {
        super(0.7, "meatloaf", Vätsketyp.PROTEINDRYCK);

    }


    @Override
    public void vätskInfo() {
        System.out.println(getNamn() + " behöver " + (0.1 + 0.2 * getLängd()) + " liter " + getVätsketyp() + " per dag.");

    }

}
