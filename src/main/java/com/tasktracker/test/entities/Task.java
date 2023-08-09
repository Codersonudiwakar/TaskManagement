package com.tasktracker.test.entities;

import java.util.*;

import org.springframework.format.annotation.DateTimeFormat;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Future;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
@Entity
public class Task {
	@Id
	@NotEmpty(message ="Id must be unique or requird")
	@Size(max =10,min =1,message = "min char 1 or max 10 pass")
	private String id;
	
	@Size(max =100,min =25,message = "min char 50 or max 100 pass")
	@NotEmpty(message ="Title is required or Not empty")
	private String title;
	
	@Size(max =250,min =100,message = "min char 150 or max 250 pass")
	@NotEmpty(message ="Title is required or Not empty")
	private String description;
	
	
    @Future(message = "Due date must be a future date")
	@DateTimeFormat(pattern = "yyyy-MM-dd")
    @NotNull(message = "Please provide a date.")
	private Date dueDate;
	
	
	public Task(String id, String title, String description, Date dueDate) {
		this.id = id;
		this.title = title;
		this.description = description;
		this.dueDate = dueDate;
	}
	public Task() {
	
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Date getDueDate() {
		return dueDate;
	}
	public void setDueDate(Date dueDate) {
		this.dueDate = dueDate;
	}
	
	@Override
	public String toString() {
		return "Task [id=" + id + ", title=" + title + ", description=" + description + ", dueDate=" + dueDate + "]";
	}

}

