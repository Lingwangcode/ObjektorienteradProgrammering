package sprint2.övning1;

import java.awt.geom.Area;

public class Square implements Figure{

    private int length;
    private int width;


    public Square(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }

    @Override
    public int getArea() {
        int area = length * width;
        return area;
    }

    @Override
    public int getCircumference() {
        int circumference = (length + width) * 2;
        return circumference;
    }
}
