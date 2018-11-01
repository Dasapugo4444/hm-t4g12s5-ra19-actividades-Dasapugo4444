package co.edu.sena.programming.les06.PetComposition.src.com.example;

public class Cat extends Animal implements Pet {

    private Nameable nameable=new NameableImpl();
    private Ambulatory ambulatory;

    public Cat() {
        this("Fluffy");
    }

    public void walk() {
        ambulatory.walk();
    }

    public Cat(String name) {
       ambulatory=new AmbulatoryImpl(4);
    }

    @Override
    public void eat() {
        System.out.println("Cats like to eat spiders and fish.");
    }

    @Override
    public void play() {
        System.out.println(getName() + " likes to play with string.");
    }

    @Override
    public void setName(String name) {

    }

    @Override
    public String getName() {
        return null;
    }
}