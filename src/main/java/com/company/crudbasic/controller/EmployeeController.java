package com.company.crudbasic.controller;

import com.company.crudbasic.model.Employee;
import com.company.crudbasic.repository.EmployeeRepository;
import com.company.crudbasic.service.IEmployee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
    @Autowired
    private IEmployee iEmployee;
    @GetMapping("")
    private String test()
    {
        return "tantan";
    }
    @PostMapping("/add")
    private Employee add(@RequestBody Employee employee)
    {
        return iEmployee.addEmployee(employee);
    }
    @GetMapping("/list")
    public List<Employee> getAll()
    {
        return iEmployee.getAllEmployee();
    }
    @GetMapping("/get")
    public Employee get(@RequestParam("id") Integer id)
    {
        return iEmployee.getEmployeeById(id);
    }
    @PutMapping("/update")
    public Employee update(@RequestBody Employee employee, @RequestParam("id") Integer id)
    {
        return iEmployee.updateEmployee(id,employee);
    }
    @DeleteMapping("/delete")
    public boolean delete(@RequestParam("id") Integer id)
    {
        return iEmployee.deleteEmployee(id);
    }
}
