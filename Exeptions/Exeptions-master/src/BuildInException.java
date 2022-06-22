import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.InputMismatchException;
import java.util.Scanner;

public class BuildInException {
    public static void main(String[] args) {
        //processInputException();
        //processIoException();
        //processDivideByZero();
        //indexOutOfBounds();
        //processClassNotFound();
        //processNoSuchMethod();
        //processNullPointer();
    }

    public static void processInputException(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите целое число: ");
        int a = 0;
        try {
            a = scanner.nextInt();
            System.out.println("a = " + a);
        }
        catch (InputMismatchException e){
          //  e.printStackTrace();
            System.err.println("Вы ввели не верный формат данных! Повторите попытку");
        }
    }
    
    public static void processIoException(){
        try{
            InputStream input = new FileInputStream("src/org/itstep/date/message");
            System.out.println("File opened!");
        }
        catch (FileNotFoundException e) {
            System.err.println("File not found");
            //e.printStackTrace();
        }
    }
    
    public static void processDivideByZero(){
        int a = 1 , b;
        try {
            b = a / 0;
        }
        catch (RuntimeException e){
            System.err.println("Divide by zero");
        }
    }
    
    public static void indexOutOfBounds(){
        int[] a = {1,2,3};
        try {
            int b = a[3];
        }
        catch (ArrayIndexOutOfBoundsException e){
        }
    }
    
    public static void processClassNotFound(){
        try {
            Class.forName("BuildInException");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
    
    public static void processNoSuchMethod() {
        TestClass testClass = new TestClass();
        Class<?> clas = testClass.getClass();
        try {
            Method method = clas.getDeclaredMethod("print");
            Field field = clas.getDeclaredField("i");
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }
    }
    
    public static void processNullPointer(){
        TestClass testClass = null;
        try {
            testClass.print();
        } catch (NullPointerException e){
            e.printStackTrace();
        }
    }
}
class TestClass{
    private int i = 0;
    public void print(){
    }
}