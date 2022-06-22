public class Methods3 {
    public static void main(String[] args) {
        //isDisarium(135) ➞= true:  1^1 + 3^2 + 5^3 = 1 + 9 + 125 = 135
        System.out.println(isDisarium(135));
        for (int i=10; i<=10000000; i++)
            if (isDisarium(i)) System.out.println(i);
    }

    public static boolean isDisarium (int number) {
        int count = (int) Math.floor(Math.log10(number) + 1);
        int num = number, sum = 0;
        while (num != 0) {
            int digit = num % 10;
            num /= 10;
            sum += Math.pow(digit, count--);
        }
        return (number==sum ? true:false);
    }
}
