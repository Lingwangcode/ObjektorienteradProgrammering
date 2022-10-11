package sprint1.övning3;

import java.util.ArrayList;
import java.util.List;

public class Kurs{

    private String courseName;
    private Lärare teacher;
    private List<Student> students;
    private int studentCounter = 0;


    public Kurs(String courseName ) {
        this.courseName = courseName;
        students = new ArrayList<>();
    }

    public String getCourseName() {
        return courseName;
    }

    public Lärare getTeacher() {
        return teacher;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void moreStudentsToTheCourse(Student student){
        students.add(student);
    }
    public void teacherToTheCourse(Lärare teacher){
        this.teacher = teacher;
    }

    public void tackAwayTeacher(){
        teacher = null;
    }
}
