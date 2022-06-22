let div = document.createElement("div")
let sum = 0;
document.getElementById("input").onkeyup = function(event){ 
       let imput = document.getElementById("input").value;
       imput = imput.split(" ")
       sum = 0;
       
            for (let i = 0; i< imput.length; i++){
                sum = sum + +imput[i];  
                div.innerHTML = sum;
                document.body.appendChild(div)
            }
}