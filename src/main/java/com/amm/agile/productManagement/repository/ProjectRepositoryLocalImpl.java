package com.amm.agile.productManagement.repository;

import com.amm.agile.productManagement.model.Project;

import java.util.ArrayList;
import java.util.List;

public class ProjectRepositoryLocalImpl implements ProjectRepository {
    List<Project> projects = new ArrayList<>();
    @Override
    public Project save(Project entity) {
        projects.add(entity);
        return entity;
    }

    @Override
    public Project update(Project entity) {
        return null;
    }

    @Override
    public void delete(Project entity) {
        projects.remove(entity);
    }

    @Override
    public List<Project> findAll() {
        return projects;
    }
}
