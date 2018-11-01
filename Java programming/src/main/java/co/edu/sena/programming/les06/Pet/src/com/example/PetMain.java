package co.edu.sena.programming.les06.Pet.src.com.example;


public class PetMain {

    public static void main(String[] args) {
        Animal a;
        //test a spider with a spider reference
        Spider s = new Spider();
        s.eat();
        s.walk();
        //test a spider with an animal reference
        a = new Spider();
        a.eat();
        a.walk();

        Pet p;
        //Fish
        Fish f=new Fish();
        f.setName("Jefri");
        f.eat();
        f.walk();
        f.play();
        a=new Fish();
        a.eat();
        a.walk();

        //Cat
        Cat c=new Cat("Liara");
        c.eat();
        c.walk();
        c.play();
        a=new Cat();
        a.eat();
        a.walk();
        p=new Cat();
        p.setName("Silvestre");
        p.play();

        playWithAnimal(s);
        playWithAnimal(c);
        playWithAnimal(f);
    }
    
    public static void playWithAnimal(Animal a) {
        if (a instanceof Pet){
            Pet p=(Pet)a;
            p.play();
        } else {
            System.out.println("Peligro! Este animal es salvaje");
        }
    }
    
}