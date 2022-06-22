package org.itstep.Pattern.AbstrackFactory;

public class FantasyGame {
    public static void main(String[] args) {
    Barracks humanBarracks = new HumanBarracks();
    Warrior warrior = humanBarracks.createWarrior();
    warrior.attack();
    Mage mage = humanBarracks.createMage();
    mage.cast();
    Archer archer = humanBarracks.createArcher();
    archer.shoot();
    }
}

interface Warrior{
     void attack();
}
interface Mage{
     void cast();
}
interface Archer{
     void shoot();
}

abstract class Barracks{
    public abstract Warrior createWarrior();
    public abstract Mage createMage();
    public abstract Archer createArcher();
}
class HumanBarracks extends Barracks{
    @Override
    public Warrior createWarrior() {
        return new HumanWarrior();
    }

    @Override
    public Mage createMage() {
        return new HumanMage();
    }

    @Override
    public Archer createArcher() {
        return new HumanArcher();
    }
}
class HumanWarrior implements Warrior{

    @Override
    public void attack() {
        System.out.println("The human warrior is attacking with sword");
    }
}
class HumanMage implements Mage{
    @Override
    public void cast() {
        System.out.println("The human mage is casting a spell");
    }
}
class HumanArcher implements Archer{
    @Override
    public void shoot() {
        System.out.println("The human archer is shooting");
    }
}