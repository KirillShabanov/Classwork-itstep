package org.itstep;

import org.ini4j.Profile;
import org.ini4j.Wini;

import java.io.File;
import java.io.IOException;

public class ReadIniFile {
    public static void main(String[] args) {
        String fileName = "src/org/itstep/date/dateIni.ini";
        File file = new File(fileName);
        try {
            Wini wini = new Wini (file);
            Profile.Section options = wini.get("Options");
            String desc = options.get("desc");
            String name = options.get("name");
            int number = options.get("number",Integer.class);
            double value = options.get("value",Double.class);
            System.out.printf("desc: %s, name: %s, number: %d, value: %.2f%n", desc,name,number,value);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
