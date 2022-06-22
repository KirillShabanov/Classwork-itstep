package com.company.TaskList;

import org.json.JSONException;

import java.io.IOException;
import java.util.Scanner;

import static com.company.TaskList.Performers.addNextPerformers;
import static com.company.TaskList.Performers.performersWindow;

class TaskSetter {
    public static void mainWindow() throws IOException, JSONException {
        Scanner taskSetter = new Scanner(System.in);
        System.out.print("""
                Какое действие Вы желаете выполнить:\s
                1- Добавть задачу,
                2- Просмотреть список поставленных задач,
                3- Просмотреть список выполенных задач,
                4- Просмотреть список не выполненных задач,
                5- Посмотреть полный список задач,
                6- Перейти к списку исполнителей,
                7- Закрыть программу.
                Ваш выбор:\s""");
        int choice = taskSetter.nextInt();
        if (choice == 6) {
            performersWindow();
            addNextPerformers();
        } else if (choice == 7) {
            System.out.println("До скорых встреч!)");
        } else {
            wrongChoice();
            mainWindow();
        }
    }

    public static void wrongChoice() {
        System.err.println("Вы выбрали не существующий пункт! Повторите попытку!)");
    }
}
