import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MobileCodes {
    public static void main(String[] args) {
        HashMap<Integer, String> hMap = new HashMap<>();
        hMap.put(24, "Белтелеком (Максифон)");
        hMap.put(25, "life:)");
        hMap.put(291, "Velcom");
        hMap.put(292, "МТС");
        hMap.put(293, "Velcom");
        hMap.put(294, "Diallog");
        hMap.put(295, "МТС");
        hMap.put(296, "Velcom");
        hMap.put(297, "МТС");
        hMap.put(298, "МТС");
        hMap.put(299, "Velcom");
        hMap.put(33, "МТС");
        hMap.put(44, "Velcom");
        String phone = "+375295112110";
        Set set = hMap.entrySet();
        Iterator iterator = set.iterator();

        while (iterator.hasNext()){
            Map.Entry entry = (Map.Entry) iterator.next();
            if (phone.indexOf(entry.getKey().toString()) == 4)
                System.out.println(("Key is: "+ entry.getKey() + " & Value is: "+entry.getValue()));

        }
    }
}
