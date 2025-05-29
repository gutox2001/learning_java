package model;

public class TaskList {
    private String name;
    private Task[] tasks;

    public TaskList(String name) {
        this.name = name;
        this.tasks = new Task[0];
    }

    public String getName() {
        return name;
    }

    public Task[] getTasks() {
        return tasks;
    }

    public Task getTaskById(int id) {
        for (Task task : tasks) {
            if (task.getId() == id) {
                return task;
            }
        }
        return null;
    }

    public void addTask(Task newTask) {
        Task[] newTasks = new Task[tasks.length + 1];
        for (int i = 0; i < tasks.length; i++) {
            newTasks[i] = tasks[i];
        }
        newTasks[tasks.length] = newTask;
        tasks = newTasks;
    }

    public void removeTask(int id) {
        Task[] newTasks = new Task[tasks.length - 1];
        int j = 0;
        for (int i = 0; i < tasks.length; i++) {
            if (tasks[i].getId() != id) {
                newTasks[j] = tasks[i];
                j++;
            }
        }
        tasks = newTasks;
    }
}
