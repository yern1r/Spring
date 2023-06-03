package spring_intro;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test5 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext3.xml");

        Dog myDog = context.getBean("myPet", Dog.class);
        myDog.say();

        Dog secondDog = context.getBean("myPet",Dog.class);
        secondDog.say();

        context.close();
    }
}
// access modifier can be - private/public
//  return type can be anything, but we can not use it , so for these methods -> void type
// can be named anything
//they can not have parameters
// if bean's scope is prototype
// - init method will be called for every bean
// - for this bean destroy-method can not be called
// - programmer should write code for closing for these beans