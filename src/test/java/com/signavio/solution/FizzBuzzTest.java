package com.signavio.solution;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FizzBuzzTest {

    @Test
    public void checkFizzBuzz_numberMultipleOfThree_returnFizz()
    {
        int testNumber = 6;
        String result = FizzBuzz.checkFizzBuzz(testNumber, FizzBuzz.FIZZ_MESSAGE, FizzBuzz.FIZZ_CONDITION);

        Assertions.assertEquals("Fizz", result);
    }

    @Test
    public void checkFizzBuzz_numberMultipleNotOfThree_returnEmpty()
    {
        int testNumber = 7;
        String result = FizzBuzz.checkFizzBuzz(testNumber, FizzBuzz.FIZZ_MESSAGE, FizzBuzz.FIZZ_CONDITION);

        Assertions.assertEquals("", result);
    }

    @Test
    public void checkFizzBuzz_numberMultipleOfFive_returnBuzz()
    {
        int testNumber = 10;
        String result = FizzBuzz.checkFizzBuzz(testNumber, FizzBuzz.BUZZ_MESSAGE, FizzBuzz.BUZZ_CONDITION);

        Assertions.assertEquals("Buzz", result);
    }

    @Test
    public void checkFizzBuzz_numberMultipleNotOfBuzz_returnEmpty()
    {
        int testNumber = 12;
        String result = FizzBuzz.checkFizzBuzz(testNumber, FizzBuzz.BUZZ_MESSAGE, FizzBuzz.BUZZ_CONDITION);

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

    @Test
    public void checkFizzBuzz_numberWithThreeDigit_returnFizz()
    {
        int testNumber = 31;
        String result = FizzBuzz.checkFizzBuzz(testNumber, FizzBuzz.FIZZ_MESSAGE, FizzBuzz.FIZZ_CONDITION);

        Assertions.assertEquals("Fizz", result);
    }

    @Test
    public void checkFizzBuzz_numberWithFiveDigit_returnFizz()
    {
        int testNumber = 51;
        String result = FizzBuzz.checkFizzBuzz(testNumber, FizzBuzz.BUZZ_MESSAGE, FizzBuzz.BUZZ_CONDITION);

        Assertions.assertEquals("Buzz", result);
    }
}
