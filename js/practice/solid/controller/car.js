import { Car } from "../model/car.js";

class CarController{
    static create(model,number,color,comfort,hasChildrenSeat,capacity){
        let newCar = new Car(model,number,color,comfort,hasChildrenSeat,capacity);
        console.log("Машина создан")
        return newCar;
    }
}
export{CarController};