package com.hr.personnel;

import org.assertj.core.api.Assertions;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.*;

public class EmployeeTest {

    private Employee employee;

    @Before
    public void setUp() throws Exception {
        // create test target object
        employee
                = new Employee("Jelani",
                LocalDate.of(2010, 04, 05));
    }

    @Test
    public void getEmployeeInfo_should_return_valid_employee_info_given_valid_employee_info() {

        // call test target method
        String employeeInfo = employee.getEmployeeInfo();

        // verify if the result is what is expected (assert)
        assertEquals("name = Jelani, hireDate = 2010-04-05",
                employeeInfo);
        Assertions.assertThat(employeeInfo).isEqualTo("name = Jelani, hireDate = 2010-04-05");
    }

    @Test
    public void work() {

        // call test target method
        String work = employee.work();

        // verify if the result is what is expected (assert)
        assertEquals("Jelani worked", work);
        Assertions.assertThat(work).isEqualTo("Jelani worked");
    }
}