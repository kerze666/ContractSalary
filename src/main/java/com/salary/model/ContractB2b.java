package com.salary.model;

import java.time.Duration;
import java.time.LocalDate;

public class ContractB2b extends Contract {

    private int hours;

    public ContractB2b(LocalDate dateOfStartContract, Duration contracScope, double rate, int hours) {
        super(dateOfStartContract, contracScope, rate);
        this.hours = hours;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }
}
