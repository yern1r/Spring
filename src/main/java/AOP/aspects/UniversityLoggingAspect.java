package AOP.aspects;

import AOP.Student;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Aspect
public class UniversityLoggingAspect {
//    @Before("execution(* getStudents())")
//    public void beforeGetStudentsLoggingAdvice(){
//        System.out.println("beforeGetStudentsLoggingAdvice : logging of getting -> list of students before method getStudents" );
//    }

//    @AfterReturning(pointcut = "execution(* getStudents())",
//            returning = "students")
//    public void afterGetStudentsLoggingAdvice(List<Student> students){
//
//        Student firstStudent = students.get(0);
//        String nameSurname = firstStudent.getNameStudent();
//        nameSurname = " Mr  " + nameSurname;
//        firstStudent.setNameStudent(nameSurname);
//
//        double avgGrade = firstStudent.getAvgGrade();
//        avgGrade = avgGrade+0.5;
//        firstStudent.setAvgGrade(avgGrade);
//
//        System.out.println("afterGetStudentsLoggingAdvice : logging of getting -> list of students after method getStudents" );
//    }

//    @AfterThrowing(pointcut = "execution(* getStudents())", throwing = "exception")
//    public void afterThrowingGetStudentsLoggingAdvice(Throwable exception){
//        System.out.println("afterThrowingGetStudentsLoggingAdvice: logging of throwing exception --> " + exception);
//    }

    @After ("execution(* getStudents())")
    public void afterGetStudentLoggingAdvice(){
        System.out.println("afterGetStudentLoggingAdvice: logging normally ending of method or exception");
    }
}