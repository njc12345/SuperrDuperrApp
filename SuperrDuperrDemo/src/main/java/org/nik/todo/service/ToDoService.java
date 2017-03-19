package org.nik.todo.service;

import org.nik.todo.model.ToDoItem;
import org.nik.todo.model.ToDoItems;

public interface ToDoService {
	
	public ToDoItems getAllToDoItems();	
	public void addNewList(String newListName);
    public void addToDoItem(String listName, ToDoItem toDoItem);
    public void deleteToDoItem(String listName, ToDoItem toDoItem);
}
