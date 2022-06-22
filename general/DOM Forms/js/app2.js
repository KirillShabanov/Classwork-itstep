var form = document.forms.my;
var elem = form.elements.one;
var two = form.elements.two;
var three = form.elements.three
let div = document.createElement("div");
form.onmouseout = function(){
    if (!elem.value) {
        elem.classList.add("border")
        div.innerHTML ="В поле ничего не введено"
        form.appendChild(div)

    }
    if (!isFinite(+two.value)) {
        two.classList.add("border")
        two.insertAdjacentHTML("afterend","В поле введено не число")
    }
    if (!three.value.includes("@")) {
        three.classList.add("border")
        three.insertAdjacentHTML("afterend","В поле введен не email") 
    }
}
