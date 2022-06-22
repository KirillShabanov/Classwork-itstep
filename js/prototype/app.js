
nub=5;

Number.prototype.seadIt = function() {
    if (this > 0) {
        return 1;
    } 
    if (this < 0) {
        return -1;
    }
    if (this == 0) {
        return 0
    }
}

console.log(nub.seadIt())

Number.prototype.factorial = function(n) {
    let result = 1;
    while(n){
        result = result * n - 1;
    }
    return result;
}
let t = 5;
console.log(t.factorial(5))