package AOP.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(20)
public class SecurityAspect {
    @Before ("AOP.aspects.MyPointCuts.allAddMethods()")
    public  void beforeAddSecurityAdvice(){
        System.out.println("beforeGetSecurityAdvice : checking the access to get a book/magazine");
        System.out.println("----------------------------------------------");
    }
}