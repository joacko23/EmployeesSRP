package org.example;

import org.example.controller.EmployeeController;
import org.example.model.Employee;

import java.math.BigDecimal;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        EmployeeController employeeController = new EmployeeController();

        // Ingresar los datos del empleado
        System.out.println("Ingrese el nombre del empleado:");
        String name = scanner.nextLine();

        System.out.println("Ingrese el puesto del empleado:");
        String position = scanner.nextLine();

        System.out.println("Ingrese el salario por hora del empleado:");
        BigDecimal hourlySalary = scanner.nextBigDecimal();

        // Crear el empleado
        Employee employee = employeeController.createEmployee(name, position, hourlySalary);

        // Ingresar las horas trabajadas
        System.out.println("Ingrese las horas trabajadas en el mes:");
        int hoursWorked = scanner.nextInt();

        // Calcular la nómina
        BigDecimal payroll = employeeController.calculatePayroll(employee, hoursWorked);
        System.out.println("Sueldo para " + employee.getName() + ": " + payroll);

        // Limpiar el buffer del scanner
        scanner.nextLine();

        // Ingresar el correo electrónico para enviar el informe
        System.out.println("Ingrese el correo electrónico del empleado:");
        String email = scanner.nextLine();

        // Enviar el informe de nómina por correo electrónico
        employeeController.sendPayrollReport(employee, hoursWorked, email);

        scanner.close();
    }

}
