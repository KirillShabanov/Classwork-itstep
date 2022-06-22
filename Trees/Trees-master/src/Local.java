import java.util.Locale;
import java.util.Map;
import java.util.Properties;

public class Local {
    public static void main(String[] args) {
        Locale locale = Locale.getDefault();
        System.out.println(locale.getLanguage() + " " + locale.getCountry());
        System.out.println(locale.getDisplayLanguage() + " " + locale.getDisplayCountry());
        double d = 5.12;
        String s = String.format("%5.2f", d);
        System.out.println(s);

        Locale locale1 = new Locale("by", "by");
        System.out.println(locale1);
        s = String.format(locale1,"%5.2f", d);
        System.out.println(s);

        Properties properties = System.getProperties();
        for (Object key: properties.keySet()) {
            //   System.out.println(key + " " + properties.getProperty((String) key));
            if (key.equals("user.country"))
                System.out.println(key + ": " + properties.getProperty((String) key));
        }

        Map<String, String> maps = System.getenv();
        for (String key: maps.keySet())
            if (key.equals("JAVA_HOME"))
                System.out.println(key+": "+maps.get(key));
    }
}
