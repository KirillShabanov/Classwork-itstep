package org.itstep.Pattern.FlyWeight;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

public class FlyWeight {
    public static void main(String[] args) {
    Mycelium mycelium =new Mycelium();
        System.out.println(mycelium.getMushroom(MushroomType.Russula, 1, 1).toString2());
        System.out.println(mycelium.getMushroom(MushroomType.Russula, 2, 2).toString2());
        System.out.println(mycelium.getMushroom(MushroomType.Honey, 1, 2).toString2());
        System.out.println(mycelium.getMushroom(MushroomType.Honey, 2, 1).toString2());
    }
}
enum MushroomType {PennyBun, Russula, Chanterella, Honey};

class Mushroom {
    private MushroomType type;
    private int x;
    private int y;

    public Mushroom(MushroomType type) {
        this.type = type;
    }

    public MushroomType getType() {
        return type;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
    public String toString2() {
        return this+" "+this.type.toString()+" "+x+" "+y;
    }

    public void setPosition(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
class Mycelium{
    private Map<MushroomType, Mushroom> mushrooms = new HashMap<>();

    public Mushroom getMushroom (MushroomType type, int x, int y){
        Mushroom mushroom = mushrooms.get(type);
        if (mushroom == null) {
            mushroom = new Mushroom(type);
            mushrooms.put(type, mushroom);
        }
        mushroom.setPosition(x, y);
        return mushroom;
    }
}