import java.util.Arrays;

public class LessonPR {
    public static void main(String[] args) {
        //Определить пропущенные числа в массиве, элементы которого не повторяются
        int [] arrTask10 = {4,1,3,7,6,9};
        // Найти миниммальный и максимальный элемент массива
        int min = arrTask10[0];
        for (int i=1; i<arrTask10.length; i++)
            if (min>arrTask10[i]) min=arrTask10[i];
        System.out.println(min);
        int max = arrTask10[0];
        for (int i=1; i<arrTask10.length; i++)
            if (max<arrTask10[i]) max=arrTask10[i];
        System.out.println(max);
        //Поиск каждого элемента-1путь решения
        for (int i=min; i<=max; i++){
            int index = -1;
            for (int j=0; j<arrTask10.length; j++)
                if (arrTask10[j]==i) index=j;
        if (index==-1) System.out.println(i);
        }
        //Сортировка-2путь решения
        Arrays.sort(arrTask10);
        for (int i = arrTask10[0]; i<=arrTask10[arrTask10.length-1]; i++){
           int index = Arrays.binarySearch(arrTask10,i);
          if (index<0) System.out.println(i);
        }
    }
}
