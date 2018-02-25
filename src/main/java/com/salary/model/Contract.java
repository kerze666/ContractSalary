package com.salary.model;

import java.time.Duration;
import java.time.LocalDate;

public abstract class Contract {

    protected LocalDate dateOfStartContract;

    protected Duration contracScope;

    protected double rate;

    public Contract(LocalDate dateOfStartContract, Duration contracScope, double rate) {
        this.dateOfStartContract = dateOfStartContract;
        this.contracScope = contracScope;
        this.rate = rate;
    }

    public LocalDate getDateOfStartContract() {
        return dateOfStartContract;
    }

    public void setDateOfStartContract(LocalDate dateOfStartContract) {
        this.dateOfStartContract = dateOfStartContract;
    }

    public Duration getContracScope() {
        return contracScope;
    }

    public void setContracScope(Duration contracScope) {
        this.contracScope = contracScope;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }
}
