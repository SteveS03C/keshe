package com.shy.dao;

import com.shy.pojo.UserPojo;

import java.util.List;

/**
 * @author suhongyang
 * @version 1.0
 * Project javaEEKS
 * Description
 * Date 2025/12/17 15:49
 */
public interface UserDao {
    List<UserPojo> getUsers();
    UserPojo getUserByName(String username);
}
