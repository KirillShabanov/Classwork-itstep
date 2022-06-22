import java.util.HashMap;
import java.util.Scanner;

/**
 * 1:	一	&#x4e00;
 * 2:	二	&#x4e8c;
 * 3:	三	&#x4e09;
 * 4:	四	&#x56db;
 * 5:	五	&#x4e94;
 * 6:	六	&#x516d;
 * 7:	七	&#x4e03;
 * 8:	八	&#x516b;
 * 9:	九	&#x4e5d;
 * 10:	十	&#x5341;
 * 11:	十一 &#x5341;&#x4e00;
 * 12:	十二	&#x5341;&#x4e8c;
 * 20:	二十	&#x4e8c;&#x5341;
 * 50:	五十	&#x4e94;&#x5341;
 * 100:	百	&#x767e;
 * 1000: 千 ;
 */

public class ChineseConverter {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int number = scanner.nextInt();
        HashMap<Integer, String> hashMap = new HashMap<>();
        hashMap.put(1, "\u4e00");
        hashMap.put(2, "\u4e8c");
        hashMap.put(3, "\u4e09");
        hashMap.put(4, "\u56db");
        hashMap.put(5, "\u4e94");
        hashMap.put(6, "\u516d");
        hashMap.put(7, "\u4e03");
        hashMap.put(8, "\u516b");
        hashMap.put(9, "\u4e5d");
        hashMap.put(10, "\u5341");
        hashMap.put(100, "\u767e");
        hashMap.put(1000, "\u5343");

        String s = "";
        int number0 = number;
        while (number > 0){
            s = s.concat(Integer.toString(number % 10));
            number = number / 10;
        }
        int ones = 0, tens = 0, hundreds = 0;
        String sOnes = String.valueOf(s.charAt(0));
        ones = Integer.parseInt(sOnes);
        if (number0 > 9){
            String sTens = String.valueOf(s.charAt(1));
            tens = Integer.parseInt(sTens);
        }
        if (number0 > 99){
            String sHundreds = String.valueOf(s.charAt(2));
            hundreds = Integer.parseInt(sHundreds);
        }
        System.out.println("Адинки: " + ones);
        System.out.println("Дзесятачки: " + tens);
        System.out.println("Сотачки: " + hundreds);

        s = "";
        if (hundreds == 1) s = s.concat(hashMap.get(100));
        else if (hundreds != 0) s = s.concat(hashMap.get(hundreds).concat(hashMap.get(100)));
        if (tens == 0) s = s.concat(hashMap.get(10));
        else if (tens != 0) s = s.concat(hashMap.get(tens).concat(hashMap.get(10)));
        if (ones != 0) s = s.concat(hashMap.get(ones));
        System.out.println(s);
    }
}