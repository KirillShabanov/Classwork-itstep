package home.org;

import java.lang.reflect.Array;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 Создать классы, спецификации которых приведены ниже. Определить кон-
 структоры и методы set(), get(), toString(). Определить дополнительно
 методы в классе, создающем массив объектов. Задать критерий выбора данных
 и вывести эти данные на консоль. В каждом классе, обладающем информацией,
 должно быть объявлено несколько конструкторов.

 AbiturientsList: id, Фамилия, Имя, Отчество, Адрес, Телефон, Оценки.
 Создать массив объектов. Вывести:
 a) список абитуриентов, имеющих неудовлетворительные оценки;
 b) список абитуриентов, у которых сумма баллов выше заданной;
 c) выбрать заданное число n абитуриентов, имеющих самую высокую
 сумму баллов (вывести также полный список абитуриентов, имеющих
 полупроходную сумму).
 **/

public class AbiturientsList {
    public static void main(String[] args) {
    List<Abiturient> abiturients = new ArrayList<Abiturient>();
    Abiturient abiturient = new Abiturient("ID 001","Шабанов","Кирилл","Владимирович","г.Витебск","+375295112110",7,8,5);
    abiturients.add(abiturient);
    abiturient = new Abiturient("ID 002","Шабанова","Кристина","Васильевна","г.Городок","+375292757349",9,8,8);
    abiturients.add(abiturient);
    abiturient = new Abiturient("ID 003","Шляхто","Сергей","Юрьевич","г.Витебск","+375297149702",5,3,4);
    abiturients.add(abiturient);
    abiturient = new Abiturient("ID 004","Илья","Комлев",4,4,9);
    abiturients.add(abiturient);
    abiturient = new Abiturient("ID 005","Зезекало","Эрнест",9,6,6);
    abiturients.add(abiturient);
    abiturient = new Abiturient("ID 006","Трутченко","Тимур",3,5,8);
    abiturients.add(abiturient);


        System.out.println("Список абитуриентов, имеющих неудовлетворительные оценки:");
        for (Abiturient abiturientTemp : abiturients){
            int badGrade = 3;
            if (abiturientTemp.getProfSubjGrade1() <= badGrade || abiturientTemp.getProfSubjGrade2() <= badGrade || abiturientTemp.getProfSubjGrade3() <= badGrade)
                System.out.println(abiturientTemp);
            }

        System.out.println();
        System.out.println("Список абитуриентов, у которых сумма баллов выше заданной:");
        for (Abiturient abiturientTemp : abiturients){
            int passingScore = 22;
            if (abiturientTemp.getProfSubjGrade1() + abiturientTemp.getProfSubjGrade2() + abiturientTemp.getProfSubjGrade3() > passingScore)
                System.out.println(abiturientTemp);
        }

        System.out.println();
        int givAmount = 2;
        System.out.println("Выбрать " + givAmount + " абитуриентов, имеющих самую высокую сумму баллов:");
        Collections.sort(abiturients);
        int count = 0;
        for (Abiturient abiturientTemp : abiturients){
            int passingScore = 12;
            int badGrade = 3;
            if (abiturientTemp.getProfSubjGrade1() + abiturientTemp.getProfSubjGrade2() + abiturientTemp.getProfSubjGrade3() > passingScore && abiturientTemp.getProfSubjGrade1() > badGrade && abiturientTemp.getProfSubjGrade2() > badGrade && abiturientTemp.getProfSubjGrade3() > badGrade && count < givAmount) {
                count++;
                System.out.println(abiturientTemp);
            }
        }
        System.out.println();
        System.out.println("Полный список абитуриентов, имеющих полупроходной балл: ");
        for (Abiturient abiturientTemp : abiturients){
            int passingScore = 20;
            int passScore = 11;
            int badGrade = 3;
            if (abiturientTemp.getProfSubjGrade1() + abiturientTemp.getProfSubjGrade2() + abiturientTemp.getProfSubjGrade3() > passScore && abiturientTemp.getProfSubjGrade1() > badGrade && abiturientTemp.getProfSubjGrade2() > badGrade && abiturientTemp.getProfSubjGrade3() > badGrade && abiturientTemp.getProfSubjGrade1() + abiturientTemp.getProfSubjGrade2() + abiturientTemp.getProfSubjGrade3() < passingScore) {
                System.out.println(abiturientTemp);
            }
        }
    }
}
 class Abiturient implements Comparable<Abiturient>{
    private String id;
    private String name;
    private String surname;
    private String patronymic = "";
    private String address = "";
    private String phone = "";
    int profSubjGrade1;
    int profSubjGrade2;
    int profSubjGrade3;

     public Abiturient(String id, String name, String surname, String patronymic, String address, String phone, int profSubjGrade1, int profSubjGrade2, int profSubjGrade3) {
         this.id = id;
         this.name = name;
         this.surname = surname;
         this.patronymic = patronymic;
         this.address = address;
         this.phone = phone;
         this.profSubjGrade1 = profSubjGrade1;
         this.profSubjGrade2 = profSubjGrade2;
         this.profSubjGrade3 = profSubjGrade3;
     }

     public Abiturient(String id, String name, String surname, int profSubjGrade1, int profSubjGrade2, int profSubjGrade3) {
         this.id = id;
         this.name = name;
         this.surname = surname;
         this.profSubjGrade1 = profSubjGrade1;
         this.profSubjGrade2 = profSubjGrade2;
         this.profSubjGrade3 = profSubjGrade3;
     }

    public String toString () {
        if (patronymic == "" && address == "" && phone == "") {
            String result = String.format("%s %s %s: Оценки %d, %d, %d.", id, name, surname, profSubjGrade1, profSubjGrade2, profSubjGrade3);
            return result;
        } else {
            String result = String.format("%s %s %s %s: Оценки %d, %d, %d. Телефон для связи: %s. Адрес: %s", id, name, surname, patronymic, profSubjGrade1, profSubjGrade2, profSubjGrade3, phone, address);
            return result;
        }
    }

     public String getId() {
         return id;
     }

     public String getName() {
         return name;
     }

     public String getSurname() {
         return surname;
     }

     public String getPatronymic() {
         return patronymic;
     }

     public String getAddress() {
         return address;
     }

     public String getPhone() {
         return phone;
     }

     public int getProfSubjGrade1() {
         return profSubjGrade1;
     }

     public int getProfSubjGrade2() {
         return profSubjGrade2;
     }

     public int getProfSubjGrade3() {
         return profSubjGrade3;
     }

     @Override
     public int compareTo(Abiturient o) {
         return -(this.getProfSubjGrade1() + this.getProfSubjGrade2() + this.getProfSubjGrade3() - o.getProfSubjGrade1() - o.getProfSubjGrade2() - o.getProfSubjGrade3());
     }
 }
