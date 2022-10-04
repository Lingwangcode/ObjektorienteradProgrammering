package sprint1.inlämning1;

public class KöttätandeVäxter extends Växter{

    public KöttätandeVäxter() {
        super(0.7, "meatloaf", Vätsketyp.PROTEINDRYCK, (0.1 + (0.2 * 0.7)));

    }


    @Override
    public void vätskInfo() {
        System.out.println(getNamn() + " behöver " + getMängdVätska() + " liter " + getVätsketyp() + " per dag.");

    }

}
