package org.itstep.reflection;

public class MyClass {

    private int number;
    private String name = "default";
    private int value;

    public MyClass(int number, String name, int value) {
        this.number = number;
        this.name = name;
        this.value = value;
    }

    public MyClass(){}

    public void setNumber(int number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private void print() {
        System.out.println(
                "number=" + number +
                ", name=" + name +
                ", value=" + value);
    }
}
