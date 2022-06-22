package org.itstep;

import java.util.Arrays;

public class Arrays3 {
    public static int a[] = {2,4,1,6,3,8,7,9,5};

    public static void main (String [] args){
        // ТЕМА: Сортировка массивов

        //bubbleSort();
        gnomeSort();
        //insertionSort();
    }

    public static void bubbleSort (){
        // 1) Пузырьковая сортировка
        for (int i=0; i<a.length-1; i++)
            for (int j=0; j<a.length-1; j++)
                if (a[j]>a[j+1])
                    swap (j, j+1);
        System.out.println(Arrays.toString(a));
    }

    public static void gnomeSort (){
        // 2) Гномья сортировка
        for (int i=1; i<a.length-1; i++)
            for (int j=i+1; j>0&&a[j-1]>a[j]; j--)
                swap(j-1,j);
        System.out.println(Arrays.toString(a));
    }

    public static void insertionSort (){
        // 3) Сортировка вставкой
        for (int i=1; i<a.length; i++){
            int spec=a[i];
            int j;
            for (j=i; j>0&&spec<a[j-1]; j--)
                a[j]=a[j-1];
            a[j]=spec;
        }
        System.out.println(Arrays.toString(a));
    }

    public static void swap (int i, int j){
        int temp = a[i];
        a[i]=a[j];
        a[j]=temp;
    }

}
