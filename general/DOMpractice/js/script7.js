button = document.getElementById("calc");
let str = "";
button.addEventListener("click",function(){
    x = document.getElementById("b").value
    str += x;
    let y = str.split("");
    y.forEach(function(item,index){
        if (isFinite(item)) {
            delete y[index]
        }
    })
    document.getElementById("b").value = y.join("")
    
})