import {Users} from "./users.js"
class Petsitter extends Users {
    services;
    reviews;
    constructor(name, login, pass){
        super(name, login, pass);
        this.reviews = new Array();
        this.services = new Array();
    }
    addReviews(review){
        this.reviews.push(review);
    }
    addService(service){
        this.services.push(service);
    }
    /*getRating(){
        this.reviews.reduce(function)
    }*/
    checkServices(name){
        this.services.forEach(function (){
            if (this.services.name == name) {
                return this.services.name;
            } else return null;
        })       
    }
}

export{Petsitter};