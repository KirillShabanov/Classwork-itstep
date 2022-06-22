package org.itstep;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExpr {

    public static void main(String[] args) {
        Pattern p = Pattern.compile(".");
        Matcher m = p.matcher("a");
        boolean b = m.matches();
        System.out.println(b);

        boolean b2 = Pattern.compile(".").matcher("as").matches();
        System.out.println(b2);

        boolean b3 = Pattern.matches(".","as");
        System.out.println(b3);

        //Строка содержит один символ 'a'
        check("a","a","b");
        //Строка содержит одну или более букву "a", а за ней одну букву "b"
        check("a+b","aaab", "bba");
        //Строка содержит несколько или ни одной буквы "a", а за ней одну букву "b"
        check("a*b", "ab", "abb");
        //Слово состоит из двух букв, первая из которых "a"
        check("a.", "ab", "abb");
        //Строка начинается на букву "a"
        check("a.*", "ab", "nbb");
        //Строка заканчивается на букву "a"
        check(".*a", "aba", "nbb");
        //Строка содержит "as"
        check(".*as.*", "abasa", "nbbsa");
        //Строка не содержит "a"
        check("[^a]*", "bbb", "bbab");
        //Слово начинается на "a" или "A"
        check("[aA].*", "Abbb", "bbab");
        //Слово начинается не на "a" или "A"
        check("[^aA].*", "cbbb", "abbab");
        //В строке содержатся цифры
        check(".*\\d.*", "cb4bb", "abbab");
        //Трехзначное целое число
        check("\\d{3}", "124", "abbab");
        //Строка содержит только цифры
        check("[0-9]*", "121234", "abbab"); // "[\\d]*"
        //Строка является вещественным числом с фиксированной точкой
        check("[+-]?\\d+[.]?\\d*?", "-5.3", "abbab");
        //Содержит ни одного или более сочетаний "ab", а затем "c"
        check("(ab).*", "acb4bb", "abbab");
        //Проверить написание номера телефона в формате +37533-111-11-11
        //+375 33 111-11-11
        check("[+]\\d{3} \\d{2} \\d{3}-\\d{2}-\\d{2}","+375 33 111-11-11","+375(33)111-11-11");
    }

    public static void check (String sPattern, String sCorrect, String sWrong){
        boolean bCorrect = Pattern.matches(sPattern, sCorrect);
        boolean bWrong = Pattern.matches(sPattern, sWrong);
        System.out.println(bCorrect + " " + bWrong);
    }
}
