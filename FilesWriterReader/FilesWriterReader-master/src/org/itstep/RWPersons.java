package org.itstep;

import java.io.*;
import java.util.Arrays;

public class RWPersons {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        write();
        read();
    }
    static void write() throws IOException {
        FileOutputStream fos = new FileOutputStream("src/org/itstep/date/Persons.bin");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        Person person = new Person(1, "Kirill", "+375295112110");
        person.setEmails(Arrays.asList("Kiruxa@gmail.com", "KirXXX@mail.ru", "Kir@google.com"));

        Person person2 = new Person(2, "Kristina", "+375292757349");
        person2.setEmails(Arrays.asList("Kriska@gmail.com", "Kkris@mail.ru", "Kristela@google.com"));

        Persons persons = new Persons();
        persons.addPerson(person);
        persons.addPerson(person2);
        oos.writeObject(persons);

        oos.close();
        fos.close();
    }

    static void read() throws IOException, ClassNotFoundException {
        FileInputStream fis = new FileInputStream("src/org/itstep/date/Persons.bin");
        ObjectInputStream ois = new ObjectInputStream(fis);
        Persons persons = (Persons) ois.readObject();
        persons.getPersons().forEach(person -> System.out.println(person.toString()));
        ois.close();
        fis.close();
    }
}
