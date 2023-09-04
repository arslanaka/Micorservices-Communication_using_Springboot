package com.example.demo.service;

import com.example.demo.dto.DepartmentDto;
import com.example.demo.entity.Department;

public interface DepartmentService {

    DepartmentDto saveDepartment(DepartmentDto departmentDto);


    DepartmentDto getDepartmentByCode(String code);


}
