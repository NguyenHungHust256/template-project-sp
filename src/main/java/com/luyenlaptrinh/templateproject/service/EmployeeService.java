package com.luyenlaptrinh.templateproject.service;

import com.luyenlaptrinh.templateproject.entities.Employee;
import com.luyenlaptrinh.templateproject.payload.request.CreateEmployeeReq;
import com.luyenlaptrinh.templateproject.payload.request.UpdateEmployeeReq;

import java.util.List;

/**
 * Create by
 *
 * @author : Nguyen Ba Hung
 * @since : 9/21/2022, Wed
 **/
public interface EmployeeService {
    List<Employee> getAll();
    Employee getByEmployeeId(Long employeeId);
    Employee create(CreateEmployeeReq req);
    Employee update(UpdateEmployeeReq req);
    void delete(Long employeeId);
}
