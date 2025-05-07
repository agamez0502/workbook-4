package com.pluralsight;

public class TheApp {

    public static void main(String[] args) {

//        //test our room
//        Room room1 = new Room(2, 139.00, false, false);
//        Room room2 = new Room(2, 139.00, true, true);
//
//        //room one should be available because it is not dirty and is not occupied
//        System.out.println("Is room1 available: " + room1.isAvailable());
//
//        //room two should not be available because it is dirty and is occupied
//        System.out.println("Is room2 available: " + room2.isAvailable());
//
//         //create a new room
//        Room room3 = new Room(1,139.00, false, false);
//
//        //check in
//        room3.checkIn();
//
//        //check out
//        room3.checkout();
//
//        //try to check in again
//        room3.checkIn();
//
//        //clean room
//        room3.cleanroom();
//
//        //try to check in again
//        room3.checkIn();

        //------------------------------------------------------------------------------------------------------------
//        //test our reservation
//        Reservation kingWknd = new Reservation("king", 2, true);
//        Reservation kingNotWknd = new Reservation("king", 2, false);
//        Reservation doubleWknd = new Reservation("double", 2, true);
//        Reservation doubleNotWknd = new Reservation("double", 2, false);
//
//        //king weekend 152.90
//        System.out.println("Total price for your stay is: " + kingWknd.getReservationTotal());
//        System.out.println("Price: " + kingWknd.getPrice());
//
//        //king not weekend 139.00
//        System.out.println("\nTotal price for your stay is: " + kingNotWknd.getReservationTotal());
//        System.out.println("Price: " + kingNotWknd.getPrice());
//
//        //double weekend 136.40
//        System.out.println("\nTotal price for your stay is: " + doubleWknd.getReservationTotal());
//        System.out.println("Price: " + doubleWknd.getPrice());
//
//        //double not weekend 124.00
//        System.out.println("\nTotal price for your stay is: " + doubleNotWknd.getReservationTotal());
//        System.out.println("Price: " + doubleNotWknd.getPrice());

        //------------------------------------------------------------------------------------------------------------
//        //test our employee
//        Employee reg1 = new Employee(1, "Melissa", "HR", 30, 35);
//        Employee ot1 = new Employee(2, "John", "Management", 20, 60);
//
//        //regular hours
//        System.out.println("\nNumber of regular hours: " + reg1.getRegularHours());
//        System.out.println("Number of OT hours: " + reg1.getOvertimeHours());
//        System.out.println("Total pay for this pay period: " + reg1.getTotalPay());
//
//        //overtime hours
//        System.out.println("\nNumber of regular hours: " + ot1.getRegularHours());
//        System.out.println("Number of OT hours: " + ot1.getOvertimeHours());
//        System.out.println("Total pay for this pay period is: " + ot1.getTotalPay());
//
//        //create a new employee
//        Employee e1 = new Employee(3, "Alondra", "CEO", 100, 0);
//
//        //punch in and punch out
//        e1.punchIn(8.0); //8am
//        e1.punchOut(16.0); //4pm
//
//        //checking to see if punch in and out method work
//        System.out.println("Total hours worked: " + e1.getHoursWorked());
//
//        //overloaded method punch in and out
//        e1.punchIn();
//        try {
//            Thread.sleep(5000);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
//        e1.punchOut();
//
//        //checking to see if overloaded punch in and out method work
//        System.out.println("Total hours worked: " + e1.getHoursWorked());

        //------------------------------------------------------------------------------------------------------------
        //test our hotel
        Hotel fancy = new Hotel("Hilton", 10, 20, 5, 10);
        Hotel budget = new Hotel("Holiday Inn", 10, 20);

        //checking available suites/rooms for fancy
        System.out.println("Number of available suites: " + fancy.getAvailableSuites());
        System.out.println("Number of available rooms: " + fancy.getAvailableRooms());

        //checking available suites/rooms for budget
        System.out.println("\nNumber of available suites: " + budget.getAvailableSuites());
        System.out.println("Number of available rooms: " + budget.getAvailableRooms());

        //book rooms
        boolean booking1 = fancy.bookRoom(1, true); //booking 1 suite
        boolean booking2 = fancy.bookRoom(1, false); //booking 1 basic room
        boolean booking3 = budget.bookRoom(1, true); //booking 1 suite
        boolean booking4 = budget.bookRoom(1, false); //booking 1 basic room

        //checking to see if bookRoom method works for fancy
        System.out.println("\nNumber of available suites: " + fancy.getAvailableSuites());
        System.out.println("Number of available rooms: " + fancy.getAvailableRooms());

        //checking to see if bookRoom method works for budget
        System.out.println("\nNumber of available suites: " + budget.getAvailableSuites());
        System.out.println("Number of available rooms: " + budget.getAvailableRooms());
    }
}
