import java.util.Scanner;

public class ScannerS {
    public static void main(String[] args) {
        /*
      What is your name? - Hello, name!
      How old are you? - You are 30 years old.
      What is your favorite food? - Your favorite food is food.
      Enter your height. - You are 170 cm tall.
       */

        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your name?: ");
        String name = scanner.nextLine();
        System.out.println("Hello, " + name + "!");
        System.out.println("How old are you?");
        int old = scanner.nextInt();
        scanner.nextLine();
        System.out.println("You are "+old+" years old.");
        System.out.println("What is your favorite food?");
        String food = scanner.nextLine();
        System.out.println("Your favorite food is "+ food);
        System.out.println("Enter your height.");
        double height = scanner.nextDouble();
        System.out.println("You are "+ height+" cm tall.");

    }
}
