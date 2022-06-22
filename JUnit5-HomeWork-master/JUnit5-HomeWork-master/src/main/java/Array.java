import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        int[] numberArray = {
                1789, 2035, 1899, 1456, 2013,
                1458, 2458, 1254, 1472, 2365,
                1456, 2165, 1457, 2456};

        String[] stringArray = {
                "Java",
                "Python",
                "PHP",
                "C#",
                "C Programming",
                "C++"
        };

        System.out.println("Original numeric array : "+ Arrays.toString(numberArray));
        sortNumberArray(numberArray);
        System.out.println("Sorted numeric array : "+Arrays.toString(numberArray));

        System.out.println("Original string array : "+Arrays.toString(stringArray));
        sortStringArray(stringArray);
        System.out.println("Sorted string array : "+Arrays.toString(stringArray));
    }

    public static int[] sortNumberArray(int[] numberArray) {
        Arrays.sort(numberArray);
        return numberArray;
    }

    public static String[] sortStringArray(String[] stringArray) {
        Arrays.sort(stringArray);
        return stringArray;
    }

}
