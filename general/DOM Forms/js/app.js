document.forms[0].onmouseover = function (event) {
    if (event.target.classList.contains("input")) {
        event.target.classList.add("blue")
    }
}
document.forms[0].onmouseout = function (event) {
    if (event.target.classList.contains("input")) {
        event.target.classList.remove("blue")
    }
}