package org.example;

public class Task {

    private int taskId;
    private String task;

    public Task(int taskId, String task) {
        this.taskId = taskId;
        this.task = task;
    }

    public int getTaskId() {
        return taskId;
    }

    public String getTask() {
        return task;
    }

    public void setTask(String task) {
        this.task = task;
    }
}