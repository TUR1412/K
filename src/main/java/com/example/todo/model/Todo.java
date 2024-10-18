package com.example.todo.model;

public class Todo {
    private Long id;
    private String description;
    private boolean isCompleted;
    private String priority; // 新增：任务优先级

    public Todo(Long id, String description, String priority) {
        this.id = id;
        this.description = description;
        this.priority = priority;
        this.isCompleted = false;
    }

    // 省略getter和setter
    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }
}
