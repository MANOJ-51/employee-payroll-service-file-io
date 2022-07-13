package com.bridgelabz;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
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

    public static void main(String[] args) throws Exception {
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
    public void readEmployeePayrollData(Scanner scannerUserInput) throws Exception {
        System.out.println("Welcome to the Employee Payroll Service ");
        System.out.println("Enter the Id of the Employee");
        int employeeId = scannerUserInput.nextInt();
        System.out.println("Enter the Name of the Employee");
        String employeeName = scannerUserInput.next();
        System.out.println("Enter the Salary of the Employee ");
        double employeeSalary = scannerUserInput.nextDouble();
        //adding input the list
        employeePayrollDataList.add(new EmployeePayrollData(employeeId, employeeName, employeeSalary));

        //adding employee pay role data into the text file
        EmployeePayrollData employeePayrollData = new EmployeePayrollData();
        employeePayrollData.setEmployeeId(employeeId);
        employeePayrollData.setEmployeeName(employeeName);
        employeePayrollData.setEmployeeSalary(employeeSalary);

        //employeePayrollData to string result is stored in a string
        String employeePayrollDataString = employeePayrollData.toString();
        //converting into bytes
        byte[] employeePayrollByteArray = employeePayrollDataString.getBytes();
        //setting path
        Path path = Paths.get("src/employeePayrollDataFileIO.txt");
        //writing into the txt file
        Files.write(path, employeePayrollByteArray);

    }

    //printing the input writing
    public void writeEmployeePayrollData() {
        System.out.println("Writing Employee Payroll into console : " + employeePayrollDataList);
    }
}
