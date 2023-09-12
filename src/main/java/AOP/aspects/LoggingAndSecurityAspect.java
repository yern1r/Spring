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






//    @Pointcut("execution(* AOP.UniLibrary.get*())")
//    private void allGetMethodsFromUniLibrary(){}
//
//    @Pointcut("execution(* AOP.UniLibrary.return*())")
//    private void  allReturnMethodsFromUniLibrary(){}
//
//
//    @Pointcut("allGetMethodsFromUniLibrary() || allReturnMethodsFromUniLibrary()" )
//    private void allGetAndReturnMethodsFromUniLibrary(){}
//
//    @Before("allGetMethodsFromUniLibrary()")
//    public void beforeGetLoggingAdvice(){
//        System.out.println("beforeGetLoggingAdvice: writing Log #1");
//    }
//
//    @Before("allReturnMethodsFromUniLibrary()")
//    public void beforeReturnLoggingAdvise(){
//        System.out.println("beforeReturnLoggingAdvise : writing Log #2");
//    }
//
//    @Before("allGetAndReturnMethodsFromUniLibrary()")
//    public void beforeGetAndReturnMethodsFromUniLibrary(){
//        System.out.println("beforeGetAndReturnMethodsFromUniLibrary : writing Log #3" );
//    }


@Pointcut("execution(* AOP.UniLibrary.*(..))")
    private void allMethodsFromUniLibrary(){}

@Pointcut("execution(public void AOP.UniLibrary.returnMagazine())")
private void returnMagazineFromUniLibrary(){}

@Pointcut("allMethodsFromUniLibrary() && !returnMagazineFromUniLibrary()")
    private void allMethodsExpectReturnMagazineFromUniLibrary(){}

@Before("allMethodsExpectReturnMagazineFromUniLibrary()")
    public void beforeMethodsExpectReturnMagazineFromUniLibrary(){
    System.out.println("beforeMethodsExpectReturnMagazineFromUniLibrary : log #10");
}
}
