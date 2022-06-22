import java.util.Random;
    // Задание 1.
    // x*(2+x)/2! - x^3*(4+x)/4! + x^5(6+x)/6! - ... +- x^(2i-1)*(2i+x)/(2i)! -+ ... - Задание
    // sin x - cos x + 1 - Контрольная формула

    // Задание 2.
    // Данны действительные числа С1, С2, .... Сn. Найти произведение среднего арифметического положительных чисел
    // и среднего арифметического отрицательных чисел.
public class HomeWork3 {
        static int size = 20;
        static int[] arr = new int [size];
        public static final String ANSI_YELLOW = "\u001B[33m";
        public static final String ANSI_PURPLE = "\u001B[35m";
        public static final String ANSI_CYAN= "\u001B[36m";
        public static final String ANSI_WHITE = "\u001B[38m";

        public static void main (String [] args) {
        System.out.println("Задание №1: ");
        exercise();
        System.out.println();


        System.out.println("Задание №2: ");
        fillRandom();
        printColor();
       // arithmeticMeanOfNegative();
       // arithmeticMeanOfPositive();
        productOfNumbers();
    }
        public static void exercise (){
            double sum = 0, x = 0.3, eps = 1e-10, a = x;
            int i = 1;
            boolean sign = true;
            while (Math.abs(a) > eps) {
                a = (numerator(x, 2 * i - 1) * (2 * i + x)) / denominator(2 * i);
                if (!sign) {
                    sum -= a;
                    sign = true;
                }
                else {
                    sum += a;
                    sign = false;
                }
                i++;
            }
            double res = Math.sin(x) - Math.cos(x) + 1;
            System.out.printf("Задание:             %f%nКонтрольная формула: %f%n", sum,res);
        }
        public static double numerator(double a, double n) {
            double result = 1;
            for (int i = 1; i <= n; i++) {
                result *= a;
            }
            return result;
        }
        public static double denominator(double n) {
            double result = 1;
            for (int i = 1; i <= n; i++) {
                result *= i;
            }
            return result;
        }

        public static void fillRandom(){
            Random random = new Random();
            for (int i = 0; i<size; i++){
                arr[i] = random.nextInt(90)-45;
            }
            System.out.println("Массив, заполненный случайными действительными отрицательными и положительными числами:");
        }
        public static void printColor() {
            for (int i = 0; i < size; i++) {
                if (arr[i] < 0) {
                    System.out.print(ANSI_PURPLE);
                    System.out.print(arr[i] + " ");
                }
                else if (arr[i] >= 0 ){
                    System.out.print(ANSI_YELLOW);
                    System.out.print(arr[i] + " ");
                } else
                    System.out.print(arr[i] + " ");
            }
        }
        public static double arithmeticMeanOfNegative () {
            double sumNegative = 0;
            double element = 0;
            double meanOfNegative;
            for (int i = 0; i < size; i++)
                if (arr[i] < 0) {
                    sumNegative += arr[i];
                }
            for (int j = 0; j < size; j++) {
                if (arr[j] < 0) element++;
            }
            meanOfNegative = sumNegative / element;
            System.out.println();
            System.out.print(ANSI_WHITE);
            System.out.print("Среднее арифметическое всех отрицательных чисел массива: ");
            System.out.print(ANSI_PURPLE);
            System.out.print(meanOfNegative);
            return meanOfNegative;
        }
        public static double arithmeticMeanOfPositive () {
                double sumPositive = 0;
                double element = 0;
                double meanOfPositive;
                for (int i = 0; i < size; i++)
                    if (arr[i] > 0) {
                        sumPositive += arr[i];
                    }
                for (int j = 0; j < size; j++) {
                    if (arr[j] > 0) element++;
                }
                meanOfPositive = sumPositive/element;
            System.out.println();
            System.out.print(ANSI_WHITE);
            System.out.print("Среднее арифметическое всех положительных чисел массива: ");
            System.out.print(ANSI_YELLOW);
            System.out.print(meanOfPositive);
            return meanOfPositive;
        }
        public static void productOfNumbers () {
            double sumNegative = 0;
            double elementNegative = 0;
            double meanOfNegative;
            for (int i = 0; i < size; i++)
                if (arr[i] < 0) {
                    sumNegative += arr[i];
                }
            for (int j = 0; j < size; j++) {
                if (arr[j] < 0) elementNegative++;
            }
            meanOfNegative = sumNegative / elementNegative;
            System.out.println();
            System.out.print(ANSI_WHITE);
            System.out.print("Среднее арифметическое всех отрицательных чисел массива: ");
            System.out.print(ANSI_PURPLE);
            System.out.print(meanOfNegative);

            double sumPositive = 0;
            double elementPositive = 0;
            double meanOfPositive;
            for (int i = 0; i < size; i++)
                if (arr[i] > 0) {
                    sumPositive += arr[i];
                }
            for (int j = 0; j < size; j++) {
                if (arr[j] > 0) elementPositive++;
            }
            meanOfPositive = sumPositive/elementPositive;
            System.out.println();
            System.out.print(ANSI_WHITE);
            System.out.print("Среднее арифметическое всех положительных чисел массива: ");
            System.out.print(ANSI_YELLOW);
            System.out.print(meanOfPositive);
            System.out.println();

            double prodOfNumber = meanOfNegative * meanOfPositive;
            System.out.print(ANSI_WHITE);
            System.out.print("Искомое число: ");
            System.out.print(ANSI_CYAN);
            System.out.println(prodOfNumber);
            }
        }

