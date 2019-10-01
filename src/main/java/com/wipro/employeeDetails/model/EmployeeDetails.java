package com.wipro.employeeDetails.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
public class EmployeeDetails {

    @Id
    private String id;
    private String firstName;
    private String lastName;
    private String contactNumber;
    private String designation;
}
