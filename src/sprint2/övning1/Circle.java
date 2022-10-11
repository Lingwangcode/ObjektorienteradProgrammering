package sprint2.övning1;

public class Circle implements Figure {

    private int diameter;

    public Circle(int diameter) {
        this.diameter = diameter;
    }

    public int getDiameter() {
        return diameter;
    }

    @Override
    public int getArea() {
        int area = (int) ((Math.pow(diameter/2, 2)) * Math.PI);
        return area;
    }

    @Override
    public int getCircumference() {

        int circumference = (int) (Math.PI * diameter);
        return circumference;
    }
}
