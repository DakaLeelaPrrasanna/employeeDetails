package com.wipro.employeeDetails.repository;

import com.wipro.employeeDetails.model.EmployeeDetails;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<EmployeeDetails, String>{
}
