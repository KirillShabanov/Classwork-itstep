package com.company.TaskList;

import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;
import org.json.simple.JSONArray;


import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import static com.company.TaskList.TaskSetter.mainWindow;
import static com.company.TaskList.TaskSetter.wrongChoice;

public class Performers {
    public static void performersWindow() throws JSONException, IOException {
        addNextPerformers();
    }

    public static void addNextPerformers() throws IOException, JSONException {
        System.out.print("""
                Какое действие произвести далее:
                1- Добавить исполнителя,
                2- Вывести список исполнителей,
                3- Выйти в предыдущее окно,
                4- Закрыть.
                Ваш выбор:\s""");
        Scanner perfchoice = new Scanner(System.in);
        int perfChoice = perfchoice.nextInt();
        if (perfChoice == 1) {
            writePerformersJSON();
            addNextPerformers();
        }  else if (perfChoice == 2) {
            readPerformerJSON();
            addNextPerformers();
        } else if (perfChoice == 3) mainWindow();
        else if (perfChoice == 4) System.out.println("До скорых встреч!)");
        else {
            wrongChoice();
            addNextPerformers();
        }

    }

    public static void readPerformerJSON() {
        try {
            FileReader performerJSON = new FileReader("src/com/company/date/performers.json");
            JSONTokener tokener = new JSONTokener(performerJSON);
            JSONObject obj = new JSONObject(tokener);
            org.json.JSONArray persons = obj.getJSONArray("Performer");
            for (int i = 0; i < persons.length(); i++) {
                JSONObject performers = persons.optJSONObject(i);
                String surname = performers.getString("Фамилия");
                String name = performers.getString("Имя");
                System.out.println(name + " " + surname + " ");

            }
        } catch (FileNotFoundException | JSONException e) {
            e.printStackTrace();
        }
    }


    public static void writePerformersJSON() throws JSONException, FileNotFoundException {
        new FileReader("src/com/company/date/performers.json");
        Scanner performers = new Scanner(System.in);
        System.out.print("Добавте данные по исполнителю:" + "\n" +
                "Фамилия: ");
        String performerSurname = performers.next();
        System.out.print("Имя: ");
        String performerName = performers.next();

        FileWriter performerJSON = null;
        JSONObject main = new JSONObject();
        JSONArray persons = new JSONArray();
        JSONObject performer = new JSONObject();
        performer.put("Фамилия", performerSurname);
        performer.put("Имя", performerName);
        persons.add(performer);
        main.put("Performer", persons);
        try {
            performerJSON = new FileWriter("src/com/company/date/performers.json");
            performerJSON.write(main.toString());
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                assert performerJSON != null;
                performerJSON.flush();
                performerJSON.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
