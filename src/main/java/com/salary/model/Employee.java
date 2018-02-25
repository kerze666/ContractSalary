package com.salary.model;

public class Employee {

    private String name;

    private Contract contract;

    public Employee(String name, Contract contract) {
        this.name = name;
        this.contract = contract;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Contract getContract() {
        return contract;
    }

    public void setContract(Contract contract) {
        this.contract = contract;
    }
}
