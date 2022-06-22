package org.itstep;

import java.util.Arrays;
import java.util.Random;

public class Methods2 {
    public static void main(String[] args) {
        //Проверить, является ли число простым
        System.out.println(isPrime(7));
        //Определить все множители числа
        System.out.println(Arrays.toString(calcFactors(12)));
        //Обратить число, записанное в десятичной системе счисления
        System.out.println(reverseNumber(123456));
        //В массиве содержатся строки и целые числа. Вернуть массив, из которого удалены все строки
        Object[] a = genArray(10);
        System.out.println(Arrays.toString(a));
        removeStrings(a);
        System.out.println(Arrays.toString(a));

        System.out.println(Arrays.toString(genArray(10)));



    }
    static boolean isPrime (int number){
        //Проверить, является ли число простым
        boolean flag = true;
        for (int i=2; i<number/2; i++)
            if (number%i==0) flag = false;
            return flag;
    }
    static int[] calcFactors (int number){
        int [] result;
        int count = 0;
        for (int i=2; i<=number; i++)
            if (number%i==0) count++;
            result = new int [count];
            count = 0;
        for (int i=2; i<=number; i++)
            if (number%i==0) result[count++]=i;
            return result;
    }
    static int reverseNumber (int number){
        String s = Integer.toString(number);
        StringBuilder sb = new StringBuilder(s);
        String s2 = sb.reverse().toString();
        int number2 = Integer.parseInt(s2);
        return number2;
    }
    static Object[] genArray (int count){
        Object [] a = new Object[count];
        for (int i=0; i<count; i++){
            Random random = new Random();
            boolean choice = random.nextBoolean();
            if (choice)
                a[i]=random.nextInt(101);
            else{
                StringBuilder sb = new StringBuilder();
                int countL = random.nextInt(5)+1;
                for (int j=0; j<countL; j++){
                    char c = (char)(random.nextInt(26) + 97);
                    sb.append(c);
                }
                a[i] = sb.toString();
            }

        }
        return a;
    }
    static void removeStrings (Object[] a){
        for(int i=0; i<a.length; i++){
        if (a[i].getClass().equals(String.class))
            a[i] = 0;
    }
    }
}
