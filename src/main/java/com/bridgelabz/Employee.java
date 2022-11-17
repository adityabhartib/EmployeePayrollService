package com.bridgelabz;

public class Employee {
    private final int id;
    private final String name;
    private final double salary;

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }

    public Employee(int id, String name, double salary){
        this.id=id;
        this.name=name;
        this.salary=salary;

    }
}
