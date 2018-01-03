package com.example.gradleproject;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.Map;

@Getter
@Setter
@AllArgsConstructor
public class Employee {
        private int id;
        private String name;
        private int age;
        private BigDecimal salary;
        private String designation;
        private long[] phoneNumbers;
        private Map<String, String> personalInformation;
}
