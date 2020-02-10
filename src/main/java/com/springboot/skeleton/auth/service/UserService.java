package com.springboot.skeleton.auth.service;

import com.springboot.skeleton.auth.model.User;

public interface UserService {
    void save(User user);

    User findByUsername(String username);
}
