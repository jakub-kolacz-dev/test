package com.ogdawid.todoapp.model.dao;

import com.ogdawid.todoapp.model.enums.TaskStateEnum;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class TaskEntity {

    @Id
    private Long id;

    private String description;

    @Enumerated(EnumType.STRING)
    private TaskStateEnum state;

    private String username;
}
