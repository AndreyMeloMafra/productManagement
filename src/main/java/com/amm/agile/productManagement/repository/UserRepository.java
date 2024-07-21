package com.amm.agile.productManagement.repository;

import com.amm.agile.productManagement.model.User;

public interface UserRepository extends BaseRepository<User> {
    User findByUsername(String username);
}
