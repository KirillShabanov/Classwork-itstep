document.getElementById("general").onmouseover = function(event){
    if (event.target.tagName != "DIV") return;
    singleSelect( event.target)
    if (document.getElementById("general").classList.contains("opacity")) {
        document.getElementById("general").classList.remove("opacity")
    }
}
document.getElementById("general").onmouseout = function(event){
    singleAllRemove(event.target)
}

function singleSelect(li) {
    let selected = document.querySelectorAll('.block');
    for(let elem of selected) {
      elem.classList.remove('opacity');
    }
    li.classList.add('opacity');
  }
  function singleAllRemove(li) {
    li.classList.remove('opacity');}
