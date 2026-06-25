import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class fizzBuzzTest {
    @Test
    void givenANumberDivisibleBy3AndNot5_ShouldReturnFizz(){
        //Arrange
        int number = 3;
        String expectedOutput = "Fizz";

        //Act
        String actualOutput = fizzBuzz.fizzBuzzTask(number);

        //Assert
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    void givenANumberDivisibleBy5AndNot3_ShouldReturnBuzz(){
        //Arrange
        int number = 5;
        String expectedOutput = "Buzz";

        //Act
        String actualOutput = fizzBuzz.fizzBuzzTask(number);

        //Assert
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    void givenANumberDivisibleByBoth5And3_ShouldReturnFizzBuzz(){
        //Arrange
        int number = 15;
        String expectedOutput = "FizzBuzz";

        //Act
        String actualOutput = fizzBuzz.fizzBuzzTask(number);

        //Assert
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    void givenANumberDivisibleByNeither5Or3_ShouldReturnNumber(){
        //Arrange
        int number = 2;
        String expectedOutput = "2";

        //Act
        String actualOutput = fizzBuzz.fizzBuzzTask(number);

        //Assert
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    void givenARangeOfNumbers_ShouldReturnFizzBuzz(){
        //Arrange
        int start = 1;
        int end = 15;
        String expectedOutput = "1 2 Fizz 4 Buzz Fizz 7 8 Fizz Buzz 11 Fizz 13 14 FizzBuzz ";

        //Act
        String actualOutput = fizzBuzz.fizzBuzzTask(start, end);

        //Assert
        assertEquals(expectedOutput, actualOutput);
    }
    @Test
    void givenAnIncorrectRangeOfNumbers_ShouldReturnNothing(){
        //Arrange
        int start = 15;
        int end = 1;
        String expectedOutput = "";

        //Act
        String actualOutput = fizzBuzz.fizzBuzzTask(start, end);

        //Assert
        assertEquals(expectedOutput, actualOutput);
    }

}