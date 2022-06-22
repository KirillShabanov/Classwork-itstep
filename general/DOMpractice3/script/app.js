document.querySelector(".block").onmouseover = function(event){
    if(event.target.classList.contains("block")){
        event.target.classList.add("bg-blue")
    }
}
document.querySelector(".block").onmouseout = function(event){
    if(event.target.classList.contains("block")){
        event.target.classList.remove("bg-blue")
    }
}
document.querySelector(".block").oncontextmenu = function(event){
    let width = getComputedStyle(document.querySelector('.block'));
    let realWigth = width.width.split("px");
    realWigth[0] = realWigth[0] * "2"+"px" 
    realWigth = realWigth.join('');
    document.querySelector('.block').style.width = realWigth;

    let realHeight = width.height.split("px");
    realHeight[0] = realHeight[0] * "2"+"px" 
    realHeight = realHeight.join('');
    document.querySelector('.block').style.height = realHeight;

    return false;
}

document.querySelector(".block").onclick = function(event){
    let width = getComputedStyle(document.querySelector('.block'));
    let realWigth = width.width.split("px");
    realWigth[0] = realWigth[0] / "2"+"px" 
    realWigth = realWigth.join('');
    document.querySelector('.block').style.width = realWigth;

    let realHeight = width.height.split("px");
    realHeight[0] = realHeight[0] / "2"+"px" 
    realHeight = realHeight.join('');
    document.querySelector('.block').style.height = realHeight;

    
}