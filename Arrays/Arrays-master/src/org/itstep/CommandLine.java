package org.itstep;

public class CommandLine {
    // В параметрах командной строки задаются два числа
    // Программа выводит их сумму
    public static void main (String [] args) {
       int a = Integer.parseInt(args [0]);
       int b = Integer.parseInt(args [1]);
       int c = Integer.parseInt(args [2]);
       int d = Integer.parseInt(args [3]);
       int e = Integer.parseInt(args [4]);
       int f = Integer.parseInt(args [5]);
       int g = a + b + c + d + e + f;
        System.out.println(g);

        // Сделал тоже самое, что и вверху, только более круче!!!
        int sum = 0;
        for (int i = 0; i < args.length; i++) sum += Integer.parseInt(args [i]);
            System.out.println(sum);
        // Элементы командной строки тоже являются массивом!!!!!
    }

}
