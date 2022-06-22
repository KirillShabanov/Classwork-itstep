package org.itstep.Persons;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;


import javax.xml.bind.*;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PersonsParser {
    public static void main(String[] args) {
        String url = "https://veteran-vov.vagsh.mil.ru/vov";
        String selector = "div>ul>li>a[href]";
        Document document = null;
         try {
         document = Jsoup.connect(url).get();
         } catch (IOException e) {
         e.printStackTrace();
         }
        assert document != null;
        Elements names = document.select(selector);
         System.out.println(names.size());

        Person person = new Person();
        Persons persons = new Persons();
        persons.add(person);

         for (Element element : names){
         String html = element.html();
         String name = html.trim();
         String [] strings = name.trim().split("\\s+");
         Arrays.stream(strings).forEach(String::trim);
             if (strings.length > 2)
                 persons.add(new Person(strings[0], strings[1], strings[2]));
         System.out.println(html);
         }

        PersonsRW namesRw = new PersonsRW();
        namesRw.setPersons(persons);
        namesRw.write();
    }
}
    @XmlRootElement(name="person")
    @XmlAccessorType(XmlAccessType.FIELD)
    class Person{


        private String surname;
        private String name;
        private String patronymic;

        public Person(){}

        public String getSurname() {
            return capitalizeFirst(surname);
        }

        public String getName() {
            return capitalizeFirst(name);
        }

        public String getPatronymic() {
            return capitalizeFirst(patronymic);
        }
        public Person(String surname, String name, String patronymic) {
            this.surname = capitalizeFirst(surname);
            this.name = capitalizeFirst(name);
            this.patronymic = capitalizeFirst(patronymic);
        }
        public String capitalizeFirst(String s){
            return s.substring(0,1).toUpperCase() + s.substring(1).toLowerCase();
        }
    }
    @XmlRootElement(name="persons")
    @XmlAccessorType(XmlAccessType.FIELD)

    class Persons {
        @XmlElement(name = "persons")
        private List<Person> persons = new ArrayList<>();

        public Persons() {
        }

        public List<Person> getPersons() {
            return persons;
        }

        public void setPersons(List<Person> persons) {
            this.persons = persons;
        }

        public void add(Person person) {
            persons.add(person);
        }
    }

    class PersonsRW {
        private Persons persons =  null;
        // private Person person = new Person("1","2","3");
        private final String path = "src/org/itstep/date/persons.xml";

        public void addPerson(Person person){
            persons.add(person);
        }

        public void write(){
            try {
                JAXBContext jaxbContext = JAXBContext.newInstance(Persons.class);
                Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
                jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE); // To format XML

                //Print XML String to file
                jaxbMarshaller.marshal(persons, new File(path));

            } catch (JAXBException ex) {
                ex.printStackTrace();

                System.err.println
                ("Cannot to write to file " + path);
            }
        }

        public void read(){
            try {
                JAXBContext jaxbContext = JAXBContext.newInstance(Persons.class);
                Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
                persons = (Persons) jaxbUnmarshaller.unmarshal( new File(path) );
            } catch (JAXBException e) {
                e.printStackTrace();
            }

        }

        public Persons getPersons() {
            return persons;
        }

        public void setPersons(Persons persons) {
            this.persons = persons;
        }
    }

