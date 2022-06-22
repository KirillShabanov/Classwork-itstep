package org.itstep;

import java.io.IOException;
import java.lang.reflect.Array;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Employers {
    public static void main(String[] args) {
        List<Employer> employers = read();
        printAll((ArrayList<Employer>) employers);
        printPosition((ArrayList<Employer>) employers);
        maxSalary((ArrayList<Employer>) employers);
    }

    public static List<Employer> read() {
        String fileName = "src/org/itstep/date/Person.txt";
        ArrayList<Employer> employers = null;
        try (Stream<String> stream = Files.lines(Paths.get(fileName))) {
            employers = (ArrayList<Employer>) stream.map(s -> s.replaceAll("[\"]+|[\\s]+", ""))
                    .map(s -> s.split(","))
                    .map(s -> new Employer(s[0], s[1], Double.parseDouble(s[2]), Integer.parseInt(s[3]), s[4]))
                    //.forEach(System.out::println);
                    .collect(Collectors.toList());
        } catch (IOException e) {
            e.printStackTrace();
        }
        return employers;
    }

    public static void printAll(ArrayList<Employer> employers) {
        employers.stream().forEach(System.out::println);
    }

    public static void printPosition(ArrayList<Employer> employers) {
        employers.stream()
                .map(o -> o.getPosition())
                .distinct()
                .forEach(System.out::println);
    }

    public static void maxSalary(ArrayList<Employer> employers) {
        Comparator<Double> comparator = (a, b) ->
                Double.compare
                        (a, b);
        Double max =
                employers.stream
                        ().map(o -> (double) (o.getSalary()))
                        .max(comparator).orElse((double) 0);
        System.out.println(max);
    }
}

class Employer {
    String name;
    String surName;
    double salary;
    int age;
    String position;

    public Employer(String name, String surName, double salary, int age, String position) {
        this.name = name;
        this.surName = surName;
        this.salary = salary;
        this.age = age;
        this.position = position;
    }

    public String getName() {
        return name;
    }

    public String getSurName() {
        return surName;
    }

    public double getSalary() {
        return salary;
    }

    public int getAge() {
        return age;
    }

    public String getPosition() {
        return position;
    }

    public String toString() {
        return String.format(
                "[name: %s, surname: %s, salary: %.0f age: %d, position: %s]", name, surName, salary, age, position
        );
    }
}
