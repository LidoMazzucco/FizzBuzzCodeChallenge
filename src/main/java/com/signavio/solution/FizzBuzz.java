package com.signavio.solution;

public class FizzBuzz {

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

        value.append(checkFizz(number));
        value.append(checkBuzz(number));
        value.append(checkWhiz(number));

        return value.toString();
    }

    public static String checkFizz(int number) {
        String result = "";

        if (number % 3 == 0) result = "Fizz";

        return result;
    }

    public static String checkBuzz(int number) {
        String result = "";

        if (number % 5 == 0) result = "Buzz";

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
        if (!dividerFounded) result = "Whiz";

        return result;
    }

}
