package org.example.controller;

import org.example.model.EmailService;
import org.example.model.Employee;
import org.example.model.PayrollCalculator;

import java.math.BigDecimal;

public class EmployeeController {

    private PayrollCalculator payrollCalculator;
    private EmailService emailService;

    public EmployeeController() {
        this.payrollCalculator = new PayrollCalculator();
        this.emailService = new EmailService();
    }

    public Employee createEmployee(String name, String position, BigDecimal hourlySalary) {
        return new Employee(name, position, hourlySalary);
    }

    public BigDecimal calculatePayroll(Employee employee, int hoursWorked) {
        return payrollCalculator.calculatePayroll(employee, hoursWorked);
    }

    public void sendPayrollReport(Employee employee, int hoursWorked, String email) {
        BigDecimal payroll = calculatePayroll(employee, hoursWorked);
        String subject = "Informe de Sueldo";
        String message = String.format("Estimado %s,\n\nSu sueldo para este mes es: %s.", employee.getName(), payroll);
        emailService.sendEmail(email, subject, message);
    }
}
