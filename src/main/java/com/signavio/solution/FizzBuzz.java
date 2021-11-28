package com.signavio.solution;

public class FizzBuzz {

    public static String fizzBuzzProblem(int number)
    {
        StringBuilder value = new StringBuilder();

        value.append(checkFizz(number));
        value.append(checkBuzz(number));

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

    public static String checkFizz(int number) {
        String result = "";
        if (number %3 == 0) result = "Fizz";
        return result;
    }

    public static String checkBuzz(int number) {
        String result = "";
        if (number %5 == 0) result = "Buzz";
        return result;
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
