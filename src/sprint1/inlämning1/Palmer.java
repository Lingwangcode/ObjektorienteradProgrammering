package sprint1.inlämning1;

public class Palmer extends Växter{

    final String vätsketyp = "kranvatten";
    public Palmer(){};
    public Palmer(String namn, double längd) {
        super(längd, namn);

    }


    @Override
    public void vätskInfo() {
        //super.printOut();
        System.out.println( getNamn() + " behöver " + getLängd() * 3 + " liter " + vätsketyp + " per dag.");
    }



}
