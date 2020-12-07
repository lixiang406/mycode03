package com.bjpowernode.mapper;

import com.bjpowernode.domain.User;

import java.io.Serializable;
import java.util.List;

public interface UserMapper {
    User get(Serializable id);
    int save(User user);
    List<User> getAll();
    int save2(String username,String password);
    List<User> getByName(String name);
    List<User> getByUser(User user);
    int  deleteBatch(Serializable [] ids);
}
