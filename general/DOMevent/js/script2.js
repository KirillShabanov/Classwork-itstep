let min = 1, max = 10, x;
x = Math.floor(Math.random() * (max - min + 1)) + min;

var button = document.getElementById("calc")

button.addEventListener("click", function(){
    let y = + document.getElementById("a").value;
    if (y > x) {
        document.getElementsByTagName("p").item(0).innerHTML = "Загаданное число меньше введенного";
    } else if (y < x) {
        document.getElementsByTagName("p").item(0).innerHTML = "Загаданное число больше введенного";
    } else {
        document.getElementsByTagName("p").item(0).innerHTML = "Угадали)";
    } 
    document.getElementById("a").value = "";
});

let button1 = document.getElementById("calc1")
button1.addEventListener("click", function(){
    x = Math.floor(Math.random() * (max - min + 1)) + min;
    document.getElementsByTagName("p").item(0).innerHTML = "Здесь должен быть ответ"
    document.getElementById("a").value = "";
});