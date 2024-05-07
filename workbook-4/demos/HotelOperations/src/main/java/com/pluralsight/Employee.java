package com.pluralsight;



public class Employee {
    private final String employeeId;
    private final String name;
    private final String department;
    private final double payRate;
    private double hoursWorked;
    private double startTime;

    public Employee(String employeeId, String name, String department, double payRate, int hoursWorked) {
        this.employeeId = employeeId;
        this.name = name;
        this.department = department;
        this.payRate = payRate;
        this.hoursWorked = hoursWorked;
        this.startTime = 0;
    }

    public void punchIn(double time) {
        this.startTime = time;
    }

    public void punchOut(double time) {
        double hoursThisPeriod = time - this.startTime;
        this.hoursWorked += hoursThisPeriod;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public double getRegularHours() {
        return Math.min(hoursWorked, 40);
    }

    public double getOvertimeHours() {
        return Math.max(hoursWorked - 40, 0);
    }

    public double getTotalPay() {
        return getRegularHours() * payRate + getOvertimeHours() * payRate * 1.5;
    }
}