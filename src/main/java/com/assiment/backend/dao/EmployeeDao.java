package com.assiment.backend.dao;

import com.assiment.backend.bean.Employee;
import com.assiment.backend.bean.req.EmployeeSearchReq;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeDao {

    int addEmployee(Employee employee);

    int updateEmployee(Employee employee);

    int deleteById(List<Long> ids);

    List<Employee> queryEmployees(EmployeeSearchReq req);
}
