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
}
