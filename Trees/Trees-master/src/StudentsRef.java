import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class StudentsRef {
    public static void main(String[] args) throws ParseException {
        /*
        Student: id, Фамилия, Имя, Отчество, Дата рождения, Адрес, Телефон,
        Факультет, Курс, Группа.
        Создать массив объектов. Вывести:
        a) список студентов заданного факультета;
        b) списки студентов для каждого факультета и курса;
        c) список студентов, родившихся после заданного года;
        d) список учебной группы.
        */
        List<Student> students = new ArrayList<Student>();
        String sBirthDate = "01.01.2000";
        DateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy");
        Date birthDate = dateFormat.parse(sBirthDate);
        Student student = new Student("Александр", "Серебрянский", "Станисл", birthDate, "Гоголя", "131654654", "ФК", 2, "1Б");
        students.add(student);
        String sBirthDate1 = "20.04.2018";
        Date birthDate1 = dateFormat.parse(sBirthDate1);
        student = new Student("Василиса","Шабанова","Кирилловна",birthDate1,"Баграмяна", "85241225", "ТЭА", 2, "ТЭАЗ-081");
        students.add(student);
        student = new Student("vasya","pupkin","Bygaga",3,"b3");
        students.add(student);
        student = new Student("vasya","pupkin","Bygaga",3,"b3");
        students.add(student);
        student = new Student("vasya","pupkin","Bygaga",3,"b3");
        students.add(student);

        System.out.println("Факультет ФЭБУ: ");
        for (Student studentTemp : students) {
            if (studentTemp.getFaculty().equals("ФЭБУ"))
                System.out.println(studentTemp.toString());
        }
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
        for (String faculty : faculties)
            System.out.println(faculty);


        for (String faculty : faculties) {
            System.out.println(faculty);
            for (int i = 1; i < 6; i++) {
                System.out.println("course:" + i);
                for (Student studentTemp : students)
                    if (studentTemp.getCourse() == i && studentTemp.getFaculty().equals(faculty))
                        System.out.println(studentTemp.toString());
            }
        }
        //список студентов, родившихся после заданного года;
        String sDate = "01.01.1986";
        Date date = dateFormat.parse(sDate);
        for (Student studentTemp : students) {
            if (studentTemp.getBirthDay() != null && studentTemp.getBirthDay().after(date))
                System.out.println(studentTemp.toString());
        }

        //список учебной группы.
        for (Student studentTemp : students) {
            if (studentTemp.getGroup().equals("1Б"))
                System.out.println(studentTemp.toString());
        }
    }
}
class Student {
    private String name;
    private String surname;
    private String patronymic = "";
    private Date birthDay;
    private String address = "";
    private String phone = "";
    private String faculty;
    private int course;
    private String group;
    private String sBirthDate;



    public Student(String name, String surname, String faculty, int course, String group) {
        this.name = name;
        this.surname = surname;
        this.faculty = faculty;
        this.course = course;
        this.group = group;
    }

    public Student(String name, String surname, String patronymic, Date birthDay, String address, String phone, String faculty, int course, String group) {
        this.name = name;
        this.surname = surname;
        this.patronymic = patronymic;
        this.birthDay = birthDay;
        this.address = address;
        this.phone = phone;
        this.faculty = faculty;
        this.course = course;
        this.group = group;

    }

    public String toString(){
        DateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy");
        if (birthDay != null)
        sBirthDate= dateFormat.format(birthDay);
        else sBirthDate = "";
        String result = String.format("name: %s, surname: %s, patronymic: %s, date of birth: %s, faculty:%s",
                name,surname,patronymic, sBirthDate,faculty);
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

    public Date getBirthDay() {
        return birthDay;
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

    public int getCourse() {
        return course;
    }

    public String getGroup() {
        return group;
    }
}

