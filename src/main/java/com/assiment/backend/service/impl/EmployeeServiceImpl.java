package com.assiment.backend.service.impl;

import com.assiment.backend.bean.BaseResponse;
import com.assiment.backend.bean.Employee;
import com.assiment.backend.bean.req.EmployeeDelReq;
import com.assiment.backend.bean.req.EmployeeSearchReq;
import com.assiment.backend.dao.EmployeeDao;
import com.assiment.backend.service.EmployeeService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    @Autowired
    private EmployeeDao employeeDao;

    public BaseResponse getAllEmployees(EmployeeSearchReq req) {
        PageHelper.startPage(req.getPageNum(),req.getPageSize());
        List<Employee> employees=employeeDao.queryEmployees(req);
        return BaseResponse.success(new PageInfo<Employee>(employees));
    }

    public BaseResponse saveOrUpdateEmployees(Employee employee) {
        if(employee.getId()==null){
            employeeDao.addEmployee(employee);
        }else{
            employeeDao.updateEmployee(employee);
        }
        return BaseResponse.success(null);
    }

    public BaseResponse delEmployees(EmployeeDelReq req) {
        if(CollectionUtils.isEmpty(req.getIds())){
            return BaseResponse.success(null);
        }
        employeeDao.deleteById(req.getIds());
        return BaseResponse.success(null);
    }
}
