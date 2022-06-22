package org.itstep;

import java.util.Random;

public class Arrays1 {

    static int size = 10;                                              // Чтобы сделать статическим методом
    static int[] arr = new int[size];                                // Чтобы сделать статическим методом

    public static void main(String[] args) {
        fillOrder();
        //fillRandom();
        //fillInManually();
        print();
        //revers();
        //print();
        System.out.println(sum());
        System.out.println(max());
        System.out.println(finde(78));

    }

    public static void fillOrder() {
        for (int i = 0; i < size; i++) {                              //Заполняем элементы массива
            arr[i] = i + 1;
        }
    }

    public static void print() {
        for (int element : arr) {                                    //Выводим элементы массива
            System.out.print(element + " ");
        }
        System.out.println();
    }

    public static int sum() {                                        // Сумма элементов массива
        int sum = 0;
        for (int element : arr)
            sum += element;
        return sum;
    }

    public static void fillRandom() {
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            arr[i] = random.nextInt(90) + 10;                    // Заполняем элементы массива рандомно   (цифры указывают, что будут заполненны числа от нуля до 99)
        }
    }

    public static int max() {                                                  // найти максимальное значение
        int max = arr[0];
        for (int i = 1; i < size; i++)
            if (max < arr[i]) {
                max = arr[i];
            }
        return max;
    }

    public static void fillInManually() {
        //arr = new int[] {52, 7, 48, 12, 78, 24, 99, 85, 32, 2};        // Заполнить массив в ручную автоматическим внесением
        arr[0] = 2;                                                     // Заполнить каждую ячеку в ручную
        arr[1] = 32;
        arr[2] = 85;
        arr[3] = 99;
        arr[4] = 24;
        arr[5] = 78;
        arr[6] = 12;
        arr[7] = 48;
        arr[8] = 7;
        arr[9] = 52;
    }

    public static void revers() {                             // реверс массива
        for (int i = 0; i < size/2; i++) {
            swap(i, size -i -1);
        }
    }

    public static void swap(int i, int j) {                  // Временная переменная для реверса массива
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;


    }

    public static int finde(int element) {                   // Найти индекс интересующего числа
        int index = -1;
        for (int i = 0; i < size; i++)
        if (arr[i] == element) {
            index = i;
        }
        return index;

    }
}
