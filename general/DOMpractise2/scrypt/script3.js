document.querySelector(".parent").onclick = function(event){
    if (event.shiftKey) {
        console.log("Зажата Shift")
    }
    if (event.altKey) {
        console.log("Зажата Alt")
    }
    if (event.ctrlKey) {
        console.log("Зажата Ctrl")
    }
}