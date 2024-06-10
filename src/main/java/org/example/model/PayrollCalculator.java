package org.example.model;

import java.math.BigDecimal;

public class PayrollCalculator {

    public BigDecimal calculatePayroll(Employee employee, int hoursWorked) {
        return employee.getHourlySalary().multiply(BigDecimal.valueOf(hoursWorked));
    }
}
