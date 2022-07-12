package com.bridgelabz;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeePayrollService {

    //creating list of data
    private List<EmployeePayrollData> employeePayrollDataList;

    //creating parameterized constructor
    public EmployeePayrollService(List<EmployeePayrollData> employeePayrollDataList) {
        this.employeePayrollDataList = employeePayrollDataList;
    }

    public static void main(String[] args) {
        System.out.println("Welcome to Employee Payroll Service ");
        //creating array list of the payroll data
        ArrayList<EmployeePayrollData> employeePayrollDataArrayList = new ArrayList<>();
        //object of class
        EmployeePayrollService employeePayrollService = new EmployeePayrollService(employeePayrollDataArrayList);
        Scanner userInputReader = new Scanner(System.in);
        //calling read and write
        employeePayrollService.readEmployeePayrollData(userInputReader);
        employeePayrollService.writeEmployeePayrollData();
    }

    //taking input from the user reading
    public void readEmployeePayrollData(Scanner scannerUserInput) {
        System.out.println("Enter the Id of the Employee");
        int employeeId = scannerUserInput.nextInt();
        System.out.println("Enter the Name of the Employee");
        String employeeName = scannerUserInput.next();
        System.out.println("Enter the Salary of the Employee ");
        double employeeSalary = scannerUserInput.nextDouble();
        //adding input the list
        employeePayrollDataList.add(new EmployeePayrollData(employeeId, employeeName, employeeSalary));
    }

    //printing the input writing
    public void writeEmployeePayrollData() {
        System.out.println("Writing Employee Payroll into console : " + employeePayrollDataList);
    }
}
