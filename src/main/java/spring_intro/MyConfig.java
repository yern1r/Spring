package spring_intro;

import org.springframework.context.annotation.*;

@Configuration
@PropertySource("classpath:myApp.properties")
//@ComponentScan("spring_intro")
public class MyConfig {

    //return type Pet
    @Bean
    @Scope("singleton")
    public Pet catBean(){
        return new Cat();
    }

    //bean id will be -> name of method catBean

    @Bean
    public Person personBean(){
        return new Person(catBean());
    }

}
//by @Configuration we show that this class is configuration file
//@componentScan allows to show what should be scanned for beans and annotations
