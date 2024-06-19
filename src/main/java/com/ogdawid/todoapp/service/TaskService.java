package com.ogdawid.todoapp.service;

import com.ogdawid.todoapp.model.dao.TaskEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


public interface TaskService {

    TaskEntity createTask(TaskEntity task);
    Optional<TaskEntity> getTask(Long id);
    List<TaskEntity> getAllTasks();
    TaskEntity updateTask(TaskEntity task);
    void deleteTask(Long id);
}
