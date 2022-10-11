package sprint1.övning3;

import java.util.ArrayList;
import java.util.List;

public class Student extends Person{

    private List<Kurs> myCourses;
    private int coursCounter = 0;

    public Student(String name, int age) {
        super(name, age);
        myCourses = new ArrayList<>();
    }

    public void moreCourses(Kurs kurs){
        myCourses.add(kurs);
    }

    public List<Kurs> getMyCourses() {
        return myCourses;
    }

}
