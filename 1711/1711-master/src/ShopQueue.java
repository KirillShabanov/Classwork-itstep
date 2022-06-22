

//Очередь в магазин. Каждый покупатель имеет корзину, в каждой корзине набор товаров определенной цены.
//После обслуживания покупателя сумма в кассе увеличивается.
//Без очереди обслуживаются ветераны, затем дети до 10 лет

import java.util.ArrayList;
import java.util.PriorityQueue;

public class ShopQueue {

    static double sum = 0;

    public static void main(String[] args) {
        Product water = new Product("water",1.9);
        Product bread = new Product("bread",0.75);
        Product gum = new Product("gum",0.25);
        Product milk = new Product("milk",1.2);
        Product eggs = new Product("eggs",2.1);

        Seller seller = new Seller();

        Buyer buyer1 = new Buyer(TypeCustomer.REGULAR);
        buyer1.addProduct(water).addProduct(milk).addProduct(eggs);

        Buyer buyer2 = new Buyer(TypeCustomer.VETERAN);
        buyer2.addProduct(milk).addProduct(bread);

        Buyer buyer3 = new Buyer(TypeCustomer.CHILD);
        buyer3.addProduct(gum);

        PriorityQueue<Buyer> queue = new PriorityQueue<>();
        queue.add(buyer1);
        queue.add(buyer2);
        queue.add(buyer3);

        while (!queue.isEmpty()) {
            Buyer buyer = queue.poll();
            sum += seller.calcSum(buyer);
            System.out.println(buyer.tCustomer + " после покупки в кассе, итого: " + sum + " руб.");
        }
    }
}

enum TypeCustomer{
    VETERAN, CHILD, REGULAR;
}

class Buyer implements Comparable{

    public TypeCustomer tCustomer;
    public ArrayList<Product> basket = new ArrayList<>();

    public Buyer(TypeCustomer tCustomer) {
        this.tCustomer = tCustomer;
    }

    public Buyer addProduct (Product product) {
        basket.add(product);
        return this;
    }

    @Override
    public int compareTo(Object o) {
        int index1 = this.tCustomer.ordinal();
        int index2 = ((Buyer) o).tCustomer.ordinal();
        return index1 - index2;
    }
}

class Product{
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}

class Seller {
    public double calcSum (Buyer buyer){
        double sum = buyer.basket.stream().mapToDouble(p->p.getPrice()).sum();
        return sum;
    }
}