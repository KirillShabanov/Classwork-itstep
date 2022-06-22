package org.itstep;

import java.io.*;
import java.util.Arrays;

public class WriteReadPersons {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        write();
        read();
    }
    static void write() throws IOException {
        FileOutputStream fos = new FileOutputStream("src/org/itstep/date/Person.bin");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        Person person = new Person(1, "Kirill", "+375295112110");
        person.setEmails(Arrays.asList("Kiruxa@gmail.com", "KirXXX@mail.ru", "Kir@google.com"));
        oos.writeObject(person);

        Person person2 = new Person(2, "Kristina", "+375292757349");
        person2.setEmails(Arrays.asList("Kriska@gmail.com", "Kkris@mail.ru", "Kristela@google.com"));
        oos.writeObject(person2);

        oos.close();
        fos.close();
    }

    static void read() throws IOException, ClassNotFoundException {
        FileInputStream fis = new FileInputStream("src/org/itstep/date/Person.bin");
        ObjectInputStream ois = new ObjectInputStream(fis);
        Person person = null;
        try {
            while ((person = (Person) ois.readObject()) != null) {
                System.out.println(person.toString());
            }
        }catch (EOFException e){
            System.err.println("Конец списка, баран!");  // А можно оставить пустые скобки- тупой ИГНОР проблемы!!!
        }
    }
}
