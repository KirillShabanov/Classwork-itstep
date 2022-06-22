package org.itstep;

public class Arrays2 {
    public static void main (String [] args) {
        //Дан массив. Вычислить среднее арифметическое для его неповторяющегося подмножества.
        Arrays1.fillOrder();                                          // Вот так вызываем метод из другого класса!!!!!
        Arrays1.print();                                              // Вот так печатаем
        Arrays1.arr[1] = 1;                                           // Вот так переписали аргумент в индексе предудыщего массива
        Arrays1.print();                                              // Вот так печатаем
        int [] b = new int [Arrays1.size];                            // Создали новый массив равный старому
        b[0] = Arrays1.arr[0];
        int count = 1;
        for (int i = 1; i < Arrays1.size; i++) {
            boolean flag = false;
            for ( int j = 0; j < count; j++)
            if ( Arrays1.arr[i] == b [j]) {
                flag = true;
            }
            if (!flag) {
                b [count++] = Arrays1.arr[i];
            }
            System.out.println(flag);
        }

    }
}
