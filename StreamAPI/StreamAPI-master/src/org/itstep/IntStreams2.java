package org.itstep;

import java.util.Arrays;
import java.util.stream.Stream;

public class IntStreams2 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(numberOfFibonachchi(10)));
        System.out.println(sumEvenNumOfFibonachchi(35));
        System.out.println(Arrays.toString(factorials(10)));
    }

    //Вывести первые n чисел Фибоначчи
    public static int[] numberOfFibonachchi(int count) {

        return Stream.iterate(new int[]{0, 1}, n -> new int[]{n[1], n[0] + n[1]})
                .limit(count)
                .mapToInt(n -> n[0]).toArray();
    }

    //Сумма четных чисел Фибоначчи, не превышающих count
    public static long sumEvenNumOfFibonachchi(int count) {

        return Stream.iterate(new int[]{0, 1}, n -> new int[]{n[1], n[0] + n[1]})
                .filter(n -> n[0] % 2 == 0)
                .takeWhile(n -> n[0] < count)
                .mapToInt(n -> n[0])
                .sum();
    }

    //Вывести первые n факториалов
    public static int[] factorials(int count) {

        return Stream.iterate(new Pair(1,1),n-> new Pair(n.num+1,n.value*(n.num+1)))
                .limit(count)
                .mapToInt(n->n.value)
                .toArray();
    }
}

class Pair {
    final int num;
    final int value;

    Pair(int num, int value) {
        this.num = num;
        this.value = value;
    }
}
