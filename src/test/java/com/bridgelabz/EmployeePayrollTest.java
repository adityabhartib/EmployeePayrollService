package com.bridgelabz;

import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class EmployeePayrollTest {

    @Test
    public void givenThreeEmployee_WhenWritten_should_returnCount() throws IOException {
        Employee employee1 = new Employee(1, "Amit", 20000);
        Employee employee2 = new Employee(2, "Sumit", 24000);
        Employee employee3 = new Employee(3, "Aman", 25000);

        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(employee1);
        employeeList.add(employee2);
        employeeList.add(employee3);

        EmployeeService employeeService = new EmployeeService(employeeList);
        employeeService.writeEmployeeData(IOService.FILE_IO);
        employeeService.readEmployeeData(IOService.FILE_IO);
        long count = employeeService.countEmployeeEntries(IOService.FILE_IO);
        Assert.assertEquals(3,count);
    }
}
