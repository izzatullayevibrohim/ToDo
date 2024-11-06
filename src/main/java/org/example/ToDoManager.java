package org.example;

import java.util.ArrayList;
import java.util.List;

public class ToDoManager {
    private static final List<Task> tasks = new ArrayList<>();

    public static void addTask(int taskId, String task) {
        tasks.add(new Task(taskId, task));
        System.out.println("Yangi task qo'shildi: " + task);
    }

    public static void updateTask(int taskId, String newTask) {
        for (Task t : tasks) {
            if (t.getTaskId() == taskId) {
                t.setTask(newTask);
                System.out.println("Task yangilandi: " + newTask);
                return;
            }
        }
        System.out.println("TaskID topilmadi: " + taskId);
    }

    public static void removeTask(int taskId) {
        for (Task t : tasks) {
            if (t.getTaskId() == taskId) {
                tasks.remove(t);
                System.out.println("Task o'chirildi: ID " + taskId);
                return;
            }
        }
        System.out.println("TaskID topilmadi: " + taskId);
    }


    public void showTask() {
        if (tasks.isEmpty()) {
            System.out.println("Tasklar ro'yxati bo'sh.");
        } else {
            System.out.println("Barcha Tasklar:");
            for (Task t : tasks) {
                System.out.println("ID: " + t.getTaskId() + ", Task: " + t.getTask());
            }

        }
    }
}