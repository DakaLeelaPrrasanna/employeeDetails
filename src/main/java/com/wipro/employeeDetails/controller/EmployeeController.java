package com.wipro.employeeDetails.controller;

import com.wipro.employeeDetails.model.EmployeeDetails;
import com.wipro.employeeDetails.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/database")
public class EmployeeController {

    @Autowired
    private EmployeeRepository employeeRepository;

    @GetMapping("/getAllEmployees")
    public List<EmployeeDetails> retrieveAllEmployees(){
        return employeeRepository.findAll();
    }

    @GetMapping("/getOneEmployee/{id}")
    public EmployeeDetails retrieveEmployee(@PathVariable String id){
       return employeeRepository.findById(id).get();
    }

    @DeleteMapping("/deleteOneEmployee/{id}")
    public void deleteEmployee(@PathVariable String id){
        employeeRepository.deleteById(id);
    }

    @PostMapping("/createOneEmployee")
    public void createEmployee(@RequestBody EmployeeDetails employeeDetails){
        employeeRepository.save(employeeDetails);
    }

    @PutMapping("/updateOneEmployee")
    public void updateEmployee(@RequestBody EmployeeDetails employeeDetails){
        employeeRepository.save(employeeDetails);
    }

//    @Value("${message: Default hello}")
//    private String message;
//
//    @GetMapping("/message")
//    public String message(){
//        return message;
//    }

}
