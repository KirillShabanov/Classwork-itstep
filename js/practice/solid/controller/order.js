import { Order } from "../../cw/order.js";

class orderController{
    static create(request,driver){
        let newOrder = new Order(request,driver);
        console.log("заказ создан")
        return newOrder;
    }
}