package com.benefex.exam.controller;

import com.benefex.exam.CustomException;
import com.benefex.exam.model.EmployeePojo;
import com.benefex.exam.service.EmployeeService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/employee")
public class EmployeeController {

    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    /**
     * This method is used to add employee and will accept only unique emails
     * @param employeePojo
     * @return
     * @throws CustomException
     */
    @PostMapping
    public ResponseEntity<EmployeePojo> addEmployee(@RequestBody EmployeePojo employeePojo) throws CustomException {

        return ResponseEntity.ok(employeeService.addEmployee(employeePojo));
    }

    /**
     * this method is used to retrieve specific employee details using employee number
     * @param employeeNo
     * @return
     */
    @GetMapping("/employeeDetail")
    public ResponseEntity<EmployeePojo> getEmployeeDetails(@RequestParam Integer employeeNo){
        return ResponseEntity.ok(employeeService.getEmployeeDetail(employeeNo));
    }

    /**
     * this method will get all employees
     * @return
     */
    @GetMapping
    public ResponseEntity<List<EmployeePojo>> getAllEmployees(){
        return ResponseEntity.ok(employeeService.getAllEmployees());
    }
}
