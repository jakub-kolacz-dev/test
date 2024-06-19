package com.ogdawid.todoapp.repository;

import com.ogdawid.todoapp.model.dao.TaskEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TaskRepository extends JpaRepository<TaskEntity, Long>{
}
