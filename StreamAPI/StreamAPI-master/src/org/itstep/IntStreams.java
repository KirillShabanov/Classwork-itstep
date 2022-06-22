package org.itstep;

import java.util.Arrays;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class IntStreams {
    public static void main(String[] args) {

        System.out.println(Arrays.toString(fillOrder(1, 10)));
        System.out.println(calcSum(10));
        System.out.println(Arrays.toString(fillRandom(7, 8)));
        printEven(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10});
        printEven(fillRandom(10, 30));
        System.out.println(Arrays.toString(squares(10)));
        System.out.println(Arrays.toString(powers2(10)));
        System.out.println(Arrays.toString(getDivisible()));
        System.out.println(getDivisibleCount());
        printFirst20();
        printFirst20DropWhile();
        System.out.println(isPrime(11));
        System.out.println(Arrays.toString(calcPrimes(100)));
        System.out.println(maxPrimeFactor(20));
    }

    public static int[] fillOrder(int begin, int end) {
        //Сгенерироваь массив последовательных натуральных чисел в заданном диапазоне
        int[] arr = IntStream.rangeClosed(begin, end)
                .toArray();
        return arr;
    }

    public static int calcSum(int count) {
        //Получить сумму первых n чисел
        int sum = IntStream.rangeClosed(1, count).sum();
        return sum;
    }

    public static int[] fillRandom(int count, int bound) {
        //Сгенерироваь массив случайных натуральных чисел чисел в заданном диапазоне
        Random random = new Random();
        return IntStream.generate(() -> random.nextInt(bound) + 1)
                .distinct().limit(count).toArray();
    }

    public static void printEven(int[] arr) {
        //Вывести только четные числа
        String s = Arrays.stream(arr).filter(n -> n % 2 == 0)
                .mapToObj(Integer::toString)
                .collect(Collectors.joining(", "));
        System.out.println(s);
    }

    public static int[] squares(int count) {
        //Вывести квадраты первых n натуральных чисел
        return IntStream.rangeClosed(1, count).map(n -> n * n).toArray();
    }

    public static int[] powers2(int count) {
        //Степени числа 2
        return IntStream.iterate(1, n -> n * 2)
                .limit(count).toArray();
    }

    public static int[] getDivisible() {
        //Вывести все числа от 1 до 1000, которые делятся на 3, или 5, или 11
        return IntStream.rangeClosed(1, 1000)
                .filter(n -> n % 3 == 0 || n % 5 == 0 || n % 11 == 0)
                .toArray();
    }

    public static long getDivisibleCount() {
        //Вывести все числа от 1 до 1000, которые делятся на 3, или 5, или 11
        return IntStream.rangeClosed(1, 1000)
                .filter(n -> n % 3 == 0 || n % 5 == 0 || n % 11 == 0)
                .count();
    }


    public static void printFirst20() {
        Stream.iterate(new int[]{1, 1}, x -> new int[]{++x[0], x[1] = sum(Integer.toString(x[0])
                .chars().toArray())})
                .filter(x -> x[1] == 20)
                .limit(3).forEach(x -> System.out.println(x[0]));
    }

    public static void printFirst20DropWhile() {
        Stream.iterate(new int[]{1, 1}, x -> new int[]{++x[0], x[1] = sum(Integer.toString(x[0])
                .chars().toArray())})
                .dropWhile(x -> x[1] != 20)
                .limit(1).forEach(x -> System.out.println(x[0]));
    }

    public static int sum(int[] arr) {
        int result = 0;
        for (int a : arr) result += a - '0';
        return result;
    }


    public static boolean isPrime(int number) {
        //Вывести n первых простых чисел
        return IntStream.rangeClosed(2, (int) (Math.sqrt(number)))
                .allMatch(n -> number % n != 0);
    }

    public static int[] calcPrimes(int count) {
        //Вывести n первых простых чисел
        return IntStream.iterate(1, x -> x + 1)
                .filter(n -> isPrime(n)).limit(count).toArray();
    }
    public static int maxPrimeFactor(int number){
        return IntStream.rangeClosed(2, number/2)
                .filter(x->number%x==0)
                .filter(x->isPrime(x))
                .max().getAsInt();
    }

}
