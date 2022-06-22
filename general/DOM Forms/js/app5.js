document.forms.form.onsubmit = function(){
    if ( !this.name.value ) {
    document.getElementById("1").insertAdjacentHTML("afterend","<br>В поле ничего не введено")

        return false
    }
    if (!this.email.value.includes("@")) {
        
        document.getElementById("2").insertAdjacentHTML("afterend","<br>В поле введен не email") 
        return false
    }
    if (!this.sex.value ) {
        document.getElementById("3").insertAdjacentHTML("afterend","<br>Пол не выбран") 
        return false
    }
    if (this.sel.value == "first") {
        document.getElementById("4").insertAdjacentHTML("afterend","<br>Язык програмирования не выбран") 
        return false
    }

    if (!document.getElementById("checkbox").checked) {
        document.getElementById("5").insertAdjacentHTML("afterend","<br>Да ткни ты уже!") 
        return false
    }

    form.style.display = "none"

    let div = document.createElement("div");
    div.innerHTML = `Name:${this.name.value }<br> Email:${this.email.value}<br> Sex:${this.sex.value}<br> Programming language: ${this.sel.value}`
    document.body.appendChild(div)
    return false
}