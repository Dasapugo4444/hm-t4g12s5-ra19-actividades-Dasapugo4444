package co.edu.sena.programming.les06.Pet.src.com.example;

import java.util.Calendar;

public class Cat extends Animal implements Pet{

    private String name;

    public Cat(String name){
        super(4);
        this.name=name;
    }

    public Cat(){
        this("Flully");
    }

    @Override
    public void eat() {
        System.out.println("Cats like to eat spiders and fish");
    }

    @Override
    public String getName() {
        return null;
    }

    @Override
    public void setName(String name) {

    }

    @Override
    public void play() {
        System.out.println(name + " likes to play with string");
    }
}
