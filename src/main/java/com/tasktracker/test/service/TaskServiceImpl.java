package com.tasktracker.test.service;
import org.springframework.beans.factory.annotation.Autowired;


import java.util.*;
import org.springframework.stereotype.Service;

import com.tasktracker.test.Dao.TaskRepository;
import com.tasktracker.test.entities.Task;
import com.tasktracker.test.exception.ResourceNotFoundException;
//import com.tasktracker.test.exception.ResourceNotFoundException;
import com.tasktracker.test.exception.TaskIDAlreadyExistsException;
@Service
public class TaskServiceImpl implements TaskService{
	

	@Autowired
	TaskRepository taskRepository;

	@Override
	public List<Task> getAllTask() {
		
		return taskRepository.findAll();
		}

	@Override
	public Task getTaskById(String id) {
		
		return taskRepository.findById(id).orElseThrow(()-> new ResourceNotFoundException("No Match found with your id :"+id));   
	}

	@Override
	public Task addTask(Task task) {
		
		Task existtask=taskRepository.findById(task.getId()).orElse(null);
		if (existtask==null){
			taskRepository.save(task);
			return taskRepository.save(task);
			}
		else{
            throw new TaskIDAlreadyExistsException(
        "Task ID already exists!!");
}
	}


	@Override
	public String deleteTask(String id) {
		
		taskRepository.deleteById(id);
		return "Delete task Sucessfully";
		
	}

	@Override
	public String updateTask(String id, Task newTask) {
		
		newTask.setId(id);
        taskRepository.save(newTask);
        return "task update successfully";
		
	}
	 
}
