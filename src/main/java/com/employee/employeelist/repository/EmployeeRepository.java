package com.employee.employeelist.repository;

import com.employee.employeelist.domain.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    @Query("select e from Employee e where e.id = :id")
    public Employee findEmployeeById(@Param("id") Long employeeId);
}
