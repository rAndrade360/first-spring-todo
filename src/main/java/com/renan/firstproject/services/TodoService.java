package com.renan.firstproject.services;

import com.renan.firstproject.models.Todo;
import com.renan.firstproject.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TodoService {
    @Autowired
    private TodoRepository repository;


    public List<Todo> getAll() {
        return repository.getAll();
    }

    public Todo findOne(String id) {
        return repository.findOne(id);
    }

    public void createTodo(Todo todo) {
        repository.createTodo(todo);
    }

    public void updateTodo(String id, Todo newTodo) {
        repository.updateTodo(id, newTodo);
    }

    public boolean deleteTodo(Todo todo) {
        return repository.deleteTodo(todo);
    }
}
