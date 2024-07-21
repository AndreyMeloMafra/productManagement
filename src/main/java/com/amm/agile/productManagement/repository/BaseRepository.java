package com.amm.agile.productManagement.repository;

import java.util.List;

public interface BaseRepository<T> {
    T save(T entity);
    T update(T entity);
    void delete(T entity);
    List<T> findAll();
}
