let str = "js";//1
console.log(str.toUpperCase());

str = 'JS';//2
console.log(str.toLowerCase());

str = "я учу javascript!";//3
console.log(str.length);

console.log(str.substr(6,11));//4

console.log(str.substring(6,17));//4

console.log(str.slice(6));//4

console.log(str.indexOf("учу"));//5

let re = /!/gi, longstr = "jdfkdfpkinsg;ksdft nlzpoibg oihjfskdfjkghasai oaurgh[aiojuf", n= 17, result = '';//6

if (longstr.length > n) {
    result = longstr.substr(0,n) + '...';
} else {
    result = longstr;
}

console.log(result);

let newstr = ''
str = "Я-учу-javascript!";//7
for (let i = 0; i < str.length; i++){
    if (str[i] == '-') {
        newstr = newstr + '!'
    } else {
        newstr = newstr + str[i]
    }
}
console.log(newstr);

str = "Я учу javascript!";//8
 let arr = str.split(" ");
 console.log(arr);

 str = "Я учу javascript!";//9
 arr = str.split("");
 console.log(arr);

 let date = '2021-12-31';//10
  let newDate = date.split("-");
  date = newDate.reverse();
  console.log(date);
  newDate = '';
  for (let i = 0; i < date.length-1 ; i++){
    newDate += date[i]+ ".";           
} 
newDate += date[date.length-1];
  console.log(newDate);


  str = ['я', 'учу', 'javascript', '!'];//11
console.log(str.join("+"));

str = "я учу javascript!"//12
let arrr = str.split(" ");
 arrr[0] = arrr[0].toUpperCase();
 str = '';
 str = arrr.join(' ');
 console.log(str);

str = "я учу javascript!";//13
arr = str.split('');
arr[0] = arr[0].toUpperCase();
for(let i = 1; i < arr.length; i++){
    if (arr[i] == ' ') {
        arr[i+1] = arr[i+1].toUpperCase();
    }
}
str = arr.join("");
console.log(str);

str = "var_test_text";//14
arr = str.split('_').join(" ").split("");
for(let i = 1; i < arr.length; i++){
    if (arr[i] == ' ') {
        arr[i+1] = arr[i+1].toUpperCase();
    }
}
str = arr.join('').split(' ').join('');
console.log(str)

















