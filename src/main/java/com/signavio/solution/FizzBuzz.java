package com.signavio.solution;

public class FizzBuzz {

    public static String fizzBuzzProblem(int number)
    {
        StringBuilder value = new StringBuilder();
        //Optional.of(number).map( -> (number%3 == 0) ? "Fizz");

        if (number %3 == 0) value.append("Fizz");
        if (number %5 == 0) value.append("Buzz");
        if (value.length() == 0) {
            boolean flag = true;
            int by2 = number/2;
            for (int i = 2; i <= by2; i++) {
                if (number % i == 0) {
                    flag = false;
                    break;
                }
            }
            if(flag) value.append("Wizard");
        }

        return value.toString();
    }

    public static void main (String[] args)
    {
        String value = "";
        Integer number = 1;
        while (number <= 100){
            value = fizzBuzzProblem(number);
            System.out.println(number + ": " + value);
            number++;

        }
    }
}
