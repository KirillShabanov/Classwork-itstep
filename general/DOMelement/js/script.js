let element = document.getElementById("first-element");
console.log(element);

element.classList.add("www") //1.1
element.classList.remove("www")//1.2
console.log(element.classList.contains("www"))//1.3
element.classList.toggle("www")//1.4*/
console.log(element.classList)//1.5
let trglist = element.classList;//1.6
trglist.forEach(function (element){
    console.log(element)
})
element.style.cssText = `font-size: 30px;
color: red;
border : 1px;`//1.7

console.log(element.tagName) //1.8????

let newSpan = document.createElement ("span");//1.9
newSpan.innerHTML = "мой любимый спан";
element.appendChild(newSpan);

let elements = ["createElement", "appendChild", "insertBefore"];//1.10
let newList = document.createElement("ul");

elements.forEach(function(item){
    let newItem = document.createElement("li");
    newItem.innerHTML = item;
    newList.appendChild(newItem);
});

element.appendChild(newList);

element.insertAdjacentHTML('afterbegin','<div class = "neighbor">еще один сосед</div>')//1.11

element = document.getElementById("second-element");

element.insertAdjacentHTML('beforebegin','<span>!!!</span>')//2.1
element.insertAdjacentHTML('afterend','<span>!!!</span>')//2.2
element.insertAdjacentHTML('afterbegin','<span>!!!</span>')//2.3
element.insertAdjacentHTML('beforeend','<span>!!!</span>')//2.4

element = document.getElementById("second-element");


element = document.getElementById("third-element");
element.firstElementChild.style.cssText = `color: red;`//3.1
element.lastElementChild.style.cssText = `color: red;`//3.2

for (let i = 0; i < element.children.length; i++) {//3.3
    element.children[i].insertAdjacentHTML('beforeend','!!!'); 
  }

  element = document.getElementById("fourth-element");

  element.previousElementSibling.insertAdjacentHTML('beforeend','!!!');//4.1
  element.nextElementSibling.insertAdjacentHTML('beforeend','!!!');//4.2
  element.nextElementSibling.nextElementSibling.insertAdjacentHTML('beforeend','!!!');//4.3

  element = document.getElementById("fifth-element");
  element.parentElement.style.color = "blue"//5.1
 let element2 = element.parentNode;
 //element2.parentElement.style.color = "yellow";//5.2
 element.parentNode.parentNode.style.color = "yellow"