package com.pluralsight;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RoomTest {

    //testing check in - if room is occupied and dirty
    @Test
    public void checkIn_should_setRoomToNotAvailableAndOccupied() {
        //arrange
        Room room1 = new Room(10, 139.00, true, true);

        //act
        room1.checkIn();

        //assert
        //don't use true or false inside
        assertFalse(room1.isAvailable()); //not available - shouldn't be able to check in
        assertTrue(room1.isDirty()); //should be dirty
    }

    //testing check out - if room is occupied and dirty
    @Test
    public void checkout_should_setRoomToAvailableAndDirty() {
        //arrange
        Room room1 = new Room(10, 139.00, true, true);

        //act
        room1.checkout();

        //assert
        assertFalse(room1.isAvailable()); //not available - since still dirty, therefore can't check in
        assertFalse(room1.isOccupied()); //isn't occupied
        assertTrue(room1.isDirty()); //should be dirty
    }

    //testing clean room - if room is occupied and dirty
    @Test
    public void cleanroom_should_notCleanRoomIfOccupiedAndDirty() {
        //arrange
        Room room1 = new Room(10, 139.00, true, true);

        //act
        room1.cleanroom();

        //assert
        assertTrue(room1.isDirty()); //is dirty still - since is occupied we can't clean
        assertTrue(room1.isOccupied()); //is occupied
    }

    //testing clean room - if room is not occupied but is dirty
    @Test
    public void cleanroom_should_cleanRoomIfNotOccupiedAndDirty() {
        //arrange
        Room room1 = new Room(10, 139.00, false, true);

        //act
        room1.cleanroom();

        //assert
        assertFalse(room1.isDirty()); //is clean now -  since it is not occupied anymore
        assertFalse(room1.isOccupied()); //is not occupied anymore
    }
}