document.querySelector(".parent").onmouseenter = function(event){
    if(event.target.classList.contains("parent")){
        event.target.classList.add("bg-blue")
    }
    document.querySelector(".chield").onmouseenter = function(event){
    if(event.target.classList.contains("chield")){
        event.target.classList.add("bg-black")
        event.relatedTarget.classList.remove("bg-blue")
    }}
}

document.querySelector(".parent").onmouseleave = function(event){
    if(event.target.classList.contains("parent")){
        event.target.classList.remove("bg-blue")
    }
    document.querySelector(".chield").onmouseleave = function(event){
    if(event.target.classList.contains("chield")){
        event.target.classList.remove("bg-black")
        event.relatedTarget.classList.add("bg-blue")
    }}
}

document.querySelector(".parent").onmousmove = function(event){
    document.querySelector(".parent").innerHTML = event.clientX + ':' + event.clientY;
    console.log(event.clientX + ':' + event.clientY)
}

/*document.querySelector(".parent").onmouseenter = function(event){
    if(event.target.classList.contains("parent")){
        event.target.classList.add("bg-blue")
    }
    document.querySelector(".chield").onmouseenter = function(event){
    if(event.target.classList.contains("chield")){
        event.target.classList.add("bg-black")
       
    }}
}

document.querySelector(".parent").onmouseleave = function(event){
    if(event.target.classList.contains("parent")){
        event.target.classList.remove("bg-blue")
    }
    document.querySelector(".chield").onmouseleave = function(event){
    if(event.target.classList.contains("chield")){
        event.target.classList.remove("bg-black")
        
    }}
}*/