package sprint1.inlämning1;

public class Kaktusar extends Växter{

    public Kaktusar() {

        super(2, "igge", Vätsketyp.MINERALVATTEN,0.2 );

    }

    @Override //Interface
    public void vätskeInfo() {
        System.out.println(getNamn() + " behöver " + getVätskeMängd() + " liter " + getVätsketyp() +" per dag.");
    }
}
