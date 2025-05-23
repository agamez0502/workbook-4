package com.pluralsight;

public class Room {

    //create the instance variables
    private int numberOfBeds;
    private double price;
    private boolean isOccupied;
    private boolean isDirty;

    //constructor to instantiate a room
    public Room(int numberOfBeds, double price, boolean isOccupied, boolean isDirty) {
        this.numberOfBeds = numberOfBeds;
        this.price = price;
        this.isOccupied = isOccupied;
        this.isDirty = isDirty;
    }

    //create derived methods

    //method to check if the room is available
    //based on if it is clean and occupied
    public boolean isAvailable() {
        return !this.isDirty() && !this.isOccupied();
        //another way to write this method
//        if(!this.isOccupied && !this.isDirty){
//            System.out.println("Is available");
//            return true;
//        }
//        System.out.println("Is not available");
//        return false;
    }

    //method to check in
    public void checkIn() {
        if (isAvailable()) {
            isOccupied = true;
            isDirty = true;
            System.out.println("Checked in");
            return; //stop here if successful - had trouble with this during testing
        }
        System.out.println("Error - couldn't check in");
    }

    //method to check out
    public void checkout() {
        if (isOccupied()) {
            isOccupied = false;
            System.out.println("Checked out");
            return; //stop here if successful - had trouble with this during testing
        }
        System.out.println("Error - couldn't check out");
    }

    //method to clean room
    public void cleanroom() {
        if (isDirty && !isOccupied) {
            isDirty = false;
            System.out.println("Room is clean now");
            return; //stop here if successful - had trouble with this during testing
        }
        System.out.println("Error - room couldn't be cleaned");
    }

    //create getters
    public int getNumberOfBeds() {
        return numberOfBeds;
    }

    public double getPrice() {
        return price;
    }

    public boolean isOccupied() {
        return isOccupied;
    }

    public boolean isDirty() {
        return isDirty;
    }
}
