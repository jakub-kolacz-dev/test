package com.ogdawid.todoapp.service.impl;

import com.ogdawid.todoapp.model.dao.TaskEntity;
import com.ogdawid.todoapp.repository.TaskRepository;
import com.ogdawid.todoapp.service.TaskService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
@RequiredArgsConstructor
public class TaskServiceImpl implements TaskService {

    private final TaskRepository taskRepository;


    @Override
    public TaskEntity createTask(TaskEntity task) {
        return taskRepository.save(task);
    }

    @Override
    public Optional<TaskEntity> getTask(Long id) {
        return taskRepository.findById(id);
    }

    @Override
    public List<TaskEntity> getAllTasks() {
        return taskRepository.findAll();
    }

    @Override
    public TaskEntity updateTask(TaskEntity task) {
        return taskRepository.save(task);
    }

    @Override
    public void deleteTask(Long id) {
        taskRepository.deleteById(id);
    }
}

