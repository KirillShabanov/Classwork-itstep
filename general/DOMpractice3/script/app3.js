let container = document.querySelectorAll("#container > div");
button1.onclick = function(){
    for(let i = 0; i < container.length; i++){
        container[i].innerHTML="";
    }
    let cicrcle = document.createElement("div");
    cicrcle.classList.add("circle")
    container.item(Math.floor(Math.random() * 16)).appendChild(cicrcle);
}

button2.onclick = function(){
 for(let i = 0; i <container.length;i++){

    if (container[i].classList.contains("white")) {
        container[i].classList.remove("white");
        container[i].classList.add("black");
    }
    else if (container[i].classList.contains("black")) {
        container[i].classList.remove("black");
        container[i].classList.add("white");
    }

 }
}
var angle = 0;
button3.onclick = function(){
    angle += 90;
document.querySelector("#container").style.transform = `rotate(${angle}deg)`
}