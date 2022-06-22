package org.itstep.Pattern.Adapter;

public class WellAndBucket {
    public static void main(String[] args) {
    Well well = new DugWell();
    well.makeEcho("Hi");
        System.out.println("Water: " + well.getWater());
        System.out.println();
    well = new WellWithBucket();
    well.makeEcho("Apu!");
        System.out.println("Water: " + well.getWater());

    }
}
interface Well{
     double getWater();
     void makeEcho(String call);
}
class DugWell implements Well{
    private double water = 1000;

    @Override
    public double getWater() {
        return 0;
    }

    @Override
    public void makeEcho(String call) {
        System.out.println(call+"-"+call+call+call);
    }
}
class Bucket{
    public double value = 10;
    public void fill(){
        System.out.println("Filling the bucket with water");
    }
    public void emptying(){
        System.out.println("Pouring water");
    }

}
class WellWithBucket implements Well{
    private Bucket bucket = new Bucket();

    @Override
    public double getWater() {
       bucket.fill();
       bucket.emptying();
       return bucket.value;
    }

    @Override
    public void makeEcho(String call) {
        System.out.println(call+"-"+call+call+call);
    }
}