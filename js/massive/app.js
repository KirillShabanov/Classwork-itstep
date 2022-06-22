let a = [], min = 1, max = 100 , count = 0, n = 10;

for (let i = 0; i < n; i++){
    a[i] = Math.floor(Math.random() * (max - min + 1)) + min;
    if (a[i] % 2 == 0) {
        count++;
    }
     
}
console.log (a, count)

let b = [], c = 0;

for (let i = 0; i < n; i++){
    b[i] = Math.floor(Math.random() * (max - min + 1)) + min;
    if (b[i] > c) {
        c = b[i]
    }
}
console.log(b, c);

let d = [], sum = 0, average = 0;

for (let i = 0; i < n; i++){
    d[i] = Math.floor(Math.random() * (max - min + 1)) + min;
    sum = (sum + d[i]);
}
average = sum / n;
console.log(d, sum, average)

let e = [], r= [];
for (let i = 0; i < n; i++){
    e[i] = Math.floor(Math.random() * (max - min + 1)) + min;
}

for (let i = 0; i < n; i++){
    r[i] = e[(n-1)-i];
}
console.log(e,r)


let E = 0.0001, x = 4, l = 0, k = 1, fr = 1;

for (; l < E; k++){
    fr = fr * k;
    l = (x**k)/k*(k-1);
    sum = sum + ((x**k)/fr)
    console.log(sum , l, fr, k)
}
