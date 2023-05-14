package spring_intro;

public class Person {
    private Pet pet;
    private String surname;
    private int age;

    //    public Person(Pet pet) {
    //      System.out.println("person bean is created");
    //    this.pet = pet;
    // }
    // in configure file -> : <constructor-arg ref="myPet"></constructor-arg>

    public Person(){
        System.out.println("Person bean is created");
    }

    // pet -> setPet
    // setPet
    //in configure file -> : <property name="pet" ref="myPet"></property>
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
