package com.bridgelabz;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class DatabaseIOServiceImpl implements ServiceType {
    @Override
    public void writeData(List<Employee> employeeList) {

    }

    @Override
    public void readData() {

    }

    @Override
    public long countEntries() throws IOException {
        return Files.lines(Path.of(FILE_PATH)).count();
    }
}
