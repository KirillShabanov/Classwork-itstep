let ul = document.createElement("ul");

button.addEventListener("click",function(){
    
    console.log(+document.querySelector("input").value)
    ul.innerHTML = "";
    for(let i = 0; i < +document.querySelector("input").value; i++){
       
        let li = document.createElement("li");
        li.innerHTML =`Пункт ${i+1}`;
        ul.appendChild(li);
    }
document.body.appendChild(ul)
})