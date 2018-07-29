package com.jike.usermanage.service;

import com.jike.usermanage.exception.UserNotFound;
import com.jike.usermanage.model.User;
import org.springframework.data.domain.Page;

import java.util.List;

public interface UserService {
    //添加用户
    void addUser(User user);

    //修改用户
    User updateUser(User user) throws UserNotFound;

    //删除用户，根据用户编号删除
    User deleteUser(int id) throws UserNotFound;

    //查询单个用户
    User getUser(int id);

    //查询所有用户
    List<User> getUsers();

    //不带分页的条件查询
    List<User> getUsersByConditionNoPage(String phone, String address);

    //带分页的条件查询
    Page<User> getUsersByConditionWithPage(String phone, String address, Integer page, Integer pageSize);
}
