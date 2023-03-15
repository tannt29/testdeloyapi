package com.company.crudbasic.service;

import com.company.crudbasic.model.Employee;
import com.company.crudbasic.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService implements IEmployee {
    @Autowired
    private EmployeeRepository employeeRepository;
    @Override
    public Employee addEmployee(Employee employee) {
        if(employee!=null)
        {
            return employeeRepository.save(employee);
        }
        return null;
    }

    @Override
    public Employee updateEmployee(Integer id, Employee employee) {
        if (employee!=null)
        {
            Employee employee1 = employeeRepository.findById(id).get();
            employee1.setName(employee.getName());
            employee1.setAdd(employee.getAdd());
            return employeeRepository.save(employee1);
        }
        return null;
    }

    @Override
    public boolean deleteEmployee(Integer id) {
        Employee employee = employeeRepository.findById(id).get();
        if(employee!=null)
        {
            employeeRepository.delete(employee);
            return true;
        }
        return false;
    }

    @Override
    public List<Employee> getAllEmployee() {
        return (List<Employee>) employeeRepository.findAll();
    }

    @Override
    public Employee getEmployeeById(Integer id) {
        return employeeRepository.findById(id).get();
    }
}
