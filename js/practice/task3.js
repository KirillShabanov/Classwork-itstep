class BigAnimal{
    height;
    weight;
    width;
    constructor(height,weight,width) {
    
        this.height = height;
        this.weight = weight;
        this.width = width;
    }

    getSize(){
        console.log("оч большое животное")
    }
}

class SmallAnimal{

    height;
    weight;
    width;
    constructor(height,weight,width) {
    
        this.height = height;
        this.weight = weight;
        this.width = width;
    }
    getSize(){
        console.log("оч маленькое животное")
    }
}

class Goose extends SmallAnimal{
    constructor(height,weight,width){
        super(height,weight,width)
    }
    getSize(){
        console.log("рост:"+this.height+", Вес: "+this.weight+", Ширина: "+this.width+"")
    }
}

class Dragon extends BigAnimal{

    constructor(height,weight,width){
        super(height,weight,width)
    }
    getSize(){
        console.log("рост:"+this.height+", Вес: "+this.weight+", Ширина: "+this.width+"")
    }

}


