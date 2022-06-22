let a = 6;
if (a % 2 == 0) {
    console.log ("Even");
} else {
    console.log ("odd");
}


let x = 2011;

if ((x % 400 == 0) || ((x % 4 == 0 && (x % 100 != 0)))) {
    console.log ("Выокосный")
} else {
    console.log ("Не");
}
let g = 12;

if (g % 100 > 10 && g % 100< 20 || g % 10 >= 5 && g % 10 < 10 || g % 10 == 0 ) {
    console.log (""+g+" грибов");
} else if (g % 10 == 1) {
    console.log (""+g+" гриб");
} else {
    console.log (""+g+" гриба");
} 


let day = 7;
let hour = 4;

if (day >= 1 && day <= 6 && hour >= 8 && hour < 16) {
    console.log ("Привезут сегодня после 16:00")  
} else if (hour >= 0 && hour <= 7 && day >= 1 && day <= 6 ) {
    console.log("Привезут сегодня с 08:00 до 16:00 ")
} else if (day >= 1 && day <= 5 && hour >= 16) {
    console.log("Привезут завтра с 08:00 до 16:00 ")
} else if (day == 6 && hour > 16 || day == 7) {
    console.log ("Привезут в понедельник с 08:00 до 16:00")
} 