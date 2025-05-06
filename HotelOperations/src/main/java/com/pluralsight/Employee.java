package com.pluralsight;

public class Employee {

    //create the instance variables
    private int employeeID;
    private String name;
    private String department;
    private double payRate;
    private double hoursWorked;

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
    public double getTotalPay(){
        if(hoursWorked <= 40){
            return getRegularHours() * payRate;
        } else {
            return (40 * payRate) + getOvertimeHours() * (payRate * 1.5);
        }
    }

    //method to check regular hours
    public double getRegularHours(){
        if(hoursWorked <= 40){
            return hoursWorked;
        }
        return 40;
    }

    //method to check overtime hours
    public double getOvertimeHours(){
        if(hoursWorked > 40){
            return hoursWorked - 40;
        }
        return 0;
    }
}
