package com.pluralsight;

public class Hotel {

    //create the instance variables
    private String name;
    private int numberOfSuites;
    private int numberOfRooms;
    private int bookedSuites;
    private int bookedBasicRooms;

    //constructor #1 to instantiate a hotel
    public Hotel(String name, int numberOfSuites, int numberOfRooms, int bookedSuites, int bookedBasicRooms) {
        this.name = name;
        this.numberOfSuites = numberOfSuites;
        this.numberOfRooms = numberOfRooms;
        this.bookedSuites = bookedSuites;
        this.bookedBasicRooms = bookedBasicRooms;
    }

    //constructor #2 to instantiate a hotel - where bookedSuites and bookedBasicRooms are set to 0
    public Hotel(String name, int numberOfSuites, int numberOfRooms) {
        this.name = name;
        this.numberOfSuites = numberOfSuites;
        this.numberOfRooms = numberOfRooms;
        this.bookedSuites = 0;
        this.bookedBasicRooms = 0;
    }

    //create derived methods

    //method to book rooms
    public boolean bookRoom(int numberOfRooms, boolean isSuite) {
        if (isSuite) {
            if (numberOfRooms <= getAvailableSuites()) {
                bookedSuites = bookedSuites + numberOfRooms; //or bookedSuites += numberOfRooms;
                System.out.println("Suite booked");
                return true;
            }
        } else {
            if (numberOfRooms <= getAvailableRooms()) {
                bookedBasicRooms = bookedBasicRooms + numberOfRooms; //or bookedBasicRooms += numberOfRooms;
                System.out.println("Room booked");
                return true;
            }
        }
        System.out.println("Error");
        return false;
    }

    //method to check available suites
    public int getAvailableSuites() {
        return numberOfSuites - bookedSuites;
    }

    //method to check available rooms
    public int getAvailableRooms() {
        return numberOfRooms - bookedBasicRooms;
    }
}
