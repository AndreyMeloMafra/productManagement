package com.amm.agile.productManagement.repository;

import com.amm.agile.productManagement.model.Story;

import java.util.ArrayList;
import java.util.List;

public class StoryRepositoryLocalImpl implements StoryRepository {
    List<Story> stories = new ArrayList<>();
    @Override
    public Story save(Story entity) {
        stories.add(entity);
        return entity;
    }

    @Override
    public Story update(Story entity) {
        return null;
    }

    @Override
    public void delete(Story entity) {
        stories.remove(entity);
    }

    @Override
    public List<Story> findAll() {
        return stories;
    }
}
