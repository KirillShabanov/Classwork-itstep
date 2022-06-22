/*let  calculator = {
    a: 0,
    b: 0,
    
    this.add = function(){
        res = this.a + this.b;
        return res;
    }
    this.sub = function(){
        res = this.a - this.b
        return res;
    }
    this.mul = function(){
        res = this.a * this.b
        return res;
    }
    this.div = function(){
        res = this.a / this.b
        return res;
    }
}


let x = 4, y = 5;
alculator.a = x, calculator.b = y;
let o3 = Calculator.add()

calculator.a = y, calculator.b = 2;
let o1 = calculator.mul();

calculator.a = x, calculator.b = o1;
let o2 = calculator.sub();

calculator.a = o2, calculator.b = o3;
let exp = calc.div();

console.log(exp)*/
let x = 4, y = 5;
function Calc() {
    this.add = function(a,b){
        res = a + b;
        return res;
    }
    this.sub = function(a,b){
        res = a - b
        return res;
    }
    this.mul = function(a,b){
        res = a * b
        return res;
    }
    this.div = function(a,b){
        res = a / b
        return res;
    }
}

let calc = new Calc();

let exp1 = calc.div((calc.sub(x , calc.mul(y , 2))) , calc.add(x , y));
console.log(exp1)
