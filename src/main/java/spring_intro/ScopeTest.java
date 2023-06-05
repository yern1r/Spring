package spring_intro;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ScopeTest {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext4.xml");

        Dog myDog = context.getBean("dog", Dog.class);
        myDog.say();
//        Dog yourDog = context.getBean("dog", Dog.class);
//
//        System.out.println("is two links to the same object? " + (myDog == yourDog));
//
//        System.out.println(myDog);
//        System.out.println(yourDog);

        context.close();
    }
}
