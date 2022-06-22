let div = document.createElement('div')
document.forms.form.onclick = function(){
    let sum = 0;

    if (isFinite(+document.getElementById("first").value) && isFinite(+document.getElementById("second").value)) {
       if (this.operation.value == "+") {
        sum = +document.getElementById("first").value + +document.getElementById("second").value 
        div.innerHTML = sum;
    }
    if (this.operation.value == "-") {
        sum = +document.getElementById("first").value - +document.getElementById("second").value 
        div.innerHTML = sum;
    }

    if (this.operation.value == "*") {
        sum = +document.getElementById("first").value * +document.getElementById("second").value 
        div.innerHTML = sum;
    }
    if (this.operation.value == "/") {
        sum = +document.getElementById("first").value / +document.getElementById("second").value 
        div.innerHTML = sum;
    } 
    } else {
        div.innerHTML = "Ввели не числа";

    }
    document.body.appendChild(div)
    console.log(sum)
}