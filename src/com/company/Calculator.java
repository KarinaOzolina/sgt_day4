package com.company;

public class Calculator {

    public static void main(String[] args) {
        // write a code for a calculator with math operators using if else if statement
        // / + * - %
        /*
        char operators = '-'
        double number1 = 20;
        double number2 = 30;
        double result = 0;
        else if (operators == '-') {
        result = number1 - number2;
         */

        char operator = '*';
        double number1 = 10.0;
        double number2 = 2.0;
        double result = 0;


        if (operator == '+') {
            result = number1 + number2;
            System.out.println(result);
        } else if (operator == '-') {
            result = number1 - number2;
            System.out.println(result);
        } else if (operator == '*') {
            result = number1 * number2;
            System.out.println(result);
        } else if (operator == '/') {
            result = number1 / number2;
            System.out.println(result);
        } else if (operator == '%') {
            result = number1 % number2;
            System.out.println(result);
        } else {
            System.out.println("No such operator exist");
        }

    }
}
