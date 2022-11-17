package com.bridgelabz;

import java.io.IOException;
import java.util.List;

public interface ServiceType {
    public final String FILE_PATH="C:\\Users\\adity\\OneDrive\\Desktop\\EmployePayRoll\\src\\main\\java\\com\\bridgelabz\\Employee.txt";
    void writeData(List<Employee>employeeList) throws IOException;

    void readData() throws IOException;

    long countEntries() throws IOException;
}
