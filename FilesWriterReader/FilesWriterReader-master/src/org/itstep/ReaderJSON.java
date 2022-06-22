package org.itstep;

import org.json.JSONArray;
import org.json.JSONObject;
import org.json.JSONTokener;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class ReaderJSON {
    public static void main(String[] args) {
        try {
            FileReader file = new FileReader("src/org/itstep/date/JSON.json");
            JSONTokener tokener = new JSONTokener(file);
            JSONObject obj = new JSONObject(tokener);
            //System.out.println(obj.toString(4));
            JSONArray persons = obj.getJSONArray("Persons");
            for (int i = 0; i < persons.length(); i++){
                JSONObject person = persons.optJSONObject(i);
                String name = person.getString("Name");
                String phone = person.getString("Phone");
                System.out.println(name + " " + phone);
                JSONArray emails = person.getJSONArray("Email's");
                for (int j = 0; j < emails.length(); j++) {
                    System.out.println(emails.get(j));
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
