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

    public Todo findOne(String id){
        for (Todo todo: this.todos) {
            if(todo.getId().equals(id)){
                return todo;
            }
        }
        return null;
    }

    public Todo updateTodo(String id, Todo newTodo){
        Todo todo = this.findOne(id);
        int index = todos.indexOf(todo);
        todos.set(index, newTodo);
        return newTodo;
    }

    public boolean deleteTodo(Todo todo){
        boolean removed = todos.remove(todo);
        return removed;
    }

}
