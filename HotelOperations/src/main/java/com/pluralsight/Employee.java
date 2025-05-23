package com.pluralsight;

import java.time.LocalDateTime;

public class Employee {

    //create the instance variables
    private int employeeID;
    private String name;
    private String department;
    private double payRate;
    private double hoursWorked;
    private double startTime;

    //constructor to instantiate an employee
    public Employee(int employeeID, String name, String department, double payRate, double hoursWorked) {
        this.employeeID = employeeID;
        this.name = name;
        this.department = department;
        this.payRate = payRate;
        this.hoursWorked = hoursWorked;
    }

    //create derived methods

    //method to check total pay
    public double getTotalPay() {
        if (hoursWorked <= 40) {
            return getRegularHours() * payRate;
        } else {
            return (40 * payRate) + getOvertimeHours() * (payRate * 1.5);
        }
    }

    //method to check regular hours
    public double getRegularHours() {
        if (hoursWorked <= 40) {
            return hoursWorked;
        }
        return 40;
    }

    //method to check overtime hours
    public double getOvertimeHours() {
        if (hoursWorked > 40) {
            return hoursWorked - 40;
        }
        return 0;
    }

    //method to punch in
    public void punchIn(double time) {
        startTime = time;
    }

    //overloaded method to punch in
    public void punchIn() {
        LocalDateTime now = LocalDateTime.now();
        double time = now.getHour() + (now.getMinute() / 60.0);
        punchIn(time);
    }

    //method to punch out
    public void punchOut(double time) {
        if (time > startTime) {
            hoursWorked += time - startTime;
        }
    }

    //overloaded method to punch out
    public void punchOut() {
        LocalDateTime now = LocalDateTime.now();
        double time = now.getHour() + (now.getMinute() / 60.0);
        punchOut(time);
    }

    //getters
    public double getHoursWorked() {
        return hoursWorked;
    }

    public double getStartTime() {
        return startTime;
    }
}
