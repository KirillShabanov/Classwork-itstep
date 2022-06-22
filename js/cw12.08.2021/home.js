let x = 0, y = 0;

for (; y <= 100000000000; y++) {
    for (; x<= 100000000000; x++){
        if (3 * x + 4 * y == 2021) {
            console.log(x, y)
        }
    }
    
}