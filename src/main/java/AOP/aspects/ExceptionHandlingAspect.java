package AOP.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(30)
public class ExceptionHandlingAspect {
    @Before("AOP.aspects.MyPointCuts.allGetMethods()")
    public void beforeGetExceptionHandlingAdvice(){
        System.out.println("beforeGetExceptionHandlingAdvice : catching exception in the attempt of getting a book/magazine");
    }
}
