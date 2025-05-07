package com.pluralsight;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HotelTest {

    //testing suites
    @Test
    public void bookRooom_should_increaseBookedSuites() {
        //arrange
        Hotel myHotel = new Hotel("Alondra's Resort", 10, 50);

        //act
        myHotel.bookRoom(3, true);

        //assert
        assertEquals(7, myHotel.getAvailableSuites());
    }

    //testing basic rooms
    @Test
    public void bookRooom_should_increaseBookedRooms() {
        //arrange
        Hotel myHotel = new Hotel("Alondra's Resort", 10, 50);

        //act
        myHotel.bookRoom(3, false);

        //assert
        assertEquals(47, myHotel.getAvailableRooms());
    }

    //testing if rooms are not available - returning false
    @Test
    public void bookRooom_should_returnFalseIfNoSuitesAvailable() {
        //arrange
        Hotel myHotel = new Hotel("Alondra's Resort", 10, 50);

        //act
        boolean success = myHotel.bookRoom(11, true);

        //assert
        assertFalse(success);
    }

    //testing if rooms are available - returning true
    @Test
    public void bookRooom_should_returnTrueIfNoSuitesAvailable() {
        //arrange
        Hotel myHotel = new Hotel("Alondra's Resort", 10, 50);

        //act
        boolean success = myHotel.bookRoom(9, true);

        //assert
        assertTrue(success);
    }

    //testing get name
    @Test
    public void getName_should_returnTheHotelName() {
        //arrange
        Hotel myHotel = new Hotel("Alondra's Resort", 10, 50);

        //act
        String hotelName = myHotel.getName();

        //assert
        assertEquals("Alondra's Resort", hotelName);
    }
}