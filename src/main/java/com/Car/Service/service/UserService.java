package com.Car.Service.service;

import com.Car.Service.model.User;

public interface UserService {
    void save(User user);

    User findByUsername(String username);
}
