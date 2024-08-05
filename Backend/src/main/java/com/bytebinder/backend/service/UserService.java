package com.bytebinder.backend.service;

import com.bytebinder.backend.entity.Users;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface UserService {
    Users findById(Long id);
    @Select("SELECT * FROM tb_user")
    List<Users> findAll();
    void save(Users users);
    void update(Users users);
    void delete(Long id);
}

