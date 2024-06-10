package org.example.model;

import java.math.BigDecimal;

public class Employee {
    public String Name;
    public String Position;
    public BigDecimal HourlySalary;

    public Employee() {
    }

    public Employee(String name, String position, BigDecimal hourlySalary) {
        Name = name;
        Position = position;
        HourlySalary = hourlySalary;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getPosition() {
        return Position;
    }

    public void setPosition(String position) {
        Position = position;
    }

    public BigDecimal getHourlySalary() {
        return HourlySalary;
    }

    public void setHourlySalary(BigDecimal hourlySalary) {
        HourlySalary = hourlySalary;
    }
}
