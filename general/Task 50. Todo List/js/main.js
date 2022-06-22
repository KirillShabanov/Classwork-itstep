var todoList = []
let liList = document.querySelectorAll("li");

for (let i = 0; i < liList.length; i++){
  todoList[i] = liList[i]
  //console.log(todoList[i])
}

document.forms.todo_form.button.onclick = function(){
  liList = document.querySelectorAll("li");
  todoList = []
  for (let i = 0; i < liList.length; i++){
    todoList[i] = liList[i]
  }
    let li = document.createElement("li");
    li.innerHTML = `${document.forms.todo_form.task.value}<span class="close">×</span><span class = "arrow">&#9998;</span>`
    li.draggable = true;
    document.querySelector("ul").append(li);

    return false
}

document.querySelector("ul").onclick = function(event){
  liList = document.querySelectorAll("li");
  todoList = []
  for (let i = 0; i < liList.length; i++){
    todoList[i] = liList[i]
    console.log(liList[i])
  } 
  let li = event.target;
 if(li.tagName == "LI")
 for (let i = 0; i < liList.length; i++){
  todoList[i] = liList[i]
  console.log(liList[i])
} 

 
    li.classList.toggle("checked")

 
 if (li.classList.contains("close")) {
  liList = document.querySelectorAll("li");
  todoList = []
  for (let i = 0; i < liList.length; i++){
    todoList[i] = liList[i]
  }  
  li.parentNode.remove()

}
if (li.classList.contains("arrow")) {
  liList = document.querySelectorAll("li");
  todoList = []
  for (let i = 0; i < liList.length; i++){
    todoList[i] = liList[i]
  }
  document.forms.todo_form.button.style.display = "none";
  document.forms.todo_form.edit_btn.style.display = "block";
  onkeydown = function (event) {
  if (event.code == "Escape") {
    document.forms.todo_form.button.style.display = "block";
    document.forms.todo_form.edit_btn.style.display = "none";
    let list = document.querySelectorAll("li");
    for(let i = 0; i < list.length; i++){
        list[i].classList.remove("add")
        document.forms.todo_form.task.value = ''
    }     }
  }
    let list = document.querySelectorAll("li");
    for(let i = 0; i < list.length; i++){
        list[i].classList.remove("add")
    }     
        let text ='';
        text += li.parentNode.firstChild.textContent
        document.forms.todo_form.task.value = text;
        li.parentNode.classList.add("add")
    }

 
}


document.forms.todo_form.edit_btn.onclick = function(){
  liList = document.querySelectorAll("li");
  todoList = []
  for (let i = 0; i < liList.length; i++){
    todoList[i] = liList[i]
  }
  document.querySelector(".add").innerHTML = `${document.forms.todo_form.task.value}<span class="close">×</span><span class = "arrow">&#9998;</span>`
document.querySelector(".add").classList.remove(".add")
document.forms.todo_form.button.style.display = "block";
document.forms.todo_form.edit_btn.style.display = "none";
document.forms.todo_form.task.value = ''
return false
}

//5
const tasksListElement = document.querySelector("ul");
const taskElements = tasksListElement.querySelectorAll("li");

// Перебираем все элементы списка и присваиваем нужное значение
for (const task of taskElements) {
    task.draggable = true;
  }

  tasksListElement.addEventListener(`dragstart`, function(event){//добавление класса для начала перетаскивания.
    event.target.classList.add(`selected`);
  })
  
  tasksListElement.addEventListener(`dragend`, function(event){ //Удаление класса при окончании перетаскивания.
    event.target.classList.remove(`selected`);
  });

  tasksListElement.addEventListener(`dragover`, function(event){
    // Разрешаем сбрасывать элементы в эту область
    event.preventDefault();
  
    // Находим перемещаемый элемент
    const activeElement = tasksListElement.querySelector(`.selected`);
    // Находим элемент, над которым в данный момент находится курсор
    const currentElement = event.target;
    // Проверяем, что событие сработало:
    // не на том элементе, который мы перемещаем,
    const isMoveable = activeElement !== currentElement
  
    // Если нет, прерываем выполнение функции
    if (!isMoveable) {
      return;
    }
  
    // Находим элемент, перед которым будем вставлять
    const nextElement = (currentElement === activeElement.nextElementSibling) ?
        currentElement.nextElementSibling :
        currentElement;
  
    // Вставляем activeElement перед nextElement
    tasksListElement.insertBefore(activeElement, nextElement);
  });

  const getNextElement = function(cursorPosition, currentElement){
    // Получаем объект с размерами и координатами
    const currentElementCoord = currentElement.getBoundingClientRect();
    // Находим вертикальную координату центра текущего элемента
    const currentElementCenter = currentElementCoord.y + currentElementCoord.height / 2;
  
    // Если курсор выше центра элемента, возвращаем текущий элемент
    // В ином случае — следующий DOM-элемент
    const nextElement = (cursorPosition < currentElementCenter) ?
        currentElement :
        currentElement.nextElementSibling;
  
    return nextElement;
  };

  onkeydown = function (event) {
    
    if (event.code == 'KeyZ' && (event.ctrlKey || event.metaKey)) {
     // console.log(liList)
      
      document.querySelector("ul").innerHTML = '';
      for (let i = 0; i < todoList.length; i++){
        let li = document.createElement("li")
        //li.outerHTML = liList[i].outerHTML;
        document.querySelector("ul").innerHTML += todoList[i].outerHTML;
        
        //document.querySelector("ul").innerHTML += liList[i];
      }
    }
  }

  function persistence(num) {
    let i=0;
    num = (num + "").split("")
    console.log(num)
    while ( num.length > 1){
      num = num.reduce((a,b)=>a*b);
      console.log(num)
      num = (num + "").split("")
      console.log(num)
      i++
    }
   return i
 }
 let num = [3,9]

console.log([3,9].reduce(function (a,b) {return a * b},1))
console.log(persistence(999))
console.log(num.length)