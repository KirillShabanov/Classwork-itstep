var button = document.getElementById("calc");
let element = document.getElementById("result");
let ul = document.createElement("ul");
let classTags = element.classList;
button.addEventListener("click", function(){ 

for(let i = 0; i < 3; i++){
    
    let li = document.createElement("li");
    li.innerHTML = classTags[i];
    ul.appendChild(li);
}


});
document.getElementsByTagName("div").item(0).appendChild(ul);