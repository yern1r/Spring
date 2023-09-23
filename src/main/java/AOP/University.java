package AOP;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class University {
    private List<Student> students = new ArrayList<>();

    public void addStudents() {
        Student st1 = new Student("Bagdat", 4, 3.2);
        Student st2 = new Student("Ershat", 3, 2.2);
        Student st3 = new Student("Sultan", 2, 3.7);

        students.add(st1);
        students.add(st2);
        students.add(st3);
    }

    public List<Student> getStudents(){
        System.out.println(" Information about getStudents  : ");
        System.out.println(students);
        return students;
    }
}
