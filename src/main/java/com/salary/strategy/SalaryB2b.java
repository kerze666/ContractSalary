package com.salary.strategy;

import com.salary.model.ContractB2b;
import com.salary.model.Employee;

public class SalaryB2b implements Salary {

    private Employee employee;

    public SalaryB2b(Employee employee) {
        this.employee = employee;
    }

    public double count() {
        ContractB2b contract = (ContractB2b) employee.getContract();
        return contract.getHours()*contract.getRate();
    }
}
