import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.SortedSet;
import java.util.TreeSet;

public class Petya {
    public static void main(String[] args) throws IOException {

        SortedSet<String> set = new TreeSet<>();
        StringBuilder sb = new StringBuilder();
        BufferedReader br = new BufferedReader(new FileReader("src/date/Petya"));

        String line = br.readLine();
        while (line != null) {
            sb.append(line);
            sb.append(System.lineSeparator());
            line = br.readLine();
        }
        //System.out.println(sb);
        String content = sb.toString().replaceAll("[^А-Яа-яёЁ]", " ");

        String [] arr = content.split(" ");
        for (String s : arr){
            if ((s.length() != 0) && ((s.charAt(0) == 'п') || (s.charAt(0) == 'П')))
                set.add(s);
        }

        System.out.println(set.toString());
    }
}
