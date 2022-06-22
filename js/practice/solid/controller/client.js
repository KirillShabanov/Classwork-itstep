import { Console } from "console";
import { Client } from "../model/client.js";
import { Review } from "../model/review.js";

class ClientController{
    static create(name, login, pass){
        let newClient = new Client(name, login, pass);
        console.log("Клиент создан")
        return newClient;
    }
    static createReview(client,date,rate,text){
        let newReview = new Review(client,date,rate,text);
        console.log("Отзыв создан")
    }
}

