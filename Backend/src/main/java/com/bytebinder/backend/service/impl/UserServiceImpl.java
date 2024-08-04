package com.bytebinder.backend.service.impl;

import com.bytebinder.backend.entity.Users;
import com.bytebinder.backend.mapper.UserMapper;
import com.bytebinder.backend.service.UserService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class UserServiceImpl implements UserService {
    private final UserMapper userMapper;

    public UserServiceImpl(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    @Override
    public Users findById(Long id) {
        return userMapper.findById(id);
    }

    @Override
    public List<Users> findAll() {
        return userMapper.findAll();
    }

    @Override
    public void save(Users users) {
        if (users.getId() == null) {
            userMapper.insert(users);
        } else {
            userMapper.update(users);
        }
    }

    @Override
    public void update(Users users) {
        userMapper.update(users);
    }

    @Override
    public void delete(Long id) {
        userMapper.delete(id);
    }
}
