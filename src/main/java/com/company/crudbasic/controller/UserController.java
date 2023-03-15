package com.company.crudbasic.controller;

import com.company.crudbasic.model.User;
import com.company.crudbasic.service.IUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/User")
public class UserController {
    @Autowired
    IUser iUser;
    @PostMapping("/add")
    public User add(@RequestBody User user)
    {
        return iUser.add(user);
    }
    @DeleteMapping("/delete")
    public boolean delete(@RequestParam("id") Integer id)
    {
       return iUser.Delete(id);
    }
    @GetMapping("/list")
    public List<User> getAllUser()
    {
        return null;
    }
}
