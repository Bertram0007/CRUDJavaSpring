package com.assiment.backend.controller;

import com.assiment.backend.bean.BaseResponse;
import com.assiment.backend.bean.Employee;
import com.assiment.backend.bean.req.EmployeeDelReq;
import com.assiment.backend.bean.req.EmployeeSearchReq;
import com.assiment.backend.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/employee")
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;

    @RequestMapping(value = "/add",method = RequestMethod.POST,produces = {
            "application/json; charset=utf-8" })
    @ResponseBody
    public BaseResponse addEmployee(@RequestBody Employee employee){
        return employeeService.saveOrUpdateEmployees(employee);
    }

    @RequestMapping(value = "/update",method = RequestMethod.POST,produces = {
            "application/json; charset=utf-8" })
    @ResponseBody
    public BaseResponse updateEmployee(@RequestBody Employee employee){
        return employeeService.saveOrUpdateEmployees(employee);
    }

    @RequestMapping(value = "/remove",method = RequestMethod.POST,produces = {
            "application/json; charset=utf-8" })
    @ResponseBody
    public BaseResponse removeEmployee(@RequestBody EmployeeDelReq req){
        return employeeService.delEmployees(req);
    }

    @RequestMapping(value = "/list",method = RequestMethod.POST,produces = {
            "application/json; charset=utf-8" })
    @ResponseBody
    public BaseResponse getEmployees(@RequestBody EmployeeSearchReq req){
        return employeeService.getAllEmployees(req);
    }
    @RequestMapping(value = "/get",method = RequestMethod.GET)
    @ResponseBody
    public BaseResponse  getTest(){
        return BaseResponse.success(null);
    }
}
