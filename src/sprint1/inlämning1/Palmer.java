package sprint1.inlämning1;

public class Palmer extends Växter{

    public Palmer(String namn, double längd) {

        super(längd, namn, Vätsketyp.KRANVATTEN, (längd * 3));

    }

    @Override //interface
    public void vätskeInfo() {

        System.out.println(getNamn() + " behöver " + getVätskeMängd() + " liter " + getVätsketyp() + " per dag.");

    }

}
