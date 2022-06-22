package org.itstep;

import java.util.Arrays;

public class Serie {
    // Дан массив. Вычислить среднее арифметическое для его неповторяющегося подмножества.
    public static void main (String [] args) {
        int [] a = {1,1,2,2,2,3,5,7};
        int [] b = new int[a.length];
        b[0] = a[0];
        int count = 1;
        for (int i=0; i < a.length; i++){
            //Присутствует ли данный элемент a[1] в массиве b
            boolean flag = false;
            for (int j=0; j < count; j++)
              if (a[i]==b[j]) flag=true;
              if (!flag) {
                  b[count] = a[i];
                  count++;
              }
        }
        //System.out.println(Arrays.toString(b));
        for (int i=0; i<count; i++)
        System.out.println(b[i] + "");
    }
}
