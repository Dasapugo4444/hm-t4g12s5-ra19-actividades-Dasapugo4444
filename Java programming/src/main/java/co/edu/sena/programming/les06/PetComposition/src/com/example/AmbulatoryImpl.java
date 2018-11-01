package co.edu.sena.programming.les06.PetComposition.src.com.example;

public class AmbulatoryImpl implements Ambulatory {

    private int legs;

    public AmbulatoryImpl(int legs){

    }

    @Override
    public void walk() {
        System.out.println("Este animal tiene "+legs+" piernas");
    }
}
