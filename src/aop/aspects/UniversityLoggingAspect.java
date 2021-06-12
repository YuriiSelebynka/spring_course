package aop.aspects;

import aop.Student;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Aspect
public class UniversityLoggingAspect {

//    @Before("execution(* getStudents())")
//    public void beforeGetStudentsLoggingAdvice() {
//        System.out.println("beforeGetStudentsLoggingAdvice: логуємо одержання " +
//                "списка студентів перед методом getStudents");
//    }

//    @AfterReturning(pointcut = "execution(* getStudents())",
//    returning = "students")
//    public void afterReturningStudentsLoggingAdvice(List<Student> students) {
//        Student firstStudent = students.get(0);
//
//        String nameSurname = firstStudent.getNameSurname();
//        nameSurname = "Mr. " + nameSurname;
//        firstStudent.setNameSurname(nameSurname);
//
//        double avgGrade = firstStudent.getAvgGrade();
//        avgGrade = avgGrade + 1;
//        firstStudent.setAvgGrade(avgGrade);
//
//        System.out.println("afterReturningStudentsLoggingAdvice: логуємо одержання " +
//                "списка студентів після роботи метода getStudents");
//    }

//    @AfterThrowing(pointcut = "execution(* getStudents())",
//    throwing = "exception")
//    public void afterThrowingGetStudentsLoggingAdvice(Throwable exception) {
//        System.out.println("afterThrowingGetStudentsLoggingAdvice: логуємо викид " +
//                "винятка " + exception);
//    }

    @After("execution(* getStudents())")
    public void afterGetStudentsLoggingAdvice() {
        System.out.println("afterGetStudentsLoggingAdvice: логуємо нормальне " +
                "закінчення роботи метода aчи викид винятка");
    }
}
