package co.edu.sena.programming.les06.PetComposition.src.com.example;

public class NameableImpl implements Nameable{

    private String name;

    public void NameableImpl(String name){
        if (name.length()>20){
            System.out.println("Nombre muy largo");
        }
    }

    @Override
    public void setName(String name) {

    }

    @Override
    public String getName() {
        return null;
    }
}
