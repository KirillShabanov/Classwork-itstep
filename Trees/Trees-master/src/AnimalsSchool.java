public class AnimalsSchool {
    public static void main(String[] args) {

        Duck duck = new Duck();
        duck.run(); duck.swim();

        Squirrel squirrel = new Squirrel();
        squirrel.climb();squirrel.run();squirrel.swim();
    }
}

    interface runnable {
    void run();
    }
    interface swimming {
        void swim();
    }
    interface climbable {
        void climb();
    }


class Duck implements swimming, runnable {
    @Override
    public void run() {
        System.out.println("Duck: I am very poor in running");
    }

    @Override
    public void swim() {
        System.out.println("Duck: I am excellent in swimming");
    }
}
class Squirrel implements runnable, climbable, swimming {
    @Override
    public void run() {
        System.out.println("Squirrel: I am excellent in running");
    }

    @Override
    public void swim() {
        System.out.println("Squirrel: I am drowning!!!");
    }

    @Override
    public void climb() {
        System.out.println("Squirrel: I am excellent in climbing");
    }
}
