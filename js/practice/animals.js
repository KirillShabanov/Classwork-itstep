class Animals{
food;
location;
constructor(name) {
    this.food = "";
    this.location = ""
}

makeNoise() {
    console.log('животное спит')
}

eat(food){
    this.food = food;
    console.log(`ест ${this.food}`)
}

sleep(location){
    this.location = location;
    console.log(`спит в ${this.location}`)
}
}

class Dog extends Animals{
makeNoize(){
    console.log("Собака не спит!")
}
eat(food){
    this.food = food;
    console.log("Собака уже поела "+this.food+"")
}
}

class Cat extends Animals{
    makeNoize(){
        console.log("Кошка проснулась!")
    }
    eat(food){
        this.food = food;
        console.log("Не хочет "+this.food+"")
    }
}

class Horse extends Animals{
    makeNoize(){
        console.log("Лошадь сильно шумит")
    }
    eat(food){
        this.food = food;
        console.log("что-то "+this.food+"")
    }
}

class Veterinarian {
treatAnimal(Animal){
    console.log(Animal.food, Animal.location)
    }
}


let dog = new Dog();
let cat = new Cat();
let horse = new Horse();

dog.eat("корм");
cat.eat("курицу");
horse.eat("сено");


let Animal = ["dog","cat","horse"]
veterinarian = new Veterinarian;
for (let i = 0; i < Animal.length; i++){
    console.log(veterinarian.treatAnimal(Animal[i]))
}