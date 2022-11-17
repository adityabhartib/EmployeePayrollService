package com.bridgelabz;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class FileIOServiceImpl implements ServiceType {

    public final String FILE_PATH="C:\\Users\\adity\\OneDrive\\Desktop\\EmployePayRoll\\src\\main\\java\\com\\bridgelabz\\Employee.txt";
    @Override
    public void writeData(List<Employee> employeeList) throws IOException {
        StringBuffer stringBuffer=new StringBuffer();
        employeeList.forEach(employee -> {
            String employeeString=employee.toString().concat("\n");
            stringBuffer.append(employeeString);
        });
        Files.write(Path.of(FILE_PATH),stringBuffer.toString().getBytes());
    }

    @Override
    public void readData() throws IOException {
        Files.lines(Path.of(FILE_PATH)).forEach(employee->{
            System.out.println(employee);
        });
    }

    @Override
    public long countEntries() throws IOException {
        return Files.lines(Path.of(FILE_PATH)).count();

    }
}
