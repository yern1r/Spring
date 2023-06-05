package spring_intro;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Dog implements Pet {
    //private String name;

//    public String getName() {
//        return name;
//    }

//    public void setName(String name) {
//        this.name = name;
//    }

    public Dog() {
        System.out.println("dog bean is created");
    }

    @Override
    public void say(){
        System.out.println("Gav-Gav");
    }

    public void init(){
        System.out.println("Class Dog : init method");
    }

    public void destroy(){
        System.out.println("Class Dog : destroy method");
    }

}
