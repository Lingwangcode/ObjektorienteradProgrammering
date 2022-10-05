package sprint1.inlämning1;

public class Kaktusar extends Växter{

    public Kaktusar() {
        super(2, "igge", Vätsketyp.MINERALVATTEN,0.2 );
    }


    @Override //Interface
    public void vätskInfo() {
        System.out.println(getNamn() + " behöver " + getMängdVätska() + " liter " + getVätsketyp() +" per dag.");
    }
}
