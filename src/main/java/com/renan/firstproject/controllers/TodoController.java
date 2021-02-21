package com.renan.firstproject.controllers;

import com.renan.firstproject.models.Todo;
import com.renan.firstproject.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.xml.ws.Response;
import java.util.List;

@RestController
public class TodoController {

    @Autowired
    private TodoRepository repository;

    @GetMapping("/api/todos")
    public List<Todo> index() {
        return repository.getAll();
    }

    @GetMapping("/api/todos/{id}")
    public Todo show(@PathVariable("id") String id){
        Todo todo = repository.findOne(id);
        return todo;
    }

    @PostMapping(path="/api/todos", consumes = "application/json", produces = "application/json")
    public Todo create( @Valid @RequestBody Todo todo){
        repository.createTodo(todo);
        return todo;
    }

    @PutMapping(path="/api/todos/{id}", consumes = "application/json", produces = "application/json")
    public Todo update(@Valid @PathVariable("id") String id, @Valid @RequestBody Todo newTodo){
        newTodo.setId(id);
        repository.updateTodo(id, newTodo);
        return newTodo;
    }

    @DeleteMapping(path = "/api/todos/{id}")
    public ResponseEntity<String> delete(@Valid @PathVariable("id") String id){
        Todo todo = repository.findOne(id);
        boolean removed = repository.deleteTodo(todo);
        if (removed){
            return  ResponseEntity.ok("ok");
        }else {
            return ResponseEntity.ok("Error");
        }
    }


}
