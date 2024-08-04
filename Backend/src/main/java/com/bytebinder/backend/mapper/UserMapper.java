package com.bytebinder.backend.mapper;

import com.bytebinder.backend.entity.Users;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface UserMapper {
    Users findById(Long id);

    List<Users> findAll();

    void insert(Users users);

    void update(Users users);

    void delete(Long id);
}
