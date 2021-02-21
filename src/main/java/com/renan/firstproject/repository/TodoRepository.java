package com.renan.firstproject.repository;

import com.renan.firstproject.models.Todo;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class TodoRepository {
    private List<Todo> todos = null;

    public TodoRepository(){
        this.todos = new ArrayList();
    }

    public List<Todo> getAll(){
        return this.todos;
    }

    public void createTodo(Todo todo){
        this.todos.add(todo);
    }

}
