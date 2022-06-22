import {Users} from "./users.js"
import {Pets} from "./users.js"

class Client extends Users{
    pets;
    constructor(name, login, pass){
        super(name, login, pass)
        this.pets = new Array();
    }
    addPet(pet){
        this.pets.push(pet);
    }
    checkPet(name){
        this.pets.forEach(function (){
            if (this.pets.name == name) {
                return this.pet.name;
            } else return null;
        })
    }
}

export{Client};