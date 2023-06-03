package spring_intro;

public class Dog implements Pet {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Dog() {
        System.out.println("dog bean is created");
    }

    @Override
    public void say(){
        System.out.println("Gav-Gav");
    }
}
