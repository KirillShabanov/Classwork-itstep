ul.onclick = function(event) {
    if (event.target.tagName != "LI") return;
      singleSelect(event.target);
  }

  ul.onmousedown = function() {
    return false;
  };

  function toggleSelect(li) {
    li.classList.toggle('selected');
  }

  function singleSelect(li) {
    let selected = ul.querySelectorAll('.selected');
    for(let elem of selected) {
      elem.classList.remove('selected');
    }
    li.classList.add('selected');
  }

ul.ondblclick = function(event){

        let li = document.createElement("li");
        li.innerHTML = event.target.innerHTML;
        ul.appendChild(li);
}
var text;
ul.onmouseover = function(event){
    text = event.target.innerHTML;
    event.target.innerHTML = `<b>${event.target.innerHTML}</b>`
}
ul.onmouseout = function(event){
    event.target.innerHTML = text;
}
