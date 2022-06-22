

public class StringS {
    public static void main(String[] args) {
        String s = "Strings examples";
        //Получить символ по его номеру, а также номер символа в кодовой таблице UTF-8
        System.out.println(s.charAt(0));
        char c = s.charAt(0);
        System.out.printf("Symbol:  %c, number: %d%n", c, (int) c);
        //Собрать строку из символов
        char c1 = '2', c2 = '\u00B7', c3 = '\u03C0', c4 = '=', c5 = '1',
                c6 = '8', c7 = '0', c8 = '\u00B0';
        s = "" + c1 + c2 + c3 + c4 + c5 + c6 + c7 + c8;
        System.out.println(s);

        char [] chars = {'\u4055','\u4048', '\u4049'};
        s = new String(chars);
        System.out.println(s);

        //Сравнение строк.
        System.out.println('a'-'b');
        //String s1 = "first", s2 = "second";


        //Конкатенация строк
        String s1 = "first", s2 = "second";
        //s1 += s2;
        System.out.println(s1);
        s1 = s1.concat(s2);
        System.out.println(s1);

        //Проверить, содержит ли строковое значение только цифры
        s = "123s";
        System.out.println(isContainsOnlyDigits(s));

        //Заменить символ в строке (точку на вопросительный знак)
        s = "Why is garbage collection necessary in Java.";
        int poss = s.indexOf('.');
        StringBuilder sb = new StringBuilder(s);
        sb.setCharAt(poss, '?');
        System.out.println(sb);

        //Заменить подстроку в строке
        s = "JVM is a %s virtual machine.";
        String result = s.replace("%s", "Java");
        System.out.println(result);

        //Извлечь из строки подстроки JVM и JRE
        s = "JDK vs JRE vs JVM";
        result = s.substring(s.length()-3);
        System.out.println(result);

        result = s.substring(7,10);
        System.out.println(result);

        //Удалить все скобки из выражения
        s = "What are the {wrapper} {classes} in Java?";
        result = s.replaceAll("[{}]", "");
        System.out.println(result);

        //Заменить запятые на точку с запятой
        s = "int, byte, short, long, float, double, boolean, and char";
        result = s.replaceAll(",", ";");
        System.out.println(result);

        //Заменить первую букву на прописную
        s = "what is JIT compiler in Java?";
        sb = new StringBuilder(s);
        sb.setCharAt(0, s.substring(0,1).toUpperCase().charAt(0));
        System.out.println(sb);

        //Разбить строку на подстроки
        s = "Access modifiers in Java are: \nDefault\nPrivate\nProtected\nPublic";
        String [] sArr = s.split("\n");
        for (String elem : sArr)
        System.out.println(elem);

        //Удалить концевые пробелы
        s = " Object-Oriented Programming or OOPs is a programming style that is associated with concepts like: "
                + "inheritance, encapsulation, polymorphism, abstraction. ";
        result = s.trim();
        System.out.println(result);

        //Найти в строке символ с наименьшим кодом UTF-8 -РАЗОБРАТЬСЯ!!!!!!!!!!!!!!!!!!!!!!!
        s = "string";
        char [] chArrs = s.toCharArray();
        int min = chArrs[0];
        for (int i=0; i < chArrs.length; i++)
            if (i == sb.charAt(0)){
                i++;
            }
        System.out.println(min);



    }
    private static boolean isContainsOnlyDigits(String s) {
    for (int i=0; i<s.length(); i++)
        if (!Character.isDigit(s.charAt(i)))
            return false;
        return true;
    }
}
