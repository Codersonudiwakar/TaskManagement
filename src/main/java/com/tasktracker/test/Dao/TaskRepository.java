package com.tasktracker.test.Dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tasktracker.test.entities.Task;

public interface TaskRepository extends JpaRepository<Task, String>{

}
