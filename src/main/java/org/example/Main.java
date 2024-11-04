package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ToDoManager toDoManager = new ToDoManager();

        while (true) {

            System.out.println("     Menu   ");
            System.out.println("1. Task yaratish.");
            System.out.println("2. Taskni yangilash.");
            System.out.println("3. Taskni o`chirish.");
            System.out.println("4. Barcha taskni ko`rish.");
            System.out.println("0. Exit.");
            System.out.print("choose: ");

            int choose;
            if (scanner.hasNextInt()) {
                choose = scanner.nextInt();
                scanner.nextLine();
            } else {
                System.out.println("Raqam kiriting.");
                scanner.nextLine();
                continue;
            }

            switch (choose) {
                case 1:
                    System.out.print("Task ID ni kiriting: ");
                    int taskId = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Taskni kiriting: ");
                    String task = scanner.nextLine();
                    toDoManager.addTask(taskId, task);
                    break;

                case 2:
                    System.out.print("Yangilanadigan taskID ni kiriting: ");
                    int updateId = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Yangi taskni kiriting: ");
                    String newTask = scanner.nextLine();
                    toDoManager.updateTask(updateId, newTask);
                    break;

                case 3:
                    System.out.print("O`chiriladigan task ID ni kiriting: ");
                    int deleteId = scanner.nextInt();
                    scanner.nextLine();
                    toDoManager.removeTask(deleteId);
                    break;

                case 4:
                    toDoManager.showTask();
                    break;

                case 0:
                    System.out.println("Dastur tugatildi.");
                    scanner.close();
                    return;

                default:
                    System.out.println("Notogri tanlov. Qaytadan urinib koring: ");
            }
        }
    }

}