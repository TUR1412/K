package com.example.todo.controller;

import com.example.todo.model.Todo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/todos")
public class TodoController {
    private List<Todo> todoList = new ArrayList<>();
    private long idCounter = 1;

    @GetMapping
    public String getTodos(Model model) {
        model.addAttribute("todos", todoList);
        return "index";
    }

    @PostMapping
<<<<<<< HEAD
    public String addTodo(@RequestParam String description, @RequestParam String priority) {
        todoList.add(new Todo(idCounter++, description, priority));
=======
    public String addTodo(@RequestParam String description, @RequestParam LocalDate dueDate) {
        todoList.add(new Todo(idCounter++, description, dueDate));
>>>>>>> K2
        return "redirect:/todos";
    }


    @PostMapping("/complete/{id}")
    public String completeTodo(@PathVariable Long id) {
        todoList.stream()
                .filter(todo -> ((Todo) todo).getId().equals(id)) // 明确转换为 Todo 类型
                .findFirst()
                .ifPresent(todo -> ((Todo) todo).setCompleted(true)); // 明确转换为 Todo 类型
        return "redirect:/todos";
    }

    @PostMapping("/delete/{id}")
    public String deleteTodo(@PathVariable Long id) {
        todoList.removeIf(todo -> ((Todo) todo).getId().equals(id)); // 明确转换为 Todo 类型
        return "redirect:/todos";
    }
}
