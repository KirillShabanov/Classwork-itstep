let button = document.getElementById("button");
let p =document.getElementById("p");
let b = document.getElementById("b");
let c = document.getElementById("c");
let imputWord,firstWord, secondWord,exam=0;
let first = "", second = "",count = 0,city =[];
button.addEventListener("click",function (){
    if (count == 0) {
        city[0] = document.getElementById("a").value
        count++;
        p.innerHTML = "Следующий игрок"
        b.innerHTML = `${document.getElementById("a").value}<br>`
    } 
    else {
    
    imputWord = document.getElementById("a").value
    firstWord = city[count - 1];
    firstWord = firstWord.split("");
    secondWord = imputWord.split(""); 
    for (let i = 0; i< city.length;i++){
        if (document.getElementById("a").value === city[i]) {
            exam =+1;

        }

    }
    city[count] = document.getElementById("a").value
 if (exam) {
    p.innerHTML = "Этот город уже был"
    exam = 0;
 } else if (firstWord[firstWord.length - 1] == "ы"||firstWord[firstWord.length - 1] == "ъ"||firstWord[firstWord.length - 1] == "ь"||firstWord[firstWord.length - 1] == "ё") {
    if (firstWord[firstWord.length - 2] == secondWord[0]) {
        city[count] = document.getElementById("a").value;
        p.innerHTML = "Следующий ход"
        if (count % 2 == 0) {
            b.innerHTML += `${document.getElementById("a").value}<br>`
        } else {
            c.innerHTML += `${document.getElementById("a").value}<br>`
        }
        count++;
    } else {
        p.innerHTML = "неправильный город"
    }
} else if (firstWord[firstWord.length - 1] == secondWord[0]) {
    city[count] = document.getElementById("a").value;
    p.innerHTML = "Следующий ход"
    if (count % 2 == 0) {
        b.innerHTML += `${document.getElementById("a").value}<br>`
    } else {
        c.innerHTML += `${document.getElementById("a").value}<br>`
    }
    count++
} else {
    p.innerHTML = "неправильный город"
}
} 
})