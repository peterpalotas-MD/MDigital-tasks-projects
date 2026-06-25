package parkingCharges;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static parkingCharges.parkingCharges.costOfParking;

class parkingChargesTest {

    @Test
    void givenAStartTimeAndDurationOnSameDay_ShouldReturnTheCorrectCost(){
        //Arrange
        int startHour = 3;
        int durationHours = 5;
        int expectedCost = 1650;
        //Act
        int actualCost = costOfParking(startHour,durationHours);

        //Assert

        assertEquals(expectedCost,actualCost);
    }

    @Test
    void givenAStartTimeAndDurationGoingToNew_ShouldReturnTheCorrectCost(){
        //Arrange
        int startHour = 23;
        int durationHours = 2;
        int expectedCost = 700;
        //Act
        int actualCost = costOfParking(startHour,durationHours);

        //Assert

        assertEquals(expectedCost,actualCost);
    }

    @Test
    void givenAStartTimeAndDurationOnSameDayWhereTheStartTimeIsAbnormal_ShouldReturnTheCorrectCost(){
        //Arrange
        int startHour = 27;
        int durationHours = 5;
        int expectedCost = 1650;
        //Act
        int actualCost = costOfParking(startHour,durationHours);

        //Assert

        assertEquals(expectedCost,actualCost);
    }


}