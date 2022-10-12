package sprint2.övning2;

public class Car {
    private double dagensMätarställning;
    private double förraÅretsMätarställning;
    private double bensinFörbjukningPerÅr;

    private double antalMil;

    public Car(){};

    public void setDagensMätarställning(double dagensMätarställning) {
        this.dagensMätarställning = dagensMätarställning;
    }

    public void setFörraÅretsMätarställning(double förraÅretsMätarställning) {
        this.förraÅretsMätarställning = förraÅretsMätarställning;
    }

    public Car(double dagensMätarställning, double förraÅretsMätarställning) {
        this.dagensMätarställning = dagensMätarställning;
        this.förraÅretsMätarställning = förraÅretsMätarställning;
    }

    public double getBensinFörbrukningPerÅr() {
        return bensinFörbjukningPerÅr;
    }

    public void setBensinFörbrukningPerÅr(double bensinFörbjukningPerÅr) {
        this.bensinFörbjukningPerÅr = bensinFörbjukningPerÅr;
    }

    public double getDagensMätarställning() {
        return dagensMätarställning;
    }

    public double getFörraÅretsMätarställning() {
        return förraÅretsMätarställning;
    }
    public double getAntalMil(){
        antalMil = getDagensMätarställning() - getFörraÅretsMätarställning();
        return antalMil;
    }

    public double getBensinFörbrukning(){
        return  (bensinFörbjukningPerÅr / antalMil);
    }

}
