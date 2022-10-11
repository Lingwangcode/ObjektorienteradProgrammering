package sprint2.övning1;

public class Triangel implements Figure{

    private int höjd;
    private int bredd;


    public Triangel(int höjd, int bredd) {
        this.höjd = höjd;
        this.bredd = bredd;
    }

    public int getHöjd() {
        return höjd;
    }

    public int getBredd() {
        return bredd;
    }

    public boolean likbenTriangel(){
        if (höjd == bredd)
            return true;
        else
            return false;
    }
    @Override
    public int getArea() {
        int area = höjd * bredd / 2;
        return area;
    }

    @Override
    public int getCircumference() {
        int circumference = höjd * 3;
        return circumference;
    }
}
