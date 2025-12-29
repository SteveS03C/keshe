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
    int deleteUserById(Integer id);
    int insertUser(UserPojo user);
    /**
     * 新增用户
     * @param user 用户对象
     * @return 受影响的行数
     * @author suhongyang
     * Date 2025/12/29 9:00
     */
    int updateUser(UserPojo user);
    /**
     * 更新用户
     * @param user 用户对象
     * @return 受影响的行数
     * @author suhongyang
     * Date 2025/12/29 9:05
     */
}
