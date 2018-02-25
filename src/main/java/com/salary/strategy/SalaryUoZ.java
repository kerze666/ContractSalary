package com.salary.strategy;

import com.salary.exception.WorkIncompleteException;
import com.salary.model.ContractUoZ;
import com.salary.model.Employee;

public class SalaryUoZ implements Salary {

    private Employee employee;

    public SalaryUoZ(Employee employee) {
        this.employee = employee;
    }

    public double count() {
        ContractUoZ contractUoZ = (ContractUoZ) employee.getContract();
        if (contractUoZ.isDone()){
            return contractUoZ.getRate();
        }else {
            throw new WorkIncompleteException();
        }
    }
}
