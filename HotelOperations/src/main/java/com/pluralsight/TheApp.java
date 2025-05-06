package com.pluralsight;

public class TheApp {

    public static void main(String[] args) {

        //test our room
        Room room1 = new Room(2, 139.00, false, false);
        Room room2 = new Room(2, 139.00, true, true);

        //room one should be available because it is not dirty and is not occupied
        System.out.println("Is room1 available: " + room1.isAvailable());

        //room two should not be available because it is dirty and is occupied
        System.out.println("Is room2 available: " + room2.isAvailable());

        //test our reservation
        Reservation kingWknd = new Reservation("king", 2, true);
        Reservation kingNotWknd = new Reservation("king", 2, false);
        Reservation doubleWknd = new Reservation("double", 2, true);
        Reservation doubleNotWknd = new Reservation("double", 2, false);

        //king weekend 152.90
        System.out.println("Total price for your stay is: " + kingWknd.getReservationTotal());
        System.out.println("Price: " + kingWknd.getPrice());

        //king not weekend 139.00
        System.out.println("\nTotal price for your stay is: " + kingNotWknd.getReservationTotal());
        System.out.println("Price: " + kingNotWknd.getPrice());

        //double weekend 136.40
        System.out.println("\nTotal price for your stay is: " + doubleWknd.getReservationTotal());
        System.out.println("Price: " + doubleWknd.getPrice());

        //double not weekend 124.00
        System.out.println("\nTotal price for your stay is: " + doubleNotWknd.getReservationTotal());
        System.out.println("Price: " + doubleNotWknd.getPrice());

        //test our employee
        Employee reg1 = new Employee(1,"Melissa", "HR", 30, 35);
        Employee ot1 = new Employee(2, "John", "Management",20, 60);

        //regular hours
        System.out.println("\nNumber of regular hours: " + reg1.getRegularHours());
        System.out.println("Number of OT hours: " + reg1.getOvertimeHours());
        System.out.println("Total pay for this pay period: " + reg1.getTotalPay());

        //overtime hours
        System.out.println("\nNumber of regular hours: " + ot1.getRegularHours());
        System.out.println("Number of OT hours: " + ot1.getOvertimeHours());
        System.out.println("Total pay for this pay period is: " + ot1.getTotalPay());
    }
}
