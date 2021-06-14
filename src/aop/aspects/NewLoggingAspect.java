package aop.aspects;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class NewLoggingAspect {

    @Around("execution(public String returnBook())")
    public Object aroundReturnBookLoggingAdvice(ProceedingJoinPoint proceedingJoinPoint)
            throws Throwable {
        System.out.println("aroundReturnBookLoggingAdvice: в бібліотеку " +
                "намагаються повернути книгу");

        Object targetMethodResult = null;
//        long begin = System.currentTimeMillis();
        try {
            targetMethodResult = proceedingJoinPoint.proceed();
        }
        catch (Exception e) {
            System.out.println("aroundReturnBookLoggingAdvice: був спійманий " +
                    "виняток " + e);
            throw e;
        }

//        targetMethodResult = "Злочин і покарання";
//        long end = System.currentTimeMillis();

        System.out.println("aroundReturnBookLoggingAdvice: в бібліотеку " +
                "успішно повернули книгу");
//        System.out.println("aroundReturnBookLoggingAdvice: метод returnBook " +
//                "виконав роботу за " + (end - begin) + " мілісекунд");
        return targetMethodResult;
    }
}
