package com.tasktracker.test.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.tasktracker.test.entities.Task;
import com.tasktracker.test.service.TaskService;

import jakarta.validation.Valid;

import java.util.List;

@RestController

public class TaskController {
    public TaskController(TaskService taskService ) {
		
	}

	@Autowired
    private TaskService taskService;
    @RequestMapping("/")
    public String sayHi() {
    	return "this Application Run";
    }

    @GetMapping("/tasks") 
    public List<Task> getAllTask() { 
        return taskService.getAllTask();
    }

    @GetMapping("tasks/{id}")
    public Task getTaskById(@PathVariable String id) {
        Task task = taskService.getTaskById(id);
        return task;
    }
    
	
	@PostMapping("/tasks")
	public Task addTask( @Valid @RequestBody Task task) {
		return taskService.addTask(task);
	}
	 

    @PutMapping("/tasks/{id}")
    public String updateTask( @Valid @PathVariable  String id, @RequestBody Task newTask) {
    	taskService.updateTask(id, newTask);
    	return "task update Sucessfully";
    }

    @DeleteMapping("/tasks/{id}")
    public String deleteTask(@PathVariable String id) {
    	taskService.deleteTask(id);
    	return "Delete task Sucessfully";
    }
}
