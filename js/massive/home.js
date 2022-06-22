let E = 0.0001, x = 4, l = 1, k = 1, fr = 1, sum = 0;

for (; l > E; k++){
    fr = fr * k;
    l = (x**k)/fr;
    sum = sum + ((x**k)/fr)
    console.log(sum , l, fr, k)
}