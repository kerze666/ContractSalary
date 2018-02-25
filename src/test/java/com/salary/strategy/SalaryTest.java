package com.salary.strategy;

import com.salary.exception.WorkIncompleteException;
import com.salary.model.*;
import org.junit.Test;

import java.time.Duration;
import java.time.LocalDate;

import static org.junit.Assert.*;

public class SalaryTest {

    private Salary salaryStrategy;

    @Test
    public void shouldCountContractB2b() throws Exception {
        //given
        Contract contract = new ContractB2b(LocalDate.parse("2018-01-01"), Duration.ofDays(500),10, 10);
        Employee employee = new Employee("Hubi bubi", contract);
        salaryStrategy = new SalaryB2b(employee);

        //when
        double result = SalaryContextCounter.countSalary(salaryStrategy);

        //then
        assertTrue(result == 100);
    }

    @Test
    public void shouldCountContractUoP() throws Exception {
        //given
        Contract contract = new ContractUoP(LocalDate.parse("2018-01-01"), Duration.ofDays(500),1000);
        Employee employee = new Employee("Hubi bubi", contract);
        salaryStrategy = new SalaryUoP(employee);

        //when
        double result = SalaryContextCounter.countSalary(salaryStrategy);

        //then
        assertTrue(result == 1000);
    }

    @Test
    public void shouldCountContractUoZ() throws Exception {
        //given
        Contract contract = new ContractUoZ(LocalDate.parse("2018-01-01"), Duration.ofDays(500),1000, true);
        Employee employee = new Employee("Hubi bubi", contract);
        salaryStrategy = new SalaryUoZ(employee);

        //when
        double result = SalaryContextCounter.countSalary(salaryStrategy);

        //then
        assertTrue(result == 1000);
    }

    @Test(expected = WorkIncompleteException.class)
    public void shouldThrowWorkIncompleteExceptionWhenWorkIsntDone () throws Exception {
        //given
        Contract contract = new ContractUoZ(LocalDate.parse("2018-01-01"), Duration.ofDays(500),1000, false);
        Employee employee = new Employee("Hubi bubi", contract);
        salaryStrategy = new SalaryUoZ(employee);

        //when
        double result = SalaryContextCounter.countSalary(salaryStrategy);

        //then
        assertNull(result);
    }

}