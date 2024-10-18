<<<<<<< HEAD
package com.example.todo.model;
=======
import java.time.LocalDate;
>>>>>>> K2

public class Todo {
    private Long id;
    private String description;
    private boolean isCompleted;
<<<<<<< HEAD
    private String priority; // 新增：任务优先级

    public Todo(Long id, String description, String priority) {
        this.id = id;
        this.description = description;
        this.priority = priority;
=======
    private LocalDate dueDate; // 新增：任务截止日期

    public Todo(Long id, String description, LocalDate dueDate) {
        this.id = id;
        this.description = description;
        this.dueDate = dueDate;
>>>>>>> K2
        this.isCompleted = false;
    }

    // 省略getter和setter
<<<<<<< HEAD
    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
=======
    public LocalDate getDueDate() {
        return dueDate;
    }

    public void setDueDate(LocalDate dueDate) {
        this.dueDate = dueDate;
>>>>>>> K2
    }
}
