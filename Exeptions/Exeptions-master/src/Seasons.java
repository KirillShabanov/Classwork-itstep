import java.util.Scanner;

/*
       Реализовать метод возвращающий время года (зима|весна|лето|осень) по номеру месяца.
       Месяца номеруются с 1 до 12. Январь - 1, Декабрь - 12.
       В случае если в аргументе monthNumber будет недопустимое число,
       метод должен кидать исключение IllegalArgumentException с сообщение вида
       "monthNumber=-5 is invalid, the number of a month should be in a range of 1..12"
         */
public class Seasons {
            public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);
                System.out.println("Enter a number from 1 to 12:");
                int a = scanner.nextInt();
                validateSeason(a);
            }
            public static void validateSeason(int number){
                if (number < 1 || number > 12)
                    throw new IllegalArgumentException (number + " is invalid, the number of a month should be in a range of 1..12");
                 if (number == 12 || number <= 2)
                    System.out.println("Winter");
                else if (number >= 3 && number <= 5)
                    System.out.println("Spring");
                else if (number >= 6 && number <= 8)
                    System.out.println("Summer");
                else if (number >= 9 && number <= 11)
                    System.out.println("Autumn");

            }
}
