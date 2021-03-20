package com.employee.employeelist.service;

import com.employee.employeelist.domain.Employee;
import com.employee.employeelist.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class EmployeeService {
    @Autowired
    EmployeeRepository employeeRepository;

    public Employee findEmployeeById(Long id) {
        return employeeRepository.findEmployeeById(id);
    };

    public List<Employee> listEmployees(){
        return employeeRepository.findAll();
    }
}
