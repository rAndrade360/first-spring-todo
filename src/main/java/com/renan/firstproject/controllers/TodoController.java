package com.renan.firstproject.controllers;

import com.renan.firstproject.models.Todo;
import com.renan.firstproject.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TodoController {

    @Autowired
    private TodoRepository repository;

    @GetMapping("/api/todos")
    public List<Todo> index() {
        return repository.getAll();
    }

    @PostMapping(path="/api/todos", consumes = "application/json", produces = "application/json")
    public Todo create(@RequestBody Todo todo){
        repository.createTodo(todo);
        return todo;
    }

}
