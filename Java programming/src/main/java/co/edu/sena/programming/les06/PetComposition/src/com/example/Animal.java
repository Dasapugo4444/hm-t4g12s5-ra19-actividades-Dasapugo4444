package co.edu.sena.programming.les06.PetComposition.src.com.example;

public abstract class Animal {
    
    protected int legs;

    public Animal(){

    }
    
    public Animal(int legs) {
        this.legs = legs;
    }

    public abstract void eat();
    
}