import java.time.LocalDate;

public class Todo {
    private Long id;
    private String description;
    private boolean isCompleted;
    private LocalDate dueDate; // 新增：任务截止日期

    public Todo(Long id, String description, LocalDate dueDate) {
        this.id = id;
        this.description = description;
        this.dueDate = dueDate;
        this.isCompleted = false;
    }

    // 省略getter和setter
    public LocalDate getDueDate() {
        return dueDate;
    }

    public void setDueDate(LocalDate dueDate) {
        this.dueDate = dueDate;
    }
}
