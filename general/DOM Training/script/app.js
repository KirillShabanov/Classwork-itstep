document.querySelector(".game-btn").onclick = function(){
    document.querySelector(".begin-screen").style.display = "none"
    document.querySelector(".players-names-form").classList.remove("d-none")
}

document.querySelector(".start-game").onclick = function(){
    document.querySelector(".players-names-form").style.display = "none"
    document.querySelector(".game-panel").classList.remove("d-none")
    document.querySelector(".game-logs").classList.remove("d-none")
    for(let i = 0; i < 9; i++){
        let div = document.createElement("div");
        div.classList.add("field")
        div.classList.add(`field-${i+1}`)
        document.querySelector(".game-field").appendChild(div)
    }
}
document.querySelector(".player1").onkeyup = function(){
    if(document.querySelector(".player1").value)
    {document.querySelector(".player1").classList.add("is-valid")
    document.querySelector(".player1").classList.remove("is-invalid")}
    else {
    document.querySelector(".player1").classList.add("is-invalid")
    document.querySelector(".player1").classList.remove("is-valid")}
}
document.querySelector(".player2").onkeyup = function(){
    if(document.querySelector(".player2").value)
    {document.querySelector(".player2").classList.add("is-valid")
    document.querySelector(".player2").classList.remove("is-invalid")}
    else {
    document.querySelector(".player2").classList.add("is-invalid")
    document.querySelector(".player2").classList.remove("is-valid")}
}

document.querySelector("game-field").oncklick = function(event){
    
}
    
