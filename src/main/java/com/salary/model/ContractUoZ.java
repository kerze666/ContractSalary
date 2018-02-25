package com.salary.model;

import java.time.Duration;
import java.time.LocalDate;

public class ContractUoZ extends Contract {

    private boolean isDone;

    public ContractUoZ(LocalDate dateOfStartContract, Duration contracScope, double rate, boolean isDone) {
        super(dateOfStartContract, contracScope, rate);
        this.isDone = isDone;
    }

    public boolean isDone() {
        return isDone;
    }

    public void setDone(boolean done) {
        isDone = done;
    }
}
