
onkeydown = function(event){
if (event.code == 'NumpadAdd' && event.ctrlKey) {
    let li = document.createElement("li");
    ul.appendChild(li);
}
ul1 = document.querySelectorAll("#ul > li")
if (event.code == 'NumpadSubtract' && event.ctrlKey) {
    ul1.item(ul1.length - 1).remove()
}
}

