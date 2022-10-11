package sprint1.övning1a;

public class Bil{
    private String registerNr;
    private String modell;
    private String make;
    Bilägare owner;



    public Bil(String registerNr, String modell, String make) {
        this.registerNr = registerNr;
        this.modell = modell;
        this.make = make;
    }



    public String getModell() {
        return modell;
    }

    public String getRegisterNr() {
        return registerNr;
    }

    public Bilägare getOwner() {
        return owner;
    }

    public void carSales(Bilägare nyägare){
        owner = nyägare;
    }
    public void carBuyer(){
        owner = null;
    }


    public String getMake() {
        return make;
    }

}
