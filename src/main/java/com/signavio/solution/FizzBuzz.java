package com.signavio.solution;

public class FizzBuzz {

    public static final String FIZZ_MESSAGE  = "Fizz";
    public static final String BUZZ_MESSAGE = "Buzz";
    public static final String WHIZ_MESSAGE = "Whiz";
    public static final int FIZZ_CONDITION = 3;
    public static final int BUZZ_CONDITION = 5;


    public static void main(String[] args) {
        String value = "";
        Integer number = 1;
        while (number <= 100) {
            value = fizzBuzzProblem(number);
            System.out.println(number + ": " + value);
            number++;

        }
    }

    public static String fizzBuzzProblem(int number) {
        StringBuilder value = new StringBuilder();

        value.append(checkFizzBuzz(number, FIZZ_MESSAGE, FIZZ_CONDITION));
        value.append(checkFizzBuzz(number, BUZZ_MESSAGE, BUZZ_CONDITION));
        value.append(checkWhiz(number));

        return value.toString();
    }

    public static String checkFizzBuzz(int number, String message, int condition) {
        String result = "";
        boolean isMultipleOfCondition = number % condition == 0;
        boolean isSecondDigitEqualToCondition = (number/10)%10 == condition;

        if (isMultipleOfCondition || isSecondDigitEqualToCondition) result = message;

        return result;
    }

    public static String checkWhiz(int number) {
        String result = "";
        boolean dividerFounded = false;

        for (int i = 2; i <= number/2; i++) {
            if (number % i == 0) {
                dividerFounded = true;
                break;
            }
        }
        if (!dividerFounded) result = WHIZ_MESSAGE;

        return result;
    }

}
