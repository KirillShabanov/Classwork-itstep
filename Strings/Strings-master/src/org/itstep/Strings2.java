import java.util.Arrays;

public class Strings2 {
    public static void main(String[] args) {
        String s = "Посчитать количество повторяющихся символов в строке";
        //Создать строку с неповторяющимися символами на основе существующей
        StringBuilder sb = new StringBuilder("");
        for (int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            if (sb.indexOf(Character.toString(c))==-1)
                sb.append(c);
        }
        System.out.println(sb);
        // Начинаем решать
        int [] count = new int[sb.length()];
        //Подсчет
        for (int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            int index = sb.indexOf(Character.toString(c));
            if (index != -1) {
                count [index]++;
            }
        }
        System.out.println(Arrays.toString(count));
        //Вывод и буква и повторения
        for (int i=0; i<sb.length(); i++)
            System.out.printf("%c, %d, %n", sb.charAt(i), count[i]);
    }
}
