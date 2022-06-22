let i = 1, sum = 0;
while (i <= 100) {
    if (i % 2 == 0) {
      sum += i;  
    };
    i++;
}
console.log(i , sum)

i = 1, sum = 0;

do {
    if (i % 2 == 0) {
        sum += i;  
      };
      i++;
} while (i <= 100);
console.log(i , sum)

i = 1, sum = 0;
for (; i <= 100; i++) {
    if (i % 2 == 0) {
        sum += i;
    }
}
console.log(i , sum)



for (var n = 1000000000, j = 0 ; n != 1; j++){
    if (n % 2 == 0) {
        n = n / 2;
    } else { 
        n = (n * 3 + 1) / 2;
    }
}
console.log(j)

n = 0, i = 0; 
for (;i != 51; n++) {
    if (n % 7 == 0 && n % 5 != 0) {
        i++;
    }
}
console.log(n-1)

n = 100, i = 0;
do {
    if (n % 21 == 0 || n % 14 != 0) {
        i++;
        console.log(n);
    }
    n++;
} while (i != 10);

let x = 0, y = 0;

for (; y <= 100; y++) {
    for (; x<= 100; x++){
        if (3 * x + 4 * y == 2021) {
            console.log(x, y)
        }
    }
    
}