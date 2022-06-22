ul.onclick = function(event) {
    if (event.target.tagName != "LI") return;// событие работает только на элементах списка

    if (event.ctrlKey || event.metaKey) { // условие проверки нажата ctrl или нет
      toggleSelect(event.target);//если нажата запускаем эту функцию
    } else {
      singleSelect(event.target);//если нет то эту
    }

  }

  // предотвращает ненужное выделение элементов списка при клике
  ul.onmousedown = function() {
    return false;
  };

  function toggleSelect(li) {
    li.classList.toggle('selected');//функиция которая проверяет есть в ли класс, если нет добавляет, если есть удаляет
  }

  function singleSelect(li) {
    let selected = ul.querySelectorAll('.selected');//создает объект из ЛИ собержащих класс
    for(let elem of selected) { //цикл просмотра
      elem.classList.remove('selected');//удаляет класс селектед
    }
    li.classList.add('selected');//добавляет класс
  }