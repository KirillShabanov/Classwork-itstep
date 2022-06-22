var button = document.getElementById("calc");

var count = 0;
button.addEventListener("click", function(){ 

    count++
    
    document.getElementById("result").innerHTML = count;
    });