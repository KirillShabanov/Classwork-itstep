import java.util.Arrays;

public class PascalTriangle {
    public static int arr[][];

    public static void main(String[] args) {
        int size = 10;
        int nRows = size, nCols = 2*size-1;
        arr= new int[nRows][nCols];
        for (int i=0; i<nRows; i++)
            for (int j=0; j<nCols; j++)
                arr[i][j]=0;
            //Заполнение
        for (int i=0; i<nRows; i++)
            for (int j=0; j<nCols; j++){
                if (i==0) arr[i][nCols/2] = 1;
                else if (j==0) arr[i][j] = arr[i-1][j+1];
                else if (j==nCols-1) arr[i][j] = arr[i-1][j-1];
                else arr[i][j]=arr[i-1][j-1]+arr[i-1][j+1];
            }
        System.out.println(arrToString());
    }
    //Преобразовать в строку
    public static String arrToString() {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++)
                if (arr[i][j]!=0) {
                    String s = Integer.toString(arr[i][j]);
                    String padded = String.format("%2s", s);
                    result.append(padded);
                }
                else result.append("  ");
            result.append("\n");
        }
        return result.toString();
    }
}
