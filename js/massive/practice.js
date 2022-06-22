let a = [], n = 10, max = 100, min = 1;

for (let i = 0, k = 5; i < n; i++){
    a[i] = Math.floor(Math.random() * (max - min + 1)) + min; // №1
    if (i >= k) {
        console.log(a[i]);
    } 
}
console.log (a);


for (let i = 0, k = 4; i < n; i++){
    if (a[i] % k == 0) {              // №2
        console.log("Кратное к:"+a[i]+"");
    } 
}

let minIndex = 0, maxIndex = 0, minEl = a[0], maxEl = a[0];
for (let i = 0; i < n; i++){ //№3
    if (a[i] > maxEl) {
        maxEl = a[i];
    } else if (a[i] < minEl) {
        minEl = a[i];
    }
}
console.log("максимальный элемент: "+maxEl+" Минимальный элемент "+minEl+"")

minIndex = 0, maxIndex = 0, minEl = a[0], maxEl = a[0];

for (let i = 0; i < n; i++){
    if (a[i] > maxEl) {
        maxEl = a[i];  //№4
        maxIndex = i;
    } 
    if (a[i] < minEl) {
        minEl = a[i];
        minIndex = i;
    }
}
a[maxIndex] = minEl;
a[minIndex] = maxEl;
console.log(a)

let b = [], c = [];
for (let i = 0, j = 0, l = 0; i < n; i++){ //#5
    if (i % 2 == 0) {
        b[j] = a[i];
        j++;
    } else {
        c[l] = a[i];
        l++;
    }
}
console.log(b,c)


for (let i = 0; i < n; i++){
    if (a[i] % 2 == 0) {  //#6
        a[i]= a[i] / 2;
    } else {
        a[i] = a[i] + 1;
    }
}
console.log(a)

let count = 0;
for (let i = 0, x = 56, count = 0; i < n; i++){ //#7
    if (a[i] == x) {
       count++; 
    } 
}
if (count != 0) {
    console.log("Число встречается")
} else {
    console.log("Число не встречается")
}

for (let i = 0, k = 4; i < n; i++){ //#8
    if (i >=k-1 ) {
       a[i] = a[i+1] ;
    }
}
console.log(a)

let countIncrease = 0, countDecrease = 0;  //#9
for (let i = 0; i < n; i++){
    if (a[i] < a[i+1]) {
        countIncrease++;
    } else if (a[i] > a[i+1])  {
        countDecrease++;
    }
}
if (countDecrease == (n-1)) {
    console.log("Упорядочено по убыванию")
} else if (countIncrease == (n-1)) {
    console.log("Упорядочено по возвростанию")
} else {
    console.log ("массив не упорядочен")
}

for (let i = 0, repeatElement = 0; i < n; i++) {
    repeatElement = a[i];
    for (let j = 0; j < n; j++) {
        if (repeatElement == a[j+1]) {
            a[j+1] = a[j+2];
        }
    }
}

console.log(a)