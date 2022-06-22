select.options[0].classList.add("red")
select.options[1].classList.add("blue")
select.options[2].classList.add("green")
select.options[3].classList.add("yellow")
select.options[4].classList.add("brown")

select.onchange = function(){
    document.getElementById("block").className = '';
    document.getElementById("block").classList.add(this.value)
}
