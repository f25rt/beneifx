package com.benefex.exam.mapper;

import com.benefex.exam.entity.Employee;
import com.benefex.exam.model.EmployeePojo;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface EmployeeMapper {

    Employee toEntity(EmployeePojo dto);

    EmployeePojo toDto(Employee entity);
}
