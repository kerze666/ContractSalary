package com.salary;

import com.salary.model.*;
import com.salary.strategy.*;

import java.time.Duration;
import java.time.LocalDate;

public class App {
    public static void main(String[] args) {
        Contract contractB2b = new ContractB2b(LocalDate.parse("2018-01-01"), Duration.ofDays(500),13.5, 30);
        Contract contractUoP = new ContractUoP(LocalDate.parse("2018-01-01"), Duration.ofDays(500),3000.00);
        Contract contractUoZ = new ContractUoZ(LocalDate.parse("2018-01-01"), Duration.ofDays(500),4000.00, true);

        Employee employee = new Employee("Hubi bubi", contractB2b);
        Salary salaryB2b = new SalaryB2b(employee);
        Salary salaryUoP = new SalaryUoP(employee);
        Salary salaryUoZ = new SalaryUoZ(employee);


        System.out.println(String.format("Salary B2B : %s",SalaryContextCounter.countSalary(salaryB2b)));
        employee.setContract(contractUoP);
        System.out.println(String.format("Salary UoP : %s",SalaryContextCounter.countSalary(salaryUoP)));
        employee.setContract(contractUoZ);
        System.out.println(String.format("Salary UoZ : %s",SalaryContextCounter.countSalary(salaryUoZ)));

    }
}
