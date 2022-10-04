package sprint1.inlämning1;

public class KöttätandeVäxter extends Växter{


    public KöttätandeVäxter(double längd) {
        super(längd, "meatloaf", Vätsketyp.PROTEINDRYCK, (0.1 + (0.2 * längd)));
    }


    @Override
    public void vätskInfo() {
        System.out.println(getNamn() + " behöver " + getMängdVätska() + " liter " + getVätsketyp() + " per dag.");

    }

}
