package com.bridgelabz;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

import static com.bridgelabz.ServiceType.FILE_PATH;

public class EmployeeService {
    private final List<Employee> employeelist;
    private IOService ioType;

    public EmployeeService(List<Employee> employeeList) {
       this.employeelist=employeeList;
    }

    public void writeEmployeeData(IOService fileIo) throws IOException {
        ServiceType serviceType;
        if (IOService.FILE_IO.equals(ioType)) {
            serviceType=new FileIOServiceImpl();
        }else if(IOService.CONSOLE_IO.equals(ioType)){
            serviceType=new ConsoleIOServiceimpl();
        }else {
            serviceType= new DatabaseIOServiceImpl();
        }
        serviceType.writeData(employeelist);
    }

    public void readEmployeeData(IOService ioType) throws IOException {
        ServiceType serviceType;
        if (IOService.FILE_IO.equals(ioType)) {
            serviceType=new FileIOServiceImpl();
        }else if(IOService.CONSOLE_IO.equals(ioType)){
            serviceType=new ConsoleIOServiceimpl();
        }else {
            serviceType= new DatabaseIOServiceImpl();
        }
        serviceType.readData();
    }

    public long countEmployeeEntries(IOService ioType) throws IOException {
        ServiceType serviceType;
        if (IOService.FILE_IO.equals(ioType)) {
            serviceType = new FileIOServiceImpl();
        } else if (IOService.CONSOLE_IO.equals(ioType)) {
            serviceType = new ConsoleIOServiceimpl();
        } else {
            serviceType = new DatabaseIOServiceImpl();
        }
        try {
            return serviceType.countEntries();
        } catch (IOException e) {
            System.out.println("Catch Block");;
        }
        return Files.lines(Path.of(FILE_PATH)).count();
    }
}
