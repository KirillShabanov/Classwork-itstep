public class HomeWork2Path1 {

    public static void main (String [] args) {
        /*Задание 1. Обнулить бит в нулевом разряде числа N. Остальные
        биты не должны изменить свое значение. Вывести на консоль в двоичном виде.*/
        System.out.println("Задание 1: ");
        byte b = 0b1111;
        byte resultNumber = (byte) ((b<<1)&b);
        System.out.println(Integer.toBinaryString(+resultNumber));
        System.out.println("_________________________________");

        /*Задание 2. Вывести на консоль 2 в степени n. Для вычисления использовать только побитовые операции. */
        System.out.println("Задание 2: ");
        int n = 5;
        byte resultNumber1 = (byte) (1<<n);
        System.out.println(Integer.toBinaryString(resultNumber1));
        System.out.println("_________________________________");

        /*Задание 3. Установить i-й бит числа N равным 1. Вывести результат на консоль в двоичном виде.*/
        System.out.println("Задание 3: ");
        byte b1 = 0b0000;
        byte resultNumber3_1 = (byte) (b1|1);
        byte resultNumber3_2 = (byte) (b1^2);
        byte resultNumber3_3 = (byte) (1<<2);
        byte resultNumber3_4 = (byte) (~b1&8);
        System.out.println(Integer.toBinaryString(resultNumber3_1));
        System.out.println(Integer.toBinaryString(resultNumber3_2));
        System.out.println(Integer.toBinaryString(resultNumber3_3));
        System.out.println(Integer.toBinaryString(resultNumber3_4));
        System.out.println("_________________________________");

        /*Задание 4. Инвертировать i-й бит числа N. Вывести результат на консоль в двоичном виде.*/
        System.out.println("Задание 4: ");
        byte b4 = 0b1010;
        byte resultNumber4_1 = (byte) (b4&1|13);
        byte resultNumber4_2 = (byte) ((~(b4<<3))&8);
        byte resultNumber4_3 = (byte) ((b4<<1)^24|2);
        byte resultNumber4_4 = (byte) ((~((~(1|b4))^6))^15);
        System.out.println(Integer.toBinaryString(resultNumber4_1));
        System.out.println(Integer.toBinaryString(resultNumber4_2));
        System.out.println(Integer.toBinaryString(resultNumber4_3));
        System.out.println(Integer.toBinaryString(resultNumber4_4));
        System.out.println("_________________________________");

        /*Задание 5. Установить i-й бит числа N равным 0. Вывести результат на консоль в двоичном виде.*/
        System.out.println("Задание 5: ");
        byte b5 = 0b1111;
        byte resultNumber5_1 = (byte) (b5^1);
        byte resultNumber5_2 = (byte) ((~(~b5^13))^b5);
        byte resultNumber5_3 = (byte) (b5&11);
        byte resultNumber5_4 = (byte) (b5&(14>>1));
        System.out.println(Integer.toBinaryString(resultNumber5_1));
        System.out.println(Integer.toBinaryString(resultNumber5_2));
        System.out.println(Integer.toBinaryString(resultNumber5_3));
        System.out.println(Integer.toBinaryString(resultNumber5_4));
        System.out.println("_________________________________");

        /*Задание 6. Обнулить все кроме последних i битов числа N. Вывести результат на консоль в двоичном виде.*/
        System.out.println("Задание 6: ");
        byte b6 = 0b1111;
        byte resultNumber6 = (byte) (b6^3);
        System.out.println(Integer.toBinaryString(resultNumber6));
        System.out.println("_________________________________");

        /*Задание 7. Определить значение i-го бита числа N. Вывести результат на консоль в двоичном виде.*/
        System.out.println("Задание 7: ");
        byte N = 5;
        byte i = 2;
        byte M;
        byte result7;
        M = (byte) (N>>i);
        result7 = (byte) (M & 1);
        System.out.println(Integer.toBinaryString(result7));
        System.out.println("_________________________________");

        /*Задание 8. Обнулить крайний левый (старший разряд) единичный бит числа N.
        Вывести результат на консоль в двоичном виде.*/
        System.out.println("Задание 8: ");
        byte N1 = 0b1011;
        byte i1 = 3;
        byte result8;
        result8 = (byte) ((~(1<<i1))&N1);
        System.out.println(Integer.toBinaryString(result8));
        System.out.println("_________________________________");

        /*Задание 9. Определить, имеют ли числа M и N разные знаки, используя только побитовые
        и условные операторы.*/
        System.out.println("Задание 9: ");
        byte M2 = -126;
        byte N2 = -127;
        byte signBit1 = (byte) ((M2>>31) & 1);
        byte signBit2 = (byte) ((N2>>31) & 1);
        System.out.println(Integer.toBinaryString(signBit1));
        System.out.println(Integer.toBinaryString(signBit2));
        if (signBit1 == signBit2) {
        System.out.println("Число M2 и N2 имеют одинаковые знаки");
        }
        else {
            System.out.println("Число M2 и N2 имеют разные знаки");
        }
        System.out.println("_________________________________");

        /*Задание 10. Найти и вывести на консоль минимальное из двух чисел M и N, используя только
        побитовые и арифметические операции (без использования условного оператора).*/
        System.out.println("Задание 10: ");
        byte M3 = -20;
        byte N3 = 17;
        while (M3 > N3) {
            System.out.println("Число N меньше числа M. Результат: " +N3);
            N3++;
            break;
        }
        while (M3 < N3) {
            System.out.println("Число M меньше числа N. Результат: " + M3);
            break;
        }
        System.out.println("_________________________________");

        /*Задание 11. Посчитать и вывести на консоль количество единичных битов в числе N.
        Вывести на консоль исходное число в двоичном виде и результат.*/
        System.out.println("Задание 11: ");
        byte N11 = 27;
        int N_1 = Integer.bitCount(N11);
        System.out.println("Число в двоичном виде: " +Integer.toBinaryString(N11));
        System.out.println("Количество единиц: " +N_1);
        System.out.println("_________________________________");

        /*Задание 12. Проверить, есть ли в двоичной записи числа n хотя бы один 0.
        Используя только побитовые и условные операторы. Вывести на консоль исходное число
        в двоичном виде и результат.*/
        System.out.println("Задание 11: ");
        byte N12 = 27;
        int N_2 = Integer.bitCount(~N12) - Integer.numberOfLeadingZeros(N12);
        System.out.println("Число в двоичном виде: " +Integer.toBinaryString(N12));
        System.out.println("Количество нулей: " +N_2);
        System.out.println("_________________________________");

    }
}
