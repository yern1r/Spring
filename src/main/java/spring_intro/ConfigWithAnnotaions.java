package spring_intro;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ConfigWithAnnotaions {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext4.xml");

        Cat myCat = context.getBean("cat", Cat.class);
        myCat.say();

        context.close();
    }
}
//Annotations - it is special commentaries/metadata which need for transporting information
// configuration with annotations is short and quick method than configuration with XML
//Process : 1 - scanning classes and searching annotation @Component
// 2 - Creating(registration) bean in Spring Container