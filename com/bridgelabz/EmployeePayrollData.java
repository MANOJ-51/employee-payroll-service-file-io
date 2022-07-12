package com.bridgelabz;

public class EmployeePayrollData {
    //creating employee id name salary
    int employeeId;
    String employeeName;
    double employeeSalary;

    //initialising constructors for the data
    public EmployeePayrollData(int employeeId, String employeeName, double employeeSalary) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.employeeSalary = employeeSalary;
    }

    //override to string method to print
    @Override
    public String toString() {
        return "EmployeePayrollData{" +
                "employeeId=" + employeeId +
                ", employeeName='" + employeeName + '\'' +
                ", employeeSalary=" + employeeSalary +
                '}';
    }
}
