package com.company.crudbasic.service;

import com.company.crudbasic.model.Department;
import com.company.crudbasic.model.User;

public interface IUser {
    public User add(User user);
    public boolean Delete(Integer id);
}
