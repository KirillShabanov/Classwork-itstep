let button =document.getElementById("button");
let text;

button.addEventListener("click", function(){
    let val = button.textContent;
    switch(val){
        case "Сохранить":
            text = input.value;
            document.querySelector("input").style.display = "none"
            document.querySelector("p").textContent = text
            document.querySelector("p").style.display = "block";
            button.textContent = "Редактировать"; break;

        case "Редактировать":
            text = document.querySelector("p").textContent
            document.querySelector("p").style.display = "none"
            input = document.createElement('input');
            input.value = text;
            document.querySelector("div").append(input)
            button.textContent = "Сохранить";     break; 
    }

 
})
