import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class Vocabulary {

    public static void main(String[] args) {
        int count = 'z' - 'a';
        List<String> vocabulary = new LinkedList<>();
        try (BufferedReader br = new BufferedReader(new FileReader("src/date/Vocabulary.txt"))) {
            String s;
            do {
                s = br.readLine();
                if (s != null)
                    vocabulary.add(s);
            }
            while (s != null);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(vocabulary.size());

        System.out.println();

        Collections.sort(vocabulary);
        for (String s : vocabulary)
            System.out.println(s);

        //Вывести первые десять слов, используя итераты
        ListIterator<String> iterator = vocabulary.listIterator(0);
        int i = 0;
        while (iterator.hasNext() && i < 10) {
            System.out.println();
            System.out.print(iterator.next() + " " + i++);
        }

        System.out.println();

        iterator = vocabulary.listIterator(vocabulary.size());
        i = 0;
        while (iterator.hasPrevious() && i < 10) {
            System.out.println();
            System.out.print(iterator.previous() + " " + i++);
        }

        System.out.println();

        int max = 0;
        iterator = vocabulary.listIterator(0);
        String s;
        while (iterator.hasNext()) {
            s = iterator.next();
            if (s.length() > max)
                max = s.length();
        }
        System.out.println();
        System.out.println(max);

        System.out.println();

        int[] hist = new int[max];
        iterator = vocabulary.listIterator(0);
        while (iterator.hasNext()) {
            s = iterator.next();
            hist[s.length() - 1]++;
        }
        for ( i = 0; i < max; i++)
            System.out.printf("Letters: %d, words: %d%n", i + 1, hist[i]);

        System.out.println();

        iterator = vocabulary.listIterator(0);
        while (iterator.hasNext()) {
            s = iterator.next();
            if (s.equals(new StringBuilder(s).reverse().toString())) {
                System.out.println(s);
            }
        }

        System.out.println();

        Multimap<String, String> anagram = ArrayListMultimap.create();
        iterator = vocabulary.listIterator(0);
        while (iterator.hasNext()) {
            s = iterator.next();
            char[] arr = s.toCharArray();
            Arrays.sort(arr);
            String key = new String(arr);
            anagram.put(key, s);
        }
        String key = "";
        String key2 = "";
        Map.Entry<String, String> entry2 = null;
        for (Map.Entry<String, String> entry : anagram.entries()){
           key = entry.getKey();
           if (key.equals(key2))
               System.out.println(entry2.getValue() + " " + entry.getValue());
           key2 = key;
           entry2 = entry;
        }

        System.out.println();

        //6. Найти слова с тремя одинаковыми буквами
        iterator = vocabulary.listIterator(0);
        while (iterator.hasNext()) {
            s = iterator.next();
            char[] arr = s.toCharArray();
            Arrays.sort(arr);
            count = 1;
            char c2 = ' ';
            for (i = 0; i < arr.length; i++){
                char c = arr[i];
                if (c2 == c){
                    count++;
                }
                else count = 1;
                if (count == 3) {
                    System.out.println(s);
                    break;
                }
                c2 = c;
            }
        }

        System.out.println();

        //7. Найти слова, где 3 буквы следуют в алфавитном порядке
        iterator = vocabulary.listIterator(0);
        while (iterator.hasNext()) {
            s = iterator.next();
            char[] arr = s.toCharArray();
            count = 1;
            char c2 = ' ';
            for (i = 0; i < arr.length; i++){
                char c = arr[i];
                if (c - c2 == 1){
                    count++;
                }
                else count = 1;
                if (count == 3) {
                    System.out.println(s);
                    break;
                }
                c2 = c;
            }
        }
    }
}
