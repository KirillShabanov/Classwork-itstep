public class BinarySearch {
    static int[] arr = {2,5,6,9,11};

    public static void main(String[] args) {

        System.out.println(binarySearch(7));
    }

    public static int binarySearch(int number){
            int a = 0, b = arr.length-1, m = (a + b)/2;
            while (a != b & arr [m] != number) {
                if (number > arr[m]){
                    a = m;
                }
                else {
                    b = m;
                }
                m = (a + b)/2;
            }
            if (arr [m] == number){
                return m;
            }
            else {
                return -1;
            }

    }
}
