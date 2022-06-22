import java.util.Random;
import java.util.Scanner;

public class Guessing {
    public static void main(String[] args) {
        // Компьютер загадывает число от 1 до 100, а мы его угадываем
        Random random = new Random();
        int number = random.nextInt (90) + 1;
        Scanner scanner = new Scanner (System.in);
        boolean flag = false;
        int n = 0;
        while ((!flag)) {
            System.out.println("Введите число: ");
            int entered = scanner.nextInt();
            if (number < entered) System.out.println("Меньше");
            else if (number > entered) System.out.println("Больше");
            else {
                System.out.println("Угадано за " +n+ " попыток.");
                flag = true;
            }
            n++;
        }

    }
}
