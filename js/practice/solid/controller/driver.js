import { Driver } from "../model/driver.js";

class DriverController{
        static create(name, login, pass){
            let newDriver = new Driver(name, login, pass);
            console.log("Водитель создан")
            return newDriver;
        }
        staitc
}