package home.org;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 Создать классы, спецификации которых приведены ниже. Определить кон-
 структоры и методы set(), get(), toString(). Определить дополнительно
 методы в классе, создающем массив объектов. Задать критерий выбора данных
 и вывести эти данные на консоль. В каждом классе, обладающем информацией,
 должно быть объявлено несколько конструкторов.

 Student: id, Фамилия, Имя, Отчество, Дата рождения, Адрес, Телефон,
 Факультет, Курс, Группа.
 Создать массив объектов. Вывести:
 a) список студентов заданного факультета;
 b) списки студентов для каждого факультета и курса;
 c) список студентов, родившихся после заданного года;
 d) список учебной группы.
 **/

public class StudentsRef {
    public static void main(String[] args) throws ParseException {
        List<Student> students = new ArrayList<Student>();
        String sBirthDate = "14.10.1989";
        DateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy");
        Date birthDate = dateFormat.parse(sBirthDate);
        Student student = new Student("Шабанов","Кирилл","Владимирович",birthDate,"Витебск","5112110","Автомеханический","ТЭАЗ",4);
        students.add(student);
        String sBirthDate1 = "05.09.1990";
        Date birthDate1 = dateFormat.parse(sBirthDate1);
        student = new Student("Шляхто","Сергей","Юрьевич",birthDate1,"Витебск","7149702","Автомеханический","ТЭАЗ",4);
        students.add(student);
        student = new Student("Бамбарбек","Борис","Автосервис","АС",3);
        students.add(student);
        student = new Student("Чебурек","Ибрагим","Автосервис","АС",2);
        students.add(student);
        student = new Student("Зезекало","Эрнест","Сантехнический","СантПлюс",6);
        students.add(student);

        System.out.println("Факультет Автомеханический: ");
        for (Student studentTemp : students) {
            if (studentTemp.getFaculty().equals("ТЭАЗ"))
               // if ("ТЭАЗ".equals(studentTemp.getFaculty())
                System.out.println(studentTemp.toString());
        }
        //Факультеты
        List<String> faculties = new ArrayList<>();
        for (Student studentTemp : students) {
            if (faculties.isEmpty())
                faculties.add(studentTemp.getFaculty());
            else {
                String faculty = studentTemp.getFaculty();
                if (!faculties.contains(faculty))
                    faculties.add(faculty);
            }
        }
        for (String faculty : faculties) {
            System.out.println(faculty);
            for (int i = 1; i < 6; i++) {
                System.out.println("course " + i);
                for (Student studentTemp : students)
                    if (studentTemp.getCourse() == i && studentTemp.getFaculty().equals(faculty))
                        System.out.println(studentTemp.toString());
            }
        }
        //список студентов, родившихся после заданного года;
        String sDate = "01.01.1986";
        Date date = dateFormat.parse(sDate);
        for (Student studentTemp : students) {
            if (studentTemp.getBirthDate() != null && studentTemp.getBirthDate().after(date))
                System.out.println(studentTemp.toString());
        }

        //список учебной группы.
        for (Student studentTemp : students) {
            if (studentTemp.getGroup().equals("АС"))
                System.out.println(studentTemp.toString());
        }


    }


    static class Student {
        private String name;
        private String surname;
        private String patronymic = "";
        private Date birthDate;
        private String address = "";
        private String phone = "";
        private String faculty = "";
        private String group = "";
        private int course;

        public Student(String name, String surname, String patronymic, Date birthDate, String address, String phone, String faculty, String group, int course) {
            this.name = name;
            this.surname = surname;
            this.patronymic = patronymic;
            this.birthDate = birthDate;
            this.address = address;
            this.phone = phone;
            this.faculty = faculty;
            this.group = group;
            this.course = course;
        }

        public Student(String name, String surname, String faculty, String group, int course) {
            this.name = name;
            this.surname = surname;
            this.faculty = faculty;
            this.group = group;
            this.course = course;
        }

        public String toString() {
            DateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy");
            String sBirthDate;
            if (birthDate != null)
                sBirthDate = dateFormat.format(birthDate);
            else sBirthDate = "";
            String result = String.format("name: %s, surname: %s, patronymic: %s, date of birth: %s, faculty:%s",
                    name, surname, patronymic, sBirthDate, faculty);
            return result;


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

        public Date getBirthDate() {
            return birthDate;
        }

        public String getAddress() {
            return address;
        }

        public String getPhone() {
            return phone;
        }

        public String getFaculty() {
            return faculty;
        }

        public String getGroup() {
            return group;
        }

        public int getCourse() {
            return course;
        }
    }
}
