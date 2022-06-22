import java.util.LinkedList;
import java.util.List;

public class Animals {
    public static void main(String[] args) {
        List <Animal> animals = new LinkedList<>();
        animals.add(new Cat());
        animals.add(new Mouse());
        animals.add(new Dog());
        animals.forEach(animal -> animal.sound());
        /*
        Animal cat = new Cat();
        Animal mouse = new Mouse();
        Animal dog = new Dog();
        cat.sound();
        mouse.sound();
        dog.sound();
        */
    }

}
abstract class Animal {
    abstract public void sound ();

}

class Cat extends Animal {
    @Override
    public void sound() {
        System.out.println("Meow");
    }
}

class Mouse extends Animal {
    @Override
    public void sound() {
        System.out.println("Squeak");

    }
}

class Dog extends Animal {
    @Override
    public void sound() {
        System.out.println("Woof");

    }
}
