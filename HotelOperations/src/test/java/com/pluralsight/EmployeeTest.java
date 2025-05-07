package com.pluralsight;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeTest {

    //testing punch in and out
    @Test
    public void punchIn_should_returnStartTime() {
        //arrange
        Employee me = new Employee(1, "Alondra", "CEO", 100, 0);

        //act
        me.punchIn();

        //assert
        assertTrue(me.getStartTime() > 0, "Hours should be more than 0");
    }

    //testing punch in and out - add hours to hoursWorked
    @Test
    public void punchInAndOut_should_returnHoursWorked() {
        //arrange
        Employee me = new Employee(1, "Alondra", "CEO", 100, 50);

        //act
        me.punchIn(10);
        me.punchOut(18);

        double myHours = me.getHoursWorked();

        //assert
        assertEquals(58, myHours);
    }
}