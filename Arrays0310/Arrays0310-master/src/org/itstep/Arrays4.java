package org.itstep;

public class Arrays4 {
    public static int numRows=5;
    public static int numCols=6;
    private static int [][] arr=new int[numRows][numCols];

    public static void main(String[] args) {
      //fillOrder();
        fillSnake();
        stringBuilder();
      //arrToStringALined();


        //System.out.println(Arrays.toString(arr));
    }

    public static void fillOrder (){
        for (int i=0; i<numRows; i++)
            for (int j=0; j<numCols; j++)
                arr[i][j]=i*numCols+j+1;
    }

    public static void stringBuilder (){
        StringBuilder result = new StringBuilder();
        String separator = ",";
        for (int i=0; i<arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                result.append(arr[i][j]);
                if (j != arr[i].length - 1)
                    result.append(separator);
            }
            result.append("\n");
        }
        System.out.println(result);
    }

    public static String arrToStringALined () {
        StringBuilder result = new StringBuilder();
        String pad = "     ";
        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < numCols; j++) {
                String sNumber = Integer.toString(arr[i][j]);
                String sPadded = pad.substring(sNumber.length()) + sNumber;
                if (j == 0) result.append(sNumber);
                else
                    result.append(sPadded);
            }
            result.append("\n");
        }
        return result.toString();
    }

    public static void fillSnake(){
        for (int i = 0; i < numRows; i++) {
            if (i % 2 == 0)
                for (int j = 0; j < numCols; j++)
                    arr[i][j] = i * numCols + j + 1;
            else
                for (int j = numCols - 1; j >= 0; j--)
                    arr[i][j] = i * numCols + (numCols - j);
        }
    }
}
