package com.example.demo.service;


import com.example.demo.FeignConfig;
import com.example.demo.dto.DepartmentDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(url = "http://localhost:8085", value = "DEPARTMENT-SERVICE",configuration = FeignConfig.class)
public interface ApiClient {

    @GetMapping("api/departments/{department-code}")
    DepartmentDto getDepartment(@PathVariable("department-code") String departmentCode);

}
