button = document.getElementById("calc");
button1 = document.getElementById("calc1");
button2 = document.getElementById("calc2");
let arr = [1,2,3,4,5,6,7,8,9,"a","b","c","d","e",'f']
getColor = function(){
let x = ""
for(let i = 0; i < 6; i++){
    x = x + arr[Math.floor(Math.random() * 16)]   
}
return x = "#" + x;
}

button.addEventListener("click",function(){
button1.style.background = getColor();
button2.style.background = getColor();
});

button1.addEventListener("click",function(){
button.style.background = getColor();
button2.style.background = getColor();
});

button2.addEventListener("click",function(){
button1.style.background = getColor();
button.style.background = getColor();
})    