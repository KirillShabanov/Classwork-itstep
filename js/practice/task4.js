class Product {
    name;
    price;
    rating;
    constructor(name,price,rating){
        this.name = name;
        this.price = price;
        this.rating = rating;
    }
}

class Category{
    name;
    products;
    constructor(name){
        this.name = name;
        this.products = new Array;
    }

    addProduct(product){
        this.products.push(product);
    }
    show(){
        console.log(this.Category)
    }
}

class Basket {
    products;
    constructor(){
        this.products = new Array;
    }
    addProduct(product){
        this.products.push(product);
    }
}

class User{
    login;
    password;
    basket;
    constructor(login,password){
        this.login = login;
        this.password = password;
    }
    addBasket(basketWithProducts){
        this.basket = basketWithProducts;
    }
}

let prod1 = new Product("Савушкин продукт", "2р", "4,5 звезды");
let prod2 = new Product("Простоквашено","2,5р","5 звезд");

let prod3 = new Product("Российский","11р","2 звезды");
let prod4 = new Product("Мацарелла","20р","4 звезды");

let prod5 = new Product("ганна","10р","5 звезд");
let prod6 = new Product("Green","13р","3 звезды");

let milk = new Category("Молоко");
let cheese = new Category("сыр");
let meat = new Category("куриное мясо");

milk.addProduct(prod1);
milk.addProduct(prod2);

cheese.addProduct(prod3);
cheese.addProduct(prod4);

meat.addProduct(prod5);
meat.addProduct(prod6);

let basket = new Basket();

basket.addProduct(prod1);
basket.addProduct(prod2);
basket.addProduct(prod3);
basket.addProduct(prod4);
basket.addProduct(prod5);
basket.addProduct(prod6);

let poul = new User("poulAnderson","qwerty12345");

poul.addBasket(basket);

console.log(basket)
console.log(poul);



