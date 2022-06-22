package home.org;

import java.util.LinkedHashSet;
import java.util.Random;
import java.util.Set;

public class Main {
    // 1. Вывести все неповторяющиеся элементы массива
    public static int size = 20;
    public static int [] arr = new int[size];

    // 2. Вывести в консоль фигуру, образованную числами (Pattern 20)
    public static int [][] arr2;

    public static void main(String[] args) {
        System.out.println("Задание №1: ");
	fillRandom();
    print();
    printUniqueNumber();
        System.out.println();
        System.out.println();


        System.out.println("Задание №2: ");
    triangleOfNumber();
        System.out.println(arrToString());
    }
    public static void fillRandom() {
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            arr[i] = random.nextInt(90) + 10;
        }
    }
    public static void print() {
        for (int element : arr) {
            System.out.print(element + " ");
        }
        System.out.print("- заполненный массив в исходном виде.");
        System.out.println();
    }
    public static void printUniqueNumber() {
        Set<Integer> setUniqueNumber = new LinkedHashSet<>();
        for (int i : arr) {
            setUniqueNumber.add (i);
        }
        for (Integer i : setUniqueNumber) {
        System.out.print(i + " ");
        }
        System.out.print("- все уникальные значения.");
    }

    public static void triangleOfNumber () {
        int size = 5;
        int nRows = size, nCols = 2 * size - 1;
        arr2 = new int[nRows][nCols];
        for (int i = 0; i < nRows; i++)
            for (int j = 0; j < nCols; j++)
                arr2[i][j] = 0;
        for (int i = 0; i < nRows; i++)
            for (int j = 0; j < nCols; j++) {
                if (i == 0) {
                    arr2[i][nCols / 2] = 1;
                } else if (j == 0) {
                    arr2[i][nCols / 2] = i + 1;
                    arr2[i][nCols/2-1]=arr2[i][nCols/2+1]= i;
                    arr2[i][nCols/2-2]=arr2[i][nCols/2+2]=-1+i;
                    arr2[i][nCols/2-3]=arr2[i][nCols/2+3]=-2+i;
                    arr2[i][nCols/2-4]=arr2[i][nCols/2+4]=-3+i;
                }
            }
    }
    public static String arrToString() {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr2[i].length; j++)
                if (arr2[i][j]>0) {
                    String s = Integer.toString(arr2[i][j]);
                    String padded = String.format("%2s", s);
                    result.append(padded);
                }
                else result.append("  ");
            result.append("\n");
        }
        return result.toString();
    }
}
