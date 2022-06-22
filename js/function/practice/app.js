function randomNuber(max,min){  //#1

    a = Math.floor(Math.random() * (max - min + 1)) + min;

    return a;
}

function fillArray(b,n,) {   //#2

for (let i = 0; i < n; i++){

    b[i] = randomNuber(1,100);

    
}
return b;
}

function maxNumber(a) { //#3
    maxNum = a[0];

    for(let i = 1; i < b.length; i++){

    if (maxNum < a[i]) {
        maxNum = a[i];
    }
}
    return maxNum;
}


function maxIndex (a){  //#4

    for(let i = 1; i < b.length; i++){
    if (maxNumber(b) == a[i]) {
        maxInd = i;
    }
}
    return maxInd;
}

function stringArray (a) { //#5
    for(let i =0; i < a.length; i++){
        strArray += a[i] + ','
    }
    return strArray;
}

function increaseEvenElement(a){//#6
    for(let i = 0; i < a.length; i++){
        if (i % 2 == 0) {
            a[i] /= 2;
        }
    }
    return b;
}

function numberSearch(a,k){ //#7
for(let i = 0; i < a.length; i++){
    if (a[i] == k) {
        return true;
    } 
}
return false;
}
function indexSearch(a,k){ //#8
    for(let i = 0; i < a.length; i++){
        if (a[i] == k) {
            return i;
        } 
    }
    return -1;
    }


    

let b=[], a, maxNum = 0, maxInd = 0, strArray = '', h;
 b = fillArray(b, 10,)
 console.log(b)
 
 a = randomNuber(1, 1000)
console.log(a);

maxNum = maxNumber(b);
console.log("Максимальный элемент в массиве = "+maxNum+"")

maxInd = maxIndex(b);
console.log("Индекс Максимального элемента = "+maxInd+"")

strArray = stringArray(b);
console.log(strArray);

b = increaseEvenElement(b);
console.log(b);


if (numberSearch(b, 96)) {
    console.log("Число есть")
} else {
    console.log("Числа нет")
}

console.log(indexSearch(b,96))







