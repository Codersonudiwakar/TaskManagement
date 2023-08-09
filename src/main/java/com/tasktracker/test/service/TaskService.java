package com.tasktracker.test.service;

import java.util.List;
import com.tasktracker.test.entities.Task;

public interface TaskService {
	 public Task addTask(Task task);
	 public Task getTaskById(String id);
	 public List<Task> getAllTask();
	 public String deleteTask(String id);
	 public String updateTask(String id, Task newTask);

}
