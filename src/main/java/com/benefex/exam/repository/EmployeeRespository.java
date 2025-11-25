package com.benefex.exam.repository;

import com.benefex.exam.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRespository extends JpaRepository<Employee,Long> {


}
