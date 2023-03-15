package com.company.crudbasic.service;

import com.company.crudbasic.model.Employee;

import java.util.List;
import java.util.Optional;

public interface IEmployee {
    public Employee addEmployee(Employee employee);
    public Employee updateEmployee(Integer id, Employee employee);
    public boolean deleteEmployee(Integer id);
    public List<Employee> getAllEmployee();
    public Employee getEmployeeById(Integer id);

}
