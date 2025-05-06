package com.pluralsight;

public class Reservation {

    //create the instance variables
    private String roomType;
    private int numberOfNights;
    private boolean isWeekend;

    //constructor to instantiate a reservation
    public Reservation(String roomType, int numberOfNights, boolean isWeekend) {
        this.roomType = roomType;
        this.numberOfNights = numberOfNights;
        this.isWeekend = isWeekend;
    }

    //create derived methods

    //method to check price
    public double getPrice() {
        if (roomType.equalsIgnoreCase("king") && isWeekend) {
            return (139.00 * 0.10) + 139.00;
        } else if (roomType.equalsIgnoreCase("king")){
            return 139.00;
        } else if(roomType.equalsIgnoreCase("double") && isWeekend){
            return (124.00 * 0.10) + 124.00;
        } else if (roomType.equalsIgnoreCase("double")){
            return 124.00;
        }
        return 0;
    }

    //method to check reservation total
    public double getReservationTotal() {
        return numberOfNights * getPrice();
    }

    //create getters and setters
    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public int getNumberOfNights() {
        return numberOfNights;
    }

    public void setNumberOfNights(int numberOfNights) {
        this.numberOfNights = numberOfNights;
    }

    public boolean isWeekend() {
        return isWeekend;
    }

    public void setWeekend(boolean weekend) {
        isWeekend = weekend;
    }
}
