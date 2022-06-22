package org.itstep;

import java.util.*;


public class Main {

        static int size = 20;
        static int [] arr = new int [size];

        static int nCols = 3;
        static int nRows = 4;
        static int [][] arr2 = new int[nRows][nCols];

    public static void main(String[] args) {
        /**
         Задача 1.
         Вариант 3. Дан массив n целых чисел. Найти элемент, который встречается в массиве чаще всего.
         **/
        System.out.println("Задание 1: ");
        fillRandom();
        bubbleSort();
        print();

        HashMap<Integer, Integer> map = new HashMap<>();
        for (Integer i : arr) {
            Integer value = map.get(i);
            if (value == null) {
                map.put(i, 1);
            } else {
                map.put(i, ++value);
                System.out.println("Повторяющийся элемент: " + i + ", кол-во раз: " + value);
            }
        }

        /**
        Задача 2.
         Вариант 3. Дана строка, состоящая из произвольных символов. Найти символ, который встречается в ней чаще всего.
        **/
        System.out.println("Задание 2: ");
        String s = "Потрясающая погода для этого времени года!";
        StringBuilder sb = new StringBuilder("");
        for (int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            if (sb.indexOf(Character.toString(c))==-1)
                sb.append(c);
        }
        int [] count = new int[sb.length()];

        for (int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            int index = sb.indexOf(Character.toString(c));
            if (index != -1) {
                count [index]++;
            }
        }
        for (int i=0; i<sb.length(); i++)
            System.out.println("Символ: " + sb.charAt(i) + ", Кол-во повторений: " + count[i]);

        /**
         Задача 3.
         Вариант 3. Дан двумерный массив nxn целых чисел. Вывести строку, сумма элементов которой минимальна.
         **/
        System.out.println("Задание 3: ");

        Random random = new Random();
        for (int i = 0; i < nRows; i++)
        for (int j = 0; j < nCols; j++){
            arr2[i][j] = random.nextInt(10);
        }

        stringBuilder();

        int [] arr3 =  new int[arr2.length];
        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr2[i].length; j++) {
                arr3[i] += arr2[i][j];
                
            }

        }

        System.out.println(Arrays.toString(arr3));
    }



    public static void fillRandom() {
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            arr[i] = random.nextInt(25) + 1;
        }
    }
    public static void print() {
        for (int element : arr) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
    public static void bubbleSort() {
        for (int i = 0; i < size - 1; i++)
            for (int j = 0; j < size - i - 1; j++)
                if (arr[j] > arr[j + 1]) {
                    //printColor(j, j + 1);
                    swap(j, j + 1);
                }
    }
    public static void swap(int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;

    }
    public static void stringBuilder (){
        StringBuilder result = new StringBuilder();
        String separator = " ";
        for (int i=0; i<arr2.length; i++) {
            for (int j = 0; j < arr2[i].length; j++) {
                result.append(arr2[i][j]);
                if (j != arr2[i].length - 1)
                    result.append(separator);
            }
            result.append("\n");
        }
        System.out.println(result);
    }
}
