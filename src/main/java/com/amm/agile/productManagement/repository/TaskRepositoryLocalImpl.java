package com.amm.agile.productManagement.repository;

import com.amm.agile.productManagement.model.Task;

import java.util.ArrayList;
import java.util.List;

public class TaskRepositoryLocalImpl implements TaskRepository {
    List<Task> tasks = new ArrayList<>();
    @Override
    public Task save(Task entity) {
        tasks.add(entity);
        return entity;
    }

    @Override
    public Task update(Task entity) {
        return null;
    }

    @Override
    public void delete(Task entity) {
        tasks.remove(entity);
    }

    @Override
    public List<Task> findAll() {
        return tasks;
    }
}
