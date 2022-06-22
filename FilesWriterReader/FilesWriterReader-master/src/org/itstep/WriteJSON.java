package org.itstep;

import org.json.JSONArray;
import org.json.JSONObject;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteJSON {
    public static void main(String[] args) {
    FileWriter file = null;
        JSONObject main = new JSONObject();
        JSONArray persons = new JSONArray();
        main.put("Persons",persons);
        JSONObject obj1 = new JSONObject();
        obj1.put("Name", "Kristina");
        obj1.put("Phone", "+375292757349");
        persons.put(obj1);
        JSONArray emails1 = new JSONArray();
        emails1.put("Kristina@mail.ru");
        emails1.put("Kristya@mail.ru");
        obj1.put("Email's",emails1);
        JSONObject obj2 = new JSONObject();
        obj2.put("Name", "Kirill");
        obj2.put("Phone", "+375295112110");
        persons.put(obj2);
        JSONArray emails2 = new JSONArray();
        emails2.put("Kiruxa@mail.ru");
        emails2.put("Kirill@mail.ru");
        obj2.put("Email's",emails2);
        try {
            file = new FileWriter("src/org/itstep/date/JSON.json");
            file.write(main.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            try {
                file.flush();
                file.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
