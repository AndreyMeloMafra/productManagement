package com.amm.agile.productManagement.config;

import com.amm.agile.productManagement.model.User;
import com.amm.agile.productManagement.repository.UserRepository;
import com.amm.agile.productManagement.repository.UserRepositoryLocalImpl;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class CustomUserDetailsService implements UserDetailsService {
    private final UserRepository userRepository = new UserRepositoryLocalImpl();

    @Override
    public User loadUserByUsername(String username) throws UsernameNotFoundException {
        return userRepository.findByUsername(username);
    }
}