package com.shy;

import com.shy.impl.UserServiceImpl;
import com.shy.pojo.UserPojo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    @RequestMapping(value = "user/delete",method = RequestMethod.GET)
    public String deleteUser(Integer id){
        try {
            int rows = userServiceImpl.deleteUserById(id);
            if (rows > 0) {
                return "删除成功";
            } else {
                return "删除失败";
            }
        } catch (Exception e) {
            return "删除失败：" + e.getMessage();
        }
    }

    @RequestMapping(value = "user/insert",method = RequestMethod.POST)
    public String insertUser(UserPojo user){
        try {
            int rows = userServiceImpl.insertUser(user);
            if (rows > 0) {
                return "插入成功";
            } else {
                return "插入失败";
            }
        } catch (Exception e) {
            return "插入失败：" + e.getMessage();
        }
    }
    @RequestMapping(value = "user/update",method = RequestMethod.POST)
    public String updateUser(UserPojo user){
        try {
            int rows = userServiceImpl.updateUser(user);
            if (rows > 0) {
                return "更新成功";
            } else {
                return "更新失败";
            }
        } catch (Exception e) {
            return "更新失败：" + e.getMessage();
        }
    }
}
