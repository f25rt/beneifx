package com.benefex.exam.service;

import com.benefex.exam.entity.Employee;
import com.benefex.exam.mapper.EmployeeMapper;
import com.benefex.exam.model.EmployeePojo;
import com.benefex.exam.repository.EmployeeRespository;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl implements EmployeeService{

    private final EmployeeMapper employeeMapper;
    private final EmployeeRespository employeeRespository;

    public EmployeeServiceImpl(EmployeeMapper employeeMapper, EmployeeRespository employeeRespository) {
        this.employeeMapper = employeeMapper;
        this.employeeRespository = employeeRespository;
    }

    @Override
    public void addEmployee(EmployeePojo employeePojo) {
        Employee employee = employeeMapper.toEntity(employeePojo);

        employeeRespository.save(employee);
    }
}
