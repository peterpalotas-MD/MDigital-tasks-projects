package Tasks;

import org.junit.jupiter.api.Test;

import static Tasks.bouncingBall.ballBounce;
import static org.junit.jupiter.api.Assertions.*;

class bouncingBallTest {

    @Test
    void givenAcceptableConditions_ShouldReturnCorrectNumberOfBounces() {

        //Arrange
        double height = 1.5;
        double bounce = 0.66;
        double window = 1.5;
        int expectedObservations=1;

        //Act
        int actualObservations = ballBounce(1.5, 0.66, 1.5);

        //Assert
        assertEquals(expectedObservations, actualObservations);

    }

    @Test
    void givenThatTheHeightIsBelowTheWindow_ShouldReturnErrorCode() {

        //Arrange
        double height = 1;
        double bounce = 0.66;
        double window = -1;
        int expectedObservations=1;

        //Act
        int actualObservations = ballBounce(1.5, 0.66, 1.5);

        //Assert
        assertEquals(expectedObservations, actualObservations);

    }



}