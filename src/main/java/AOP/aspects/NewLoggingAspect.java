package AOP.aspects;

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
        System.out.println("aroundReturnBookLoggingAdvice: trying to return a book into library");

        long begin = System.currentTimeMillis();
        Object targetMethodResult = proceedingJoinPoint.proceed();
        targetMethodResult = "1984";
        long end = System.currentTimeMillis();

        System.out.println("aroundReturnBookLoggingAdvice: successfully returned a book into library");

        System.out.println("aroundReturnBookLoggingAdvice: method returnBook executed in " + (end-begin) + " milliseconds");
        return targetMethodResult;
    }
}
