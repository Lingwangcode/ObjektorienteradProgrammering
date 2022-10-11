package sprint1.övning3;

import java.util.ArrayList;
import java.util.List;

public class Lärare extends Person{
    private List<Kurs> myTeachCourses;
    private int teachCourseCounter = 0;


    public Lärare(String name, int age) {
        super(name, age);
        myTeachCourses = new ArrayList<>();
    }

    public void moreCoursesToTeach(Kurs kurs){
        myTeachCourses.add(kurs);
    }

    public List<Kurs> getMyTeachCourses() {
        return myTeachCourses;
    }

}
