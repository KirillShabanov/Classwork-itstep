function getRandomNumber(min,max) {
    return Math.floor(Math.random() * (max - min + 1)) + min;// функция по радндомному числу
}

var player = [];//создает массив игроков
var current = 1;//создает переменную хода игрока
var field = [[0,0,0],[0,0,0],[0,0,0]];// создает двумерный массив поля
var bla = '';

document.forms.start_form.start_play.onclick = function () {// событие клика по кнопке
    document.forms.start_form.classList.add("d-none");//скрывает начальную формк
    document.forms.login_form.classList.remove("d-none");// показывает форму записи игроков
    return false;
}

document.forms.login_form.start_game.onclick = function () { //событие клика по кнопке начать
    document.forms.login_form.classList.add("was-validated");// добавляет класс валидации
    if(document.forms.login_form.checkValidity())// функция проверки валидации
        {
        document.forms.login_form.classList.remove("was-validated");// удавляет класс валидации
        document.forms.login_form.classList.add("d-none");//прячет форму вписывания логинов
        
        current = getRandomNumber(1,2);//рандомно вычесляет кто первый ходит

        if(current == 1){// если 1 то ходит первы
            player[1] = document.forms.login_form.player1_name.value;//на первое место в массиве добавлем имя первого игрока
            player[2] = document.forms.login_form.player2_name.value;//второго игрока на сторое место в массиве
        } else{//тоже самое но наооброт
            player[2] = document.forms.login_form.player1_name.value;
            player[1] = document.forms.login_form.player2_name.value;
        }

        let table = document.createElement("table");// созание поля для игры
        for(let i = 0; i < 3; i++){//3 строки
            let row = document.createElement("tr");
            
            for(let j = 0; j < 3; j++){
                let data = document.createElement("td");//в каждой строке по 3 ячейки
                row.append(data)
                } 
            table.append(row);  
            }
            
        table.addEventListener("click",play, false);// создает событие в таблице при нажатии, выполняется функция play

        document.querySelector(".field").append(table);// добавляет таблицу в зарание созданный див с классом field
        document.querySelector(".current").innerHTML = `Ходит игрок <b>${player[current]}</b>`;//добавлет запись об актульном ходе игрока
        document.querySelector(".game_form").classList.remove("d-none");// показывает игровое поле
        document.querySelector(".logs").classList.remove("d-none");
        }
    return false;
}

function play(event){// создает функцию игры

    let td = event.target;// переменная в которую записвается нажатая ячейка

    if(td.tagName != "TD")// проверка чтоб фукция работала только на ячейках таблицы
        return false;  

    let x = td.cellIndex;  // переменная в которую записывается номер ячейки  
    let y = td.parentNode.rowIndex;// переменная в которую записывается номер строки

    if(field[x][y] != 0)
        return false;

    if(current == 1){// если ход первого игрока
        td.classList.add("k");// в выбранную ячейку добавляем класс к т.е. крестик
        bla = `игрок ${player[current]} поставил крестик в ${comment(x,y)}`;
        current = 2;//меняем ход на втрого
        field[x][y] = 1//в выбранное поле записываем значение 1 что является крестиком 
        
    } else {//если ход второго
        td.classList.add("n");// в выбранную ячейку добавляем класс n т.е. нолик
        bla = `игрок ${player[current]} поставил нолик в ${comment(x,y)}`;
        current = 1;//меняем ход на втрого
        field[x][y] = -1;//в выбранное поле записываем значение -1 что является ноликом
        
    }

    let winner = checkWinner();// проверяет есть ли победитель
    if(winner > 0){//если победитель есть(1 или 2)
        document.querySelector(".result").innerHTML = `Победил игрок <b>${player[winner]}</b>`;//выводит в поле результата имя победившего игрока
        document.querySelector(".current").innerHTML = ``;// очищает поле игрока который ходит
        document.querySelector(".logs").innerHTML += `Выйграл ${player[winner]}`
        document.querySelector(".field table").removeEventListener("click", play, false);// удаляет событие по клику на ячейку таблицы
    } else if(checkDraw()){//проверяет заполнение ячеек, если все ячейки заполнены а победителя нет
        document.querySelector(".current").innerHTML = ``;//очищает поле игрока который ходит
        document.querySelector(".field table").removeEventListener("click", play, false);//удаляет событие по клику на ячейку таблицы
        document.querySelector(".result").innerHTML = `Ничья`;// в поле результата выводит надпись
        document.querySelector(".logs").innerHTML += "Ничья"
    } else {// если нет победителя и есть еще незаполненые поля
        document.querySelector(".logs").innerHTML += `${bla}<br>`
        document.querySelector(".current").innerHTML = `Ходит игрок <b>${player[current]}</b>`;// выводит какого игрока сейчас ход
    }

    
}

function checkWinner() {// функция проверки побителя
    let result = Array(8).fill(0);//создает массив из 8 ячеек и заполнеяет его нулями
    //сумма по строкам
    for(let i = 0; i < 3; i++){
        let sum = 0;
        for(let j = 0; j < 3; j++){
            sum += field[i][j];
        }
        result[i] = sum;
    }

    //сумма по столбцам
    for(let i = 0; i < 3; i++){
        let sum = 0;
        for(let j = 0; j < 3; j++){
            sum += field[j][i];
        }
        result[i+3] = sum;
    }

    //сумма по главной диагонали
    let sum = 0;
    for(let i = 0; i < 3; i++){
        sum += field[i][i];
    }
    result[6] = sum;
    //сумма по побочной диагонали
    sum = 0;
    for(let i = 0; i < 3; i++){
        sum += field[i][2-i];
    }
    result[7] = sum;

    let resK = Math.max.apply(null, result);// записывает в переменную максимальное значение в массиве
    let resN = Math.min.apply(null, result);//записывает в пременную минимальное значение в массиве

    if(resK == 3)// если максимальное число 3 то выйграли креситики
        return 1;// присваиваем переменной winner значение 1(первый игрок)

    if(resN == -3)// если минимальное число -3 то выйграли нолики
        return 2;// присваиваем переменной winner значение 2(второй игрок)

    return 0;// если нет таких максимальный то присваем 0
}

function checkDraw(){//функция проверки заполняемости игрового поля
    let count = 0;
    for(let i = 0; i < 3; i++){
        for(let j = 0; j < 3; j++){
            if(field[i][j] == 0)// проверяет если пустые ячейки
                count++;// если есть увеличивает переменную на 1
        }
    }
    if(count == 0)//если пустых не осталось, то ничья
        return true;
    else
        return false;// если есть, то игра продглжается.
}
function comment(x,y){
    let comX="";
    let comY="";
    switch (x) {
        case 0 :
        comX = "влево"
        break
        case 1 :
        comX = "центр"
        break
        case 2 :
        comX = "вправо"
        break
    }
    switch (y) {
        case 0 :
        comY = "вверх"
        break
        case 1 :
        if (x == 1) {
         comY = ''   
        } else {
            comY = "центр"
        }
        break
        case 2 :
        comY = "вниз"
        break
    }
    let arr = '' + comX + ' ' + comY 
    return arr
}
