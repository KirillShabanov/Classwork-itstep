import java.util.Scanner;
public class homeWork1Path3 {
    public static void main (String [] args){

          /*
        1. Дано трехзначное число. Вывести число, полученное при прочтении исходного числа справа налево.
        Пусть заданное число равняется 1243.
          */

        String specifiedNumber = "1243";
        String theResultingNumber = new StringBuffer(specifiedNumber).reverse().toString();
        System.out.println("Задание 1");
        System.out.println("Заданное число: " + specifiedNumber);
        System.out.println("Заданное число в обратном порядке: " +theResultingNumber);
        System.out.println("_________________________________");


           /*
        2. Дано трехзначное число. В нем зачеркнули первую слева цифру и приписали ее справа. Вывести полученное число.
        Пусть число равняется 512.
           */


        int givenNumber = 512;
        int theResultingNumber1;
        theResultingNumber1 = (givenNumber % 100) * 10 + (givenNumber % 1000 / 100);
        System.out.println("Задание 2");
        System.out.println("Данное число: " +givenNumber);
        System.out.println("Искомое число: " +theResultingNumber1);
        System.out.println("_________________________________");


         /*
        3. Дано трехзначное число. Вывести число, полученное при перестановке цифр сотен и десятков исходного числа (например,
                123 перейдет в 213).
         Пусть данное число равно 149.
         */

        int arbitraryNumber3 = 149 ;
        int theResultingNumber3 ;
        theResultingNumber3 = arbitraryNumber3 % 10 + ((arbitraryNumber3 % 100 - arbitraryNumber3 % 10) * 10) + ((arbitraryNumber3 % 1000 - arbitraryNumber3 % 100) / 10) ;
        System.out.println("Задание 3");
        System.out.println("Произвольное число: " + arbitraryNumber3);
        System.out.println("Искомое число: " + theResultingNumber3);
        System.out.println("_________________________________");

        /*
        4. Дано трехзначное число. Заменить в нем вторую цифру, если она является четной, на ближайшую большую нечетную цифру.
        Пусть данное число равно 725
         */
        int arbitraryNumber4 = 725 ;
        int n ;
        n = (arbitraryNumber4 % 100 - arbitraryNumber4 % 10) / 10;
        System.out.println("Задание 4");
        System.out.println("Произвольное число: " + arbitraryNumber4);
        System.out.println("Проверка: " + n);
        if (n % 2 == 0) {
            arbitraryNumber4 = ((arbitraryNumber4 % 1000 - arbitraryNumber4 % 100) + ((arbitraryNumber4 % 100 - arbitraryNumber4 % 10) + 10)  + arbitraryNumber4 % 10);
            System.out.println("Исправленное число: " + arbitraryNumber4);}
        else {
            System.out.println("Изменений не требуется: " + arbitraryNumber4); }
        System.out.println("_________________________________");


        /*
        5. Дано трехзначное число. Изменить одну его цифру так, чтобы оно стало палиндромом (одинаково читается справа налево и слева направо).
        Пусть дано число 699
        */
        System.out.println("Задание 5");
        int arbitraryNumber5 = 699;
        int palindrome1;
        int palindrome2;
        System.out.println("Произвольное число: " + arbitraryNumber5);
        if ((arbitraryNumber5 % 1000 / 100) != (arbitraryNumber5 % 10)) {
          palindrome1 = (arbitraryNumber5 % 1000 - arbitraryNumber5 % 100) + (arbitraryNumber5 % 100 - arbitraryNumber5 % 10) + ((arbitraryNumber5 % 1000 - arbitraryNumber5 % 100) / 100);
          palindrome2 = (arbitraryNumber5 % 10 * 100) + (arbitraryNumber5 % 100 - arbitraryNumber5 % 10) + arbitraryNumber5 % 10;
            System.out.println("Получены два возможных палиндрома: " + palindrome1 + ", " + palindrome2);
        }
        else {
            System.out.println("Данное число является палиндромом: " + arbitraryNumber5);
        }
        System.out.println("_________________________________");

        /*
        6. Дано трехзначное число. Определить, является ли его число десятков четным числом.
        Пусть дано число 375.
        */
        System.out.println("Задание 6: ");
        int arbitraryNumber6 = 375;
        int n6;
        n6 = (arbitraryNumber6 % 100 - arbitraryNumber6 % 10) / 10;
        System.out.println("Произвольное чиcло: " +arbitraryNumber6);
        System.out.println("Проверка: " + n6);
        if ( n6 % 2 == 0 ) {
            System.out.println("Число десятков данного числа является четным числом!");
        }
        else {
            System.out.println("Число десятков данного числа не является четным числом!");
        }
        System.out.println("_________________________________");

        /*
        7. Дано трехзначное число. Определить, является ли его число сотен нечетным числом.
        Пусть дано число 385
         */
        System.out.println("Задание 7: ");
        int arbitraryNumber7 = 385;
        int n7;
        n7= arbitraryNumber7 % 1000 / 100;
        System.out.println("Проверка: " +n7);
        if (n7 % 2 == 0) {
            System.out.println("Число сотен данного числа является четным числом!");
        }
        else {
            System.out.println("Число сотен данного числа не является четным числом!");
        }
        System.out.println("_________________________________");

        /*
        8. Определить, является ли введенное трехзначное число палиндромом (одинаково читается справа налево и слева направо).
        */
        System.out.println("Задание 8:");
        Scanner in = new Scanner (System.in);
        System.out.print("Введите Ваше трёхзначное число: ");
        int arbitraryNumber8 = in.nextInt();
        if ((arbitraryNumber8 % 1000 / 100) == arbitraryNumber8 % 10 ) {
            System.out.println("Введённое Вами число является палиндромом!");
        }
        else {
            System.out.println("Введённое Вами число не является палиндромом :(");
        }
        in.close();
        System.out.println("_________________________________");

        /*
        9. Дано целое число, большее 999. Найти цифру, соответствующую разряду сотен в записи этого числа.
        Пусть дано число 8654.
        */
        System.out.println("Задание 9: ");
        int arbitraryNumber9 = 8654;
        int n9;
        n9= (arbitraryNumber9 % 1000 - arbitraryNumber9 % 100) / 100;
        System.out.println("Искомая цифра: " + n9);
        System.out.println("_________________________________");
        /*
        10. Дано трехзначное число. Определить разность между этим числом и числом, записанным из тех же цифр, но в обратном порядке.
        Пусть дано число 587.
        */
        System.out.println("Задание 10: ");
        int arbitraryNumber10 = 587;
        int reverseNumber;
        int theResultingNumber10;
        reverseNumber = (arbitraryNumber10 % 1000 / 100) + (arbitraryNumber10 % 100 - arbitraryNumber10 % 10) + (arbitraryNumber10 % 10 *100) ;
        System.out.println(reverseNumber);
        theResultingNumber10 = arbitraryNumber10 - reverseNumber;
        System.out.println(theResultingNumber10);
        System.out.println("_________________________________");

        /*
        11. Дано трехзначное число. Округлить его до десятков.
        Пусть дано число 294.
        */
        System.out.println("Задание 11: ");
        int arbitraryNumber11 = 294;
        int roundedNumber;
        if ((arbitraryNumber11 % 10) >= 5) {
            roundedNumber =  (arbitraryNumber11 % 1000 - arbitraryNumber11 % 100) + ((arbitraryNumber11 % 100) + 10) - arbitraryNumber11 % 10;
            System.out.println("Округление до десятых в большую сторону: " + roundedNumber);
        }
        else  {
            roundedNumber = arbitraryNumber11 - (arbitraryNumber11 % 10);
            System.out.println("Округление до десятых в меньшую сторону: " + roundedNumber);
        }
        System.out.println("_________________________________");

        /*
        12. Дано трехзначное число. Округлить его до сотен.
        Пусть дано число 856
      */
        System.out.println("Задание 12: ");
        int arbitraryNumber12 = 856;
        int roundedNumber2;
        if ((arbitraryNumber12 % 100) >= 55) {
            roundedNumber2 =  (arbitraryNumber12 % 1000 + 100) - (arbitraryNumber12 % 100);
            System.out.println("Округление до сотых в большую сторону: " + roundedNumber2);
        }
        else  {
            roundedNumber2 = arbitraryNumber12 - (arbitraryNumber12 % 100);
            System.out.println("Округление до сотых в меньшую сторону: " + roundedNumber2);
        }
        System.out.println("_________________________________");
    }
}
