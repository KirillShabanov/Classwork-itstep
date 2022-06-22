var button = document.getElementById("calc");

let ul = document.createElement("ul");
let count = 0;
button.addEventListener("click", function(){ 

for(let i = 0; i < + document.getElementById("a").value; i++){

    let li = document.createElement("li");
    li.innerHTML = `Пункт ${count + 1}`;
    ul.appendChild(li);
    count++;
}


});
document.getElementsByTagName("p").item(0).appendChild(ul);