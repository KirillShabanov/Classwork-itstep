class Phone{
    number;
    model;
    weight;
    constructor(numbrer, model, weight){
      this.number = numbrer;
      this.model = model;
      this.weight = weight;  
    }

    reciveCall(name){
        this.name = name;
        console.log("Звонит "+this.name+"")
    }

    getNumber(){
        console.log(this.number)
    }
}

let firstPhone = new Phone("88005553535","smasung","100g");
let secondPhone = new Phone("7788","iphone","150g");
let thirdPhone = new Phone("375297377777","xiaomi","250g");

console.log(firstPhone,secondPhone,thirdPhone);

firstPhone.reciveCall("John");
secondPhone.reciveCall("Pete");
thirdPhone.reciveCall("Jim");
firstPhone.getNumber();
secondPhone.getNumber();
thirdPhone.getNumber();