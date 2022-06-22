package org.itstep.Pattern.Bridge;

public class LionAndHare {
    public static void main(String[] args) {
        Hare hare = new CleverHare();
        Lion lion = new CleverLion();
        hare.meetWithLion(lion);
        lion.meetWithHare(hare);
        System.out.println();


    }
}

abstract class Lion {
    protected boolean wit;

    public Lion(){}

    abstract public void meetWithHare(Hare hare);

}

abstract class Hare{
    protected boolean wit;

    public Hare(){}

    abstract public void meetWithLion(Lion lion);
}

class CleverLion extends Lion{

    @Override
    public void meetWithHare(Hare hare) {
        if (hare.wit) System.out.println("The Hare is clever, I don't want to eat him.");
        else System.err.println("The Hare is stupid, I'd rather eat him.");
    }

    public CleverLion(){
        this.wit = true;
    }

}

class StupidLion extends Lion{

    @Override
    public void meetWithHare(Hare hare) {
        if (hare.wit) System.out.println("What? Another lion in my jungle? Take me to him immediately.");
        else System.err.println("It is another hare. I'm very hungry.");
    }

    public StupidLion(){
        this.wit = false;
    }
}

class CleverHare extends Hare{

    @Override
    public void meetWithLion(Lion lion) {
    if (lion.wit) System.out.println("The Lion is clever, my attempt fails");
    else System.err.println("The Lion is stupid, i will try to fool him");
    }

    public CleverHare(){
        this.wit = true;
    }
}

class StupidHare extends Hare{

    @Override
    public void meetWithLion(Lion lion) {
    if (lion.wit) System.out.println("The clever Lion! I can't do anything!");
    else System.err.println("The stupid Lion! I afraid him!");
    }

    public StupidHare(){
        this.wit = false;
    }
}