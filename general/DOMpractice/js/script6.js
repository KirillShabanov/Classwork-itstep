let button = document.getElementById("calc");

button.addEventListener("click", function(){
    let a = document.getElementsByTagName("a").item(0).href
    document.getElementsByTagName("a").item(0).innerHTML = a;
})