var sideOfSquare = 3;
var perimetrOfSquare = sideOfSquare * 4;
console.log(perimetrOfSquare);

var circleRadius = 4, areaOfaCircle;
areaOfaCircle = Math.PI * (circleRadius ** 2);
console.log(areaOfaCircle);

var firstLeg = 5, secondLeg = 7, hypotenuse;
hypotenuse = (firstLeg ** 2) + (secondLeg ** 2);
hypotenuse = hypotenuse ** 0.5;
console.log(hypotenuse);

var a = 2, b = 3, c;
c = a;
a = b;
b = c;

console.log(a,b)

var d = 2, e = 3;


 var number = 123, firstNumber, secondNumber, thirdNumber, numbersSum, reverseNumber = "";
 firstNumber = Math.floor(number / 100);
 secondNumber = Math.floor(number / 10);
 secondNumber = secondNumber % 10;
 thirdNumber = number % 10;
 numbersSum = firstNumber + secondNumber + thirdNumber;
 console.log(numbersSum);

 reverseNumber = reverseNumber + thirdNumber + secondNumber + firstNumber;
 console.log(reverseNumber);

 var credit = 1000;
 credit = credit + (credit * 10) / 100;
 credit = credit + (credit * 10) / 100;
 credit = credit + (credit * 10) / 100;
 console.log(credit - 1000);

 var min = 1, max = 10, randomNumber;
 randomNumber = Math.random() * (max - min + 1) + min;

 console.log(randomNumber);





