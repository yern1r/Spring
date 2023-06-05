package spring_intro;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component ("personBean")
public class Person {
//    @Autowired
//    @Qualifier("catBean")
    private Pet pet;
    @Value("${person.surname}")
    private String surname;
    @Value("${person.age}")
    private int age;

    //Autowired - we can use it for: Constructor/Setter/field
    // process inputting dependencies using @Autowired
    //1 - scanning package, searching in classes with annotation @Component
    //2 - and if there is annotation @Autowired ,
        // there will be searching to find suitable bean
    // if there is 1 bean which suits, then there will be dependency injection
    // if there is no bean , then throw exception
    // if there is more than , also throw exception

    @Autowired
        public Person(@Qualifier("catBean") Pet pet) {
          System.out.println("person bean is created");
        this.pet = pet;
     }
        //     in configure file -> : <constructor-arg ref="myPet"></constructor-arg>


//    public Person(){
//        System.out.println("Person bean is created");
//    }

    // pet -> setPet
    // setPet
    //in configure file -> : <property name="pet" ref="myPet"></property>

//   @Autowired
//   @Qualifier("dog")
    public void setPet(Pet pet) {
        System.out.println("Class Person : set pet");
        this.pet = pet;
    }

    public void callYourPet(){
        System.out.println("hi , my pet");
        pet.say();
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        System.out.println("Class Person : set surname");
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        System.out.println("Class Age : set surname");
        this.age = age;
    }
}
