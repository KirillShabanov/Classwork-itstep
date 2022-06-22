package org.itstep;

import javax.swing.*;

public class JOptionPaneSample {
    public static void main(String[] args) {
        /*
      What is your name? - Hello, name!
      How old are you? - You are 30 years old.
      Enter your height. - You are 170 cm tall.
       */
        String name = JOptionPane.showInputDialog("What is your name?");
        int age = Integer.parseInt(JOptionPane.showInputDialog("How old are you?"));
        double height = Double.parseDouble(JOptionPane.showInputDialog("Enter your height"));
        // Способ 1
        JOptionPane.showMessageDialog(null, "Hello, "+ name +"!");
        // Способ 2
        JOptionPane.showMessageDialog(null, String.format("Hello, %s!%n", name));
        // Изменения
        JOptionPane.showMessageDialog(null, String.format("Hello, %s!%nYou are %d years old%n%nYou are %d cm tall%n", name, age, height));
    }
}
