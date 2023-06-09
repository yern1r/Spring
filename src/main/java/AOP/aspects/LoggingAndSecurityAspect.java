package AOP.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAndSecurityAspect {

//    @Before("execution(public void getBook(AOP.Book))")
//    @Before("execution(public void getBook(String))")
    //@Before("execution(public void getBook())")
    //@Before("execution(public void AOP.UniLibrary.getBook())")
//    @Before("execution( * get*())")
//    public void beforeGetBookAdvise(){
//        System.out.println("beforeGetBookAdvise : attempt to get book/magazine");
//    }
//    //@Before("execution(public * *(..))") //--> all return type , all methods with 0 or more random parameter type
    //@Before("execution(public void *(..))") //--> all methods with 0 or more random parameter type
    //@Before("execution(public void *(*))") //--> all methods with 1 random parameter type
    //@Before("execution(public * returnBook())")
    //@Before("execution(public void returnBook())")
//    public void beforeReturnBookAdvise(){
//        System.out.println("beforeReturnBookAdvise : attempt to return book");
//    }


    @Pointcut("execution( * get*())")
    private void allGetMethods(){};

    @Before("allGetMethods()")
    public void beforeGetLoggingAdvice(){
        System.out.println("beforeGetLoggingAdvice : attempt to get book/magazine ");
    }

    @Before("allGetMethods()")
    public void beforeGetSecurityAdvice(){
        System.out.println("beforeGetSecurityAdvice : checking access for getting book/magazine ");
    }
}
