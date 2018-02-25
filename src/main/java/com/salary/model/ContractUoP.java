package com.salary.model;

import java.time.Duration;
import java.time.LocalDate;

public class ContractUoP extends Contract {

    public ContractUoP(LocalDate dateOfStartContract, Duration contracScope, double rate) {
        super(dateOfStartContract, contracScope, rate);
    }

}
