package com.example.gradleproject.Controllers;

import com.example.gradleproject.Employee;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

public class EmployeeMapper {
    public static Employee getEmployee() throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        return objectMapper.readValue(new File("./src/main/resources/employee.json"), Employee.class);
    }
}
