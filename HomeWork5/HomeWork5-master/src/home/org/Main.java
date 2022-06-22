package home.org;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

public class Main {

    public static void main(String[] args) throws MalformedURLException {
        /**  Задача 1. Из исходного слова путем «вырезок» и «склеек» его подстрок получить другие слова: **/

        /**  1. интерфейс: интерес, фитнес **/
        String s = "интерфейс";
        String part1 = s.substring(0,5);
        char let1 = s.charAt(3);
        char let2 = s.charAt(8);
        char let3 = s.charAt(5);
        char let4 = s.charAt(0);
        char let5 = s.charAt(2);
        char let6 = s.charAt(1);
        System.out.println("____________________________________________________________________________________");
        System.out.println("Задание 1.1: " + part1 + let1 + let2 + ", " + let3 + let4 + let5 + let6 + let1 + let2);

        /** 2. программа: мрамор, грамм. **/
        s = "программа";
        let1 = s.charAt(6);
        let2 = s.charAt(1);
        let3 = s.charAt(5);
        let4 = s.charAt(2);
        part1 = s.substring(3,8);
        System.out.println("Задание 1.2: " + let1 + let2 + let3 + let1 + let4 + let2 + ", " + part1);

        /** 3. абстракция: актрисса, бариста. **/
        s = "абстракция";
        let1 = s.charAt(0);
        let2 = s.charAt(6);
        let3 = s.charAt(3);
        let4 = s.charAt(4);
        let5 = s.charAt(8);
        let6 = s.charAt(2);
        char let7 = s.charAt(1);
        System.out.println("Задание 1.3: " + let1 + let2 + let3 + let4 + let5 + let6 + let6 + let1 + ", " + let7 + let1 + let4 + let5 + let6 + let3 +let1);

        /** 4. компилятор: импорт, компот. **/
        s = "компилятор";
        let1 = s.charAt(4);
        let2 = s.charAt(2);
        let3 = s.charAt(3);
        let4 = s.charAt(1);
        let5 = s.charAt(9);
        let6 = s.charAt(7);
        part1 = s.substring(0,4);
        System.out.println("Задание 1.4: " + let1 + let2 + let3 + let4 + let5 + let6 + ", " + part1 + let4 + let6);

        /** 5. рекурсия: серия, кисея. **/
        s = "рекурсия";
        let1 = s.charAt(5);
        let2 = s.charAt(1);
        let3 = s.charAt(0);
        let4 = s.charAt(6);
        let5 = s.charAt(7);
        let6 = s.charAt(2);
        System.out.println("Задание 1.5: " + let1 + let2 + let3 + let4 + let5 + ", " + let6 + let4 + let1 + let2 + let5);

        /** 6. исключение: лесник, ключи. **/
        s = "исключение";
        let1 = s.charAt(3);
        let2 = s.charAt(6);
        let3 = s.charAt(1);
        let4 = s.charAt(7);
        let5 = s.charAt(0);
        let6 = s.charAt(2);
        part1 = s.substring(2,6);
        System.out.println("Задание 1.6: " + let1 + let2 + let3 + let4 + let5 + let6 + ", " + part1 + let5);

        /** Задача 2. Дано предложение. **/

        /** 1. Все его символы, стоящие на четных местах, заменить буквой ы. **/
        s = "Все его символы, стоящие на четных местах, заменить буквой ы.";
        String alphabets = "абвгдеёжзийклмнопрстуфхцчшщЪьэюя";
        StringBuilder sb = new StringBuilder(s);
        int counter = 0;
        for (int i = 0; i < sb.length(); i++) {
            char currChar = sb.charAt(i);
            int idx = alphabets.indexOf(currChar);
            if (idx != -1) {
                if (counter % 2 == 1) {
                    sb.setCharAt(i, 'ы');
                }
                counter++;
            }
        }
        System.out.println("____________________________________________________________________________________");
        System.out.println("Задание 2.1: " + sb);

        /** 2. Все его символы, стоящие на третьем, шестом, девятом и т. д. местах, заменить буквой а. **/

        s = "Все его символы, стоящие на третьем, шестом, девятом и т. д. местах, заменить буквой а.";
        alphabets = "абвгдеёжзийклмнопрстуфхцчшщЪьэюя";
        sb = new StringBuilder(s);
        counter = 0;
        for (int i = 0; i < sb.length(); i++){
            char currChar = sb.charAt(i);
            int idx = alphabets.indexOf(currChar);
            if (idx != -1) {
                if (counter % 2 == 1){
                    sb.setCharAt(i, 'а');
                }
                counter += 3;
            }
        }
        System.out.println("Задание 2.2: " + sb);

        /** 3.Дано предложение. Заменить в нем все вхождения буквосочетания ах на ух. **/
        s = "А конец песни замыкал начальный посыл: «ах, дайте, ах, дайте скорее вина, рассказывать больше нет мочи».";
        String newS = s.replace("ах", "УХ");
        System.out.println("Задание 2.3: " + newS);


        /** 4. Дано предложение. Заменить в нем все вхождения буквосочетания да на не. **/
        s = "Ведь кожа да кости.";
        newS = s.replace("да", "НЕ");
        System.out.println("Задание 2.4: " + newS);

        /** 5. Дано предложение. Заменить в нем все вхождения буквосочетания про на нет. **/
        s = "пропала собака пропала собака, " + "пропала собака по кличке Дружок.";
        newS = s.replace("про","НЕТ");
        System.out.println("Задание 2.5: " + newS);

        /** 6. Дано предложение. Заменить в нем все вхождения буквосочетания бит на рог. **/
        s = "Пульсом бьёт бит пульсом, бьёт бит," + "в сезон танцев открыт, пульсом бьёт бит";
        newS = s.replace("бит","РОГ");
        System.out.println("Задание 2.6: " + newS);


        /**  Задача 3. Программа должна обрабатывать все строки, подобные указанным. **/
        System.out.println("____________________________________________________________________________________");

        /** 1. Из пути файла в Windows извлечь каталог, краткое имя и расширение. C:\Windows\System32\calc.exe **/
        System.out.println("Задание3.1: ");
        File dir = new File ("C:/Windows/System32/calc.exe");
        System.out.println("directory: " + dir.getParentFile());
        System.out.println("file name: " + dir.getName());
        String[] extension = dir.toString().split("\\.");
        System.out.println("file extension: " + extension[extension.length-1]);

       /** 2. Из пути файла в Linux извлечь каталог, краткое имя и расширение. /etc/samba/smb.conf **/
        System.out.println("Задание3.2: ");
        File dir1 = new File ("/etc/samba/smb.conf");
        System.out.println("directory: " + dir1.getParentFile());
        System.out.println("file name: " + dir1.getName());
        String[] extension1 = dir1.toString().split("\\.");
        System.out.println("file extension: " + extension1[extension1.length-1]);

        /** 3. Из URL извлечь протокол, домен, имя файла и расширение. https://www.computerhope.com/index.html **/

        URL url = new URL("https://www.computerhope.com/index.html");
        System.out.println("Задание3.3: ");
        System.out.println("protocol: " + url.getProtocol());
        System.out.println("domain: " + url.getHost());
        System.out.println("file name: " + url.getFile());
        String[] str=url.toString().split("\\.");
        System.out.println("file extension: " + str[str.length-1]);

    }
}
