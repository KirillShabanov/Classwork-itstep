let button = document.getElementById("calc");

button.addEventListener("click", function(){
    let number = + document.getElementById("b").value;
    let p = document.createElement("p");
    if (isFinite(number)) {
        p.innerHTML = "Является";
    } else {
        p.innerHTML = "Не является";

    }
    document.body.appendChild(p)
})