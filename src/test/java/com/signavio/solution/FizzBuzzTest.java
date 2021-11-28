package com.signavio.solution;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FizzBuzzTest {

    @Test
    public void checkFizz_numberMultipleofThree_returnFizz()
    {
        int testNumber = 3;
        String result = FizzBuzz.checkFizz(testNumber);

        Assertions.assertEquals("Fizz", result);
    }
}
