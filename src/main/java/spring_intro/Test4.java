package spring_intro;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import spring_intro.Dog;

public class Test4 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext2.xml");
    //singleton - default scope bean will be created
        // after Spring Container read configuration file

        // - common for all, which will call him in Spring Container
//        Dog myDog = context.getBean("myPet", Dog.class);
//        myDog.setName("Aqtos");
//        Dog yourDog = context.getBean("myPet", Dog.class);
//        yourDog.setName("Belka");
////
//        System.out.println(myDog.getName());
//        System.out.println(yourDog.getName());
////
//        System.out.println("variables link into the same objects?" + (myDog == yourDog));
//        System.out.println(myDog);
//       System.out.println(yourDog);
//       context.close();
        // - suitable for stateless objects


        //prototype - this bean will create
        // only after address to Spring Container with method .getBean

        // - for each addressing will be created new bean in Spring Container
            // System.out.println("variables link into the same objects?" + (myDog == yourDog)); -> false

        // - suitable for stateful objects
    }
}
