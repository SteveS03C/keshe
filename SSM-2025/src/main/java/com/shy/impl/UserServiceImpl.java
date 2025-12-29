package com.shy.impl;

import com.shy.dao.UserDao;
import com.shy.pojo.UserPojo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author suhongyang
 * @version 1.0
 * Project javaEEKS
 * Description
 * Date 2025/12/17 15:49
 */
@Service
public class UserServiceImpl {
    @Autowired
    private UserDao userDao;
    public List<UserPojo> getUsers(){
        return userDao.getUsers();
    }
    
    public UserPojo getUserByName(String username){
        return userDao.getUserByName(username);
    }

    public int deleteUserById(Integer id){
        return userDao.deleteUserById(id);
    }
    /**
     * 新增用户
     * @param user 用户对象
     * @return 受影响的行数
     * @author suhongyang
     * Date 2025/12/29 9:00
     */
    public int insertUser(UserPojo user){
        return userDao.insertUser(user);
    }
    /**
     * 更新用户
     * @param user 用户对象
     * @return 受影响的行数
     * @author suhongyang
     * Date 2025/12/29 9:05
     */
    public int updateUser(UserPojo user){
        return userDao.updateUser(user);
    }
}
