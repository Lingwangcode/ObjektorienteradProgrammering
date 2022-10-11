package sprint1.övning3;

import sprint1.inlämning1.Huvudklass;

import java.util.ArrayList;
import java.util.List;

public class Huvudprogram {

    public Huvudprogram(){
        Student ling = new Student("Ling", 30);
        Student johan = new Student("Johan", 40);
        Student erika = new Student("Erika", 29);

        List<Student> allStudents = new ArrayList<>();
        allStudents.add(ling);
        allStudents.add(johan);
        allStudents.add(erika);

        Lärare sigrun = new Lärare("Sigrun", 36);
        Lärare david = new Lärare("David", 36);

        Kurs java1 = new Kurs("Java1");
        Kurs java2 = new Kurs("Java2");

        List<Kurs> allKurs = new ArrayList<>();
        allKurs.add(java1);
        allKurs.add(java2);

        java1.moreStudentsToTheCourse(ling);
        java1.moreStudentsToTheCourse(johan);
        java1.moreStudentsToTheCourse(erika);

        java2.moreStudentsToTheCourse(ling);
        java2.moreStudentsToTheCourse(johan);
        java2.moreStudentsToTheCourse(erika);

        java1.teacherToTheCourse(sigrun);
        java2.teacherToTheCourse(david);

        sigrun.moreCoursesToTeach(java1);
        david.moreCoursesToTeach(java2);

        ling.moreCourses(java1);
        johan.moreCourses(java1);
        erika.moreCourses(java1);

        ling.moreCourses(java2);
        johan.moreCourses(java2);
        erika.moreCourses(java2);

        printOut(allStudents);
        printClassLista(allKurs);
    }

    public void printClassLista(List<Kurs> allKurs){

        for (Kurs k : allKurs){
            if (k != null){
                System.out.println(k.getCourseName());
                if (k.getTeacher() != null){
                    System.out.println("Lärare: " + k.getTeacher().getName());
                }
                for (int i = 0; i < k.getStudents().size(); i ++){
                    if (k.getStudents() != null) {
                        System.out.println("Studenter: " + k.getStudents().get(i).getName());
                    }
                }
                System.out.println();
            }
        }

    }
    public void printOut(List<Student> allStudents){
        for (Student s : allStudents){
            if (s != null){
                System.out.println("Student: " + s.getName());
                for (Kurs k: s.getMyCourses()) {
                    if (k != null){
                        System.out.println("Kurs: " + k.getCourseName());
                    }
                }
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        Huvudprogram hv = new Huvudprogram();
    }
}



