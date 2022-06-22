package org.itstep;

import org.itstep.model.User;

public class Main {

    public static void main(String[] args) {

        User user = new User ("Shabanov", "Kirill", "Vladimirovich");
        System.out.println(user.getLogin());
        System.out.println(user.getPassword());
        System.out.println(user.isEquals("user"));
    }
}
