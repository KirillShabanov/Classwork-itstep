package org.itstep;

import org.ini4j.Wini;

import java.io.File;
import java.io.IOException;

public class WriteIniFile {
    public static void main(String[] args) {
        String fileName = "src/org/itstep/date/dateIni.ini";
        File file = new File(fileName);
        try {
            file.createNewFile();
            Wini wini = new Wini (file);
            wini.put("Options", "desc", "�������� ������� �1");
            wini.put("Options", "name", "������� �1");
            wini.put("Options", "number", 12345);
            wini.put("Options", "value", 3.2);
            wini.store();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
