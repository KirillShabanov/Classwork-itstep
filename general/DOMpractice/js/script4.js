let button = document.getElementById("calc")

button.addEventListener("click", function(){
    let x = document.getElementById("a").value;
    let y = document.getElementById("b").value;
    document.getElementById("a").value = y;
    document.getElementById("b").value = x;
})