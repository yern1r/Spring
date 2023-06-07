package AOP.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAspect {

    //@Before("execution(public void getBook())")
    //@Before("execution(public void AOP.UniLibrary.getBook())")
    @Before("execution(public void get*())")
    public void beforeGetBookAdvise(){
        System.out.println("beforeGetBookAdvise : attempt to get book");
    }

    //@Before("execution(public * returnBook())")
    @Before("execution(public void returnBook())")
    public void beforeReturnBookAdvise(){
        System.out.println("beforeReturnBookAdvise : attempt to return book");
    }
}
