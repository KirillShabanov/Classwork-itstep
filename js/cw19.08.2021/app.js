let squareArea = 5,perimeterOfASqoare;
perimeterOfASqoare = squareArea * 2;
console.log(perimeterOfASqoare);

let a = 5, b = 4, c = 3;

if (a == b && b == c && a == c) 
    console.log ("равносторонний");
else if (a == b || b == c || a == c) 
    console.log ("равнобедренный");
else    console.log ("разносторонний");


if (a + b > c && a + c > b && c + b > a) {
    console.log("можно")
} else {
    console.log("нельзя")
}

    



let firstNumber = 6, secondNumber = 8, result;

if ((firstNumber + secondNumber) % 2 == 0) {
    console.log (firstNumber * secondNumber); 
} else {
    console.log (firstNumber / secondNumber);
    
}

let age = 20;

if (age <= 17) {
    console.log("молодой");
} else if (age >= 18 || age <= 69) {
    console.log("взрослый");
} else {
    console.log("пожилой");
}

let sideOfASquare = 16, circleRadius = 4;

if (circleRadius * 2 < sideOfASquare) {
    console.log("Круг впишется в квадрат");
} else if (circleRadius * 2 >= sideOfASquare * (2**0.5)) {
    console.log("квадрат впишется в круг");
} else {
    console.log("никто ни в кого");
} 

let day = 29, month= 2, year = 2013;
    
switch (month) {
    case 1:
    if (day < 31) {
        console.log("дата корректна")
    } else {
        console.log("дата некорректна")
    }
    break;

    case 2:
        if (day <= 28) {
            console.log("дата корректна")
        } else if (day == 29 && ((year % 400 == 0) || ((year % 4 == 0 && (year % 100 != 0))))) {
            console.log("дата корректна")
        } else {
            console.log("дата некорректна")
        } 
    break;

    case 3:
        if (day < 31) {
            console.log("дата корректна")
        } else {
            console.log("дата некорректна")
        }
    break;

    case 4:
        if (day < 30) {
            console.log("дата корректна")
        } else {
            console.log("дата некорректна")
        }
    break;
    case 5:
        if (day < 31) {
            console.log("дата корректна")
        } else {
            console.log("дата некорректна")
        }
    break;

    case 6:
        if (day < 30) {
            console.log("дата корректна")
        } else {
            console.log("дата некорректна")
        }
    break;
    
    case 7:
        if (day < 31) {
            console.log("дата корректна")
        } else {
            console.log("дата некорректна")
        }
    break;

    case 8:
        if (day < 31) {
            console.log("дата корректна")
        } else {
            console.log("дата некорректна")
        }
    break;

    case 9:
        if (day < 30) {
            console.log("дата корректна")
        } else {
            console.log("дата некорректна")
        }
    break;

    case 10:
        if (day < 31) {
            console.log("дата корректна")
        } else {
            console.log("дата некорректна")
        }
    break;
    
    case 11:
        if (day < 30) {
            console.log("дата корректна")
        } else {
            console.log("дата некорректна")
        }
    break;

    case 12:
        if (day < 31) {
            console.log("дата корректна")
        } else {
            console.log("дата некорректна")
        }
    break;
    
      default:
          console.log("Дата некорректна")
}

let x = 12, y = -14;

if (x > 0 && y > 0) {
    console.log("Точка в первой четверти")
} else if (x > 0 && y < 0) {
    console.log("Точка в второй четверти")
} else if (x < 0 && y < 0) {
    console.log("Точка в третьей четверти")
}  
    else {
        console.log("Точка в четвертой четверти")
    }


let aFirstNumber= 12, aSecondNumber = 16, sig = '+', aResult;

switch (sig) {
    case "+":
        aResult = aFirstNumber + aSecondNumber;
        console.log (aResult);
        break;
    case "-":
        aResult = aFirstNumber - aSecondNumber;
        console.log (aResult);
    break;

    case "*":
        aResult = aFirstNumber * aSecondNumber;
        console.log (aResult);
    break;

    case "/":
        aResult = aFirstNumber / aSecondNumber;
        console.log (aResult);
    break;

    default:
    console.log("ошибка")
    break;
}

let sum = 0;
for(numbers = 1, count = 0;count < 20; numbers++ ) {
    if (numbers % 5 == 0) {
        sum += numbers;
        count++
    }
    
}
console.log(sum)

let i = 10, sque=0;
for (; i<21; i++){
    sque = i**2
    console.log(sque)
}

let n = 10, m = 3, q=1;
while (q < n) {
    m += 10;
    q++
}
console.log(m)

let w = 10, e = 0;

for (;w < 100;w++){
    if (w % 2 != 0 && w % 13 == 0) {
        e *= w;
    }
}
console.log(e)

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
        w = Math.floor(Math.random() * (w - e + 1)) + e;
    }
    console.log(w)
}
