package model;

public class Task {
    private int id;
    private String name;
    private String description;
    private boolean isDone;
    private Priority priority;

    public Task(int id, String name, String description, Priority priority) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.isDone = false;
        this.priority = priority;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public boolean getIsDone() {
        return isDone;
    }

    public Priority getPriority() {
        return priority;
    }

    public void setName(String newName) {
        this.name = newName;
    }

    public void setDescription(String newDescription) {
        this.description = newDescription;
    }

    public void setIsTaskDone() {
        this.isDone = !this.isDone;
    }

    public void increasePriority() {
        switch (this.priority) {
            case LOW:
                this.priority = Priority.MEDIUM;
                break;
            case MEDIUM:
                this.priority = Priority.HIGH;
                break;
            case HIGH:
                break;
        }
    }

    public void decreasePriority() {
        switch (this.priority) {
            case LOW:
                break;
            case MEDIUM:
                this.priority = Priority.LOW;
                break;
            case HIGH:
                this.priority = Priority.MEDIUM;
                break;
        }
    }
}
