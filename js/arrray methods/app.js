let a = [1,2,3], b = [4,5,6], c=[];// #1

c = c.concat (a,b);
console.log(c);

a.reverse(); //#2
console.log(a);

a = [1,2,3];
a.push(4,5,6);// #3
console.log(a);

a = [1,2,3];//#4
a.unshift(4,5,6);
console.log(a)

a = [1,2,3];
console.log(a.shift());//#5
console.log(a.pop());//#6

a = [1,2,3,4,5];

a = a.slice(0,3);//#7
console.log(a);
a = [1,2,3,4,5];
a = a.slice(3,5);//#8
console.log(a);

a = [1,2,3,4,5];
a.splice(1,2)// #9
console.log(a);

a = [1,2,3,4,5];//#10
a.splice(0,1);
a.splice(3,1);
console.log(a)

a = [1,2,3,4,5];
a.splice(3,0,'a','b','c')//$11
console.log(a)

a = [1,2,3,4,5];


a.splice(1,4,'a','b',2,3,4,'c',5,'e')//#12
console.log(a)

a = [3,4,1,2,7];//#13
a.sort()
console.log(a)

a = [1,2,3,4,5]; //#14
b=[];
a.forEach((item) => {
    b.push(item ** 2);
    
});

console.log(b)

a = [1,2,3,4,5]; //#15
b= 0;
a.forEach((item) => {
    b += item ;
    
});

console.log(b);

a = [1,2,3,4,5];

a = a.map(function(square) {//#16
    return square ** 2;
});
console.log(a);

a = [1,2,3,-4,5];//#17

if (a.every(elem => elem > 0 == true)) {
    console.log("все числа больше 0")
} else {
    console.log("не все числа больше 0")
}

a = [1,2,3,4,5];//#18

if (a.some(elem => elem > 0 == true)) {
    console.log("все числа больше 0")
} else {
    console.log("не все числа больше 0")
}

a = [1, 2, 3, 4, 5];

let result = a.reduce((sum, current) => sum + current);

console.log(result);