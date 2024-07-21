package com.amm.agile.productManagement.repository;

import com.amm.agile.productManagement.model.User;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import java.util.ArrayList;
import java.util.List;

public class UserRepositoryLocalImpl implements UserRepository {
    List<User> users = new ArrayList<>();

    public UserRepositoryLocalImpl() {
        this.users.add(new User("andrey", "admin", null));
    }

    @Override
    public User save(User entity) {
        users.add(entity);
        return entity;
    }

    @Override
    public User update(User entity) {
        return null;
    }

    @Override
    public void delete(User entity) {
        users.remove(entity);
    }

    @Override
    public List<User> findAll() {
        return users;
    }

    public User findByUsername(String username) {
        for (User user : users) {
            if (user.getUsername().equals(username)) {
                return user;
            }
        }

        throw new UsernameNotFoundException("Usuário não encontrado");
    }
}
