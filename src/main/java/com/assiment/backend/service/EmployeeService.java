package com.assiment.backend.service;

import com.assiment.backend.bean.BaseResponse;
import com.assiment.backend.bean.Employee;
import com.assiment.backend.bean.req.EmployeeDelReq;
import com.assiment.backend.bean.req.EmployeeSearchReq;

public interface EmployeeService {

    BaseResponse getAllEmployees(EmployeeSearchReq req);

    BaseResponse saveOrUpdateEmployees(Employee employee);

    BaseResponse delEmployees(EmployeeDelReq req);

}
