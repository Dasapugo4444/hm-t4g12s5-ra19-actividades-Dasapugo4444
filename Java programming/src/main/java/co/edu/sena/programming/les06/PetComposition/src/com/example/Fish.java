package co.edu.sena.programming.les06.PetComposition.src.com.example;

public class Fish extends Animal implements Pet {

    private Nameable nameable=new NameableImpl();

    public Fish() {
        super(0);
    }

    @Override
    public void eat() {
        System.out.println("Fish eat pond scum.");
    }

    @Override
    public void play() {
        System.out.println("Just keep swimming.");
    }


    @Override
    public void setName(String name) {

    }

    @Override
    public String getName() {
        return null;
    }
}