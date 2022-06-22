import java.util.Scanner;
import static java.lang.Character.isLowerCase;

public class UserExceptions {
    public static void main(String[] args) throws NotEvenException, NotNumberException, Person.NotCapitalException {
       /**
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an EVEN number: ");
        int a = scanner.nextInt();
        validateEven(a);
        System.out.println("Enter a number from 1 to 10: ");
        int b = scanner.nextInt();
        validateEvenFromOneToTen(b);
        System.out.println("Enter your name: ");
        String c = scanner.next();
        Person person = new Person(c);
        **/
        Person.getCaller();
    }

    public static void validateEven(int number) throws NotEvenException {
        if (number % 2 != 0)
            throw new NotEvenException("The number is not even!");
    }

    public static void validateEvenFromOneToTen (int number) throws NotNumberException {
        if (number < 1 || number > 10){
            throw new NotNumberException("Введенное число не попадает в заданный диапозон!");
        }
    }
}
class NotEvenException extends Exception{

    public NotEvenException(String message){
        super(message);
        }
}
class NotNumberException extends Exception{

    public NotNumberException(String message) {
        super(message);
    }
}
class Person {
    private String name = "";

    public Person(String name) throws NotCapitalException {
        this.name = name;
        validateName(name);
    }

    private void validateName(String name) throws NotCapitalException {
        if (isLowerCase(name.charAt(0)))
            throw new NotCapitalException("The first letter of name: " + name + " must be capital!");
    }

    class NotCapitalException extends Exception {
        public NotCapitalException(String message) {
            super(message);
        }
    }


    //Вывести в консоль имя вызывающего его класса и метода (раскручивание стека вызовов).
    public static void getCaller() {
        Exception e = new Exception();
        String className = e.getStackTrace()[1].getClassName(); //0
        System.out.println(className);
        String methodName = e.getStackTrace()[1].getMethodName(); //0
        System.out.println(methodName);
        int line = e.getStackTrace()[1].getLineNumber(); //0
        System.out.println(line);
    }
}
