let value = 7, n = 10;

let j = Array(n).fill(value, 0, n );

console.log(j);


a = [1, -5, 3, -7 , 16] ;

let sum = a.reduce((a,v) => v > 0 ? a +v : a , 0);//#2
console.log(sum);


let str = 'я изучаю js';//#3

let arr = str.split(" ")
console.log(arr.length)

console.log(arr.pop())//#4

let b =[2,7,3], c = [6,3,9];//#5
function compare(a, b) {
    if (a > b) return -1; 
    if (a == b) return 0; 
    if (a < b) return 1; 
  }

a = a.concat(b,c);
a = a.sort(compare);
console.log(a);

a = [2,7,3];//#6

a = a.join('');
b = b.join('');

if (a.includes(b)) {
    console.log("массивы равны")
} else {
    console.log("массивы не равны")
}


a = [1,3,6,4,3,3,5,6], b = [];
b = a.forEach(function)









