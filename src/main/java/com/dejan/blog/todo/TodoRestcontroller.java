package com.dejan.blog.todo;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TodoRestcontroller {

	@Autowired
	TodoService service;
	@RequestMapping(path="/todos")
	public List<Todo> retrivAllTodos(){
		
		return service.retrieveTodos("dejanBlog");
	}
	@RequestMapping(path="/todos/{id}")
	public Todo retriveTodos(@PathVariable int id){
		Todo todo=new Todo();
		return service.retrieveTodo(todo.getId());
	}
}
