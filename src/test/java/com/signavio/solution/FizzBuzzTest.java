package com.signavio.solution;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FizzBuzzTest {

    @Test
    public void checkFizz_numberMultipleOfThree_returnFizz()
    {
        int testNumber = 3;
        String result = FizzBuzz.checkFizz(testNumber);

        Assertions.assertEquals("Fizz", result);
    }

    @Test
    public void checkFizz_numberMultipleNotOfThree_returnEmpty()
    {
        int testNumber = 10;
        String result = FizzBuzz.checkFizz(testNumber);

        Assertions.assertEquals("", result);
    }

    @Test
    public void checkBuzz_numberMultipleOfFive_returnBuzz()
    {
        int testNumber = 10;
        String result = FizzBuzz.checkBuzz(testNumber);

        Assertions.assertEquals("Buzz", result);
    }

    @Test
    public void checkBuzz_numberMultipleNotOfFive_returnEmpty()
    {
        int testNumber = 13;
        String result = FizzBuzz.checkBuzz(testNumber);

        Assertions.assertEquals("", result);
    }

    @Test
    public void checkWhiz_primeNumber_returnWhiz()
    {
        int testNumber = 17;
        String result = FizzBuzz.checkWhiz(testNumber);

        Assertions.assertEquals("Whiz", result);
    }

    @Test
    public void checkWhiz_notPrimeNumber_returnEmpty()
    {
        int testNumber = 20;
        String result = FizzBuzz.checkWhiz(testNumber);

        Assertions.assertEquals("", result);
    }
}
