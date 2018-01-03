package com.example.gradleproject.Controllers;

import com.example.gradleproject.Employee;
import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.http.HttpHeaders;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
public class SimpleController {
    @GetMapping(value = "/hello")
    public String sayHello(){
        return "Hello World!";
    }

    @RequestMapping(value = "/getEmployee", method = RequestMethod.GET, produces = "application/json")
    public Employee getResponse() throws JSONException, IOException {
        return EmployeeMapper.getEmployee();
    }
}
