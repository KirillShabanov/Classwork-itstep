class Student{
    firstName;
    lastName;
    group;
    averageMark;
    constructor(firstName,lastName,group,averageMark){
        this.firstName = firstName;
        this.lastName = lastName;
        this.group = group;
        this.averageMark = averageMark;
    }
    getScholarship(){
        if (this.averageMark < 5) {
            console.log("Стипендия равна 80$")
        } else {
            console.log("Стипендия равна 100$")
        }
    }
}

class Aspirant extends Student {
    scientificWork;
    constructor(firstName,lastName,group,averageMark,scientificWork){
        super(firstName,lastName,group,averageMark);
        this.scientificWork = scientificWork;
    }
    getScholarship(){
        if (this.averageMark < 5) {
            console.log("Стипендия равна 180$")
        } else {
            console.log("Стипендия равна 200$")
        }
    }
}

let firstStudent = new Student("Вася","Пупкин","1а","5");
let secondStudent = new Student("Дудка","Трубник","1б","4");
let thiedStudent = new Aspirant("Гадя","Петрович","2а","5","Оченьумнаякнига");
let fourthStudent = new Aspirant("Азамат","Мусаголиев","2б","3","елки-палки");

let students = [];
students.push(firstStudent,secondStudent,thiedStudent,fourthStudent);
students.forEach(function(item) {
    item.getScholarship();
})
