package com.salary.strategy;

import com.salary.model.Employee;

public class SalaryUoP implements Salary {

    private Employee employee;

    public SalaryUoP(Employee employee) {
        this.employee = employee;
    }

    public double count() {
        return employee.getContract().getRate();
    }
}
