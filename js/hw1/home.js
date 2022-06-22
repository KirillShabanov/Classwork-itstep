let q = 10, sum = 0;
for (;q < 100; q++) {
    if (q % 2 != 0 && q % 13 == 0) {
        sum = sum + q;
    }
}
console.log(sum);

let n = 12, m = 24, c = 0;

for (; n != m; c++) {
    if (n > m) {
        n = n - m;
    } else {
        m = m - n;
    }
}
console.log(c, n, m);

let e = 40 , w = 0, r = 0;
w = Math.floor(Math.random() * 101);
for (;w != e; r++){
    if (w < e) {
        w = Math.floor(Math.random() * (e - w + 1)) + w;
    } else {
        w = Math.floor(Math.random() * (w - n + 1)) + n;
    }
    console.log(w)
}
