package com.shy;

import com.shy.impl.UserServiceImpl;
import com.shy.pojo.UserPojo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author suhongyang
 * @version 1.0
 * Project javaEEKS
 * Description
 * Date 2025/12/17 15:49
 */
@RestController
public class MainController {
    @Autowired
    private UserServiceImpl userServiceImpl;
    
    @RequestMapping(value = "name",method = RequestMethod.GET)
    public List<UserPojo> getName(){
        return userServiceImpl.getUsers();
    }
    
    @RequestMapping(value = "user",method = RequestMethod.GET)
    public UserPojo getUserByName(@RequestParam String username){
        return userServiceImpl.getUserByName(username);
    }
}
