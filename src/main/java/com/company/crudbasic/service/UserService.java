package com.company.crudbasic.service;

import com.company.crudbasic.model.Department;
import com.company.crudbasic.model.User;
import com.company.crudbasic.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService implements IUser{
    @Autowired
    UserRepository userRepository;
    @Override
    public User add(User user) {
        if(user!=null)
        {
            return userRepository.save(user);
        }
        return null;
    }

    @Override
    public boolean Delete(Integer id)
    {
        User user=userRepository.findById(id).get();
        if(user!=null)
        {
            userRepository.delete(user);
            return true;
        }
        return false;
    }
}
