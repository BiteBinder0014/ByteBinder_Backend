package com.bytebinder.backend.service;

import com.bytebinder.backend.entity.Users;

import java.util.List;

public interface UserService {
    Users findById(Long id);
    List<Users> findAll();
    void save(Users users);
    void update(Users users);
    void delete(Long id);
}

