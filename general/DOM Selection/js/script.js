/*let element = document.getElementById("first-element");

let elements = document.getElementsByTagName("div");

console.log(elements.length);

let sections = document.getElementsByClassName("first-section");

let section = sections.item(0);// sections[0];

let sectionDivs = section.getElementsByTagName("div");

console.log(sectionDivs.length);

let divs = document.querySelectorAll(".first-section div");

console.log(divs.length);*/

let element = document.querySelectorAll(".first-section .neighbor");
console.log(element)

for (let i = 0; i < element.length; i++){
    element.item(i).innerHTML = "я хороший сосед"//1,1
}

for (let i = 0; i < element.length; i++){
    element.item(i).innerHTML = "я хороший сосед №"+(i+1)//1.2
}

/*for (let i = 0; i < element.length; i++){
    element.item(i).innerHTML = `<span> я хороший сосед №${+(i+1)}</span>`//1.3
}*/


for (let i = 0; i < element.length; i++){//1.3
    element.item(i).innerHTML = '';
    let newSpan = document.createElement("span");
    newSpan.innerHTML = "я хороший сосед №"+(i+1);
    element.item(i).appendChild(newSpan);
}

for (let i = 0; i < element.length; i++){//1.4
    let span = element.item(i).getElementsByTagName("span").item(0);
    span.outerHTML = `<b>${span.innerHTML}</b>`
}

let neighbor = document.querySelectorAll(".first-section .fourth-neighbor")//1.5
console.log(neighbor);
neighbor.item(0).innerHTML = "я последний хороший сосед №4"

/*element = document.getElementById("second-element");//2.1
console.log(element)
let out = "<ul>";
for (let i = 0; i < 10; i++){
    out += `<li>Пункт${i+1}</li>`
}
out += "</ul>";
element.innerHTML += out;

element = document.querySelectorAll("#second-element ul li");

for (let i = 0; i < element.length; i++){//2.2
    if (i % 2 != 0) {
        element.item(i).style.color = "red"
    } 
}

for (let i = 0; i < element.length; i++){//2.3
    if (i % 2 == 0) {
        element.item(i).classList.add("odd-element")
    } 
}*/
element = document.getElementById("second-element");
//2.1
let ul = document.createElement("ul");

for(let i = 1; i <= 10; i++){
    let li = document.createElement("li");
    li.innerHTML = `Пункт ${i}`;
    ul.appendChild(li);
}

element.appendChild(ul);

//2.2

let evenItems = document.querySelectorAll("#second-element ul li:nth-child(2n)");
evenItems.forEach(function(item){
    item.style.color = "#f00";
})

evenItems = element.getElementsByTagName("li");
for(let i = 0; i < evenItems.length; i++){
    if( i % 2 == 1){
        evenItems.item(i).style.color = "red";
    }
}

//2.3
let oddItems = document.querySelectorAll("#second-element ul li:nth-child(2n+1)");
oddItems.forEach(function(item){
    item.classList.add("odd-element");
})

//2.4
let items = document.querySelectorAll("#second-element ul li:nth-child(3n)");
items.forEach(function(item){
    if(item.classList.contains("odd-element")){
        item.style.fontSize = "28px";   
    }
})


//3

element = document.getElementById("third-element");

//3.1
let tagBs = element.getElementsByTagName("b");
let x = tagBs.length;
for(let i = 0; i < x; i++){
    tagBs.item(0).outerHTML = `<strong>${tagBs.item(0).innerHTML}</strong>`;    
}

//3.2
let strongs = element.getElementsByTagName("strong");
//console.log(strongs)
for(let i = 0; i < strongs.length; i++){
    let x = strongs.item(i);
    let newContent = "";
    for(let j = 0; j < x.childNodes.length; j++){
        newContent += x.childNodes.item(j).textContent;
    }
    x.innerHTML = newContent;
}   

//3.3
for(let i = 0; i < strongs.length; i++){
    let words = strongs.item(i).textContent.split(" ");
    strongs.item(i).innerHTML = "";
    words.forEach(function(word){
        let span = document.createElement("span");
        span.textContent = word;
        strongs.item(i).appendChild(span);
    });
}

// 4 
element = document.getElementById("fourth-element");

//4.1
let divs = element.parentElement.getElementsByTagName("div");

for(let i = 0; i < divs.length; i++){
    console.log(divs.item(i).textContent);
}

//4.2
let texts = [];
for(let i = 0; i < divs.length; i++){
    texts.push(divs.item(i).textContent);
}
texts.reverse();
for(let i = 0; i < divs.length; i++){
    divs.item(i).textContent = texts[i];
}

//4.3
divs.item(1).remove(); //divs.item(1).outerHTML = "";

//4.4
divs.item(0).insertAdjacentHTML("afterend", "<div>Я пятый сосед</div>");

//4.5
divs.item(1).style.border = "1px solid #000";
divs.item(1).style.padding = "10px";
divs.item(1).style.backgroundColor = "#ff0";

element = document.getElementById("fifth-element");

for(i = 0; i < 4; i++){
    let div1 = document.createElement("div");
    div1.innerHTML = "я сосед";
    element.appendChild(div1);
    div1.classList.add("neighbor");
}
let div1 = element.getElementsByTagName("div");
div1.item(0).classList.add("first-neighbor");
div1.item(1).classList.add("second-neighbor");
div1.item(2).classList.add("third-neighbor");
div1.item(3).classList.add("fourth-neighbor");

div1.item(1).insertAdjacentHTML(`afterend`, `<div> Я элемент </div>`);
div1.item(2).classList.add("my-class");
div1.item(2).classList.add("not-my-class");
div1.item(2).setAttribute("id", "fidasadasast-element")


