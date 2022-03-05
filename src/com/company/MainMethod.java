package com.company;

public class MainMethod {

    private static void multiply(int number1, int number2) {
        int sum = 0;
        for (int i = 0; i < number2; i++) {
            sum += number1;
        }
        System.out.println(number1 + " * " + number2 + " = " + sum);
    }

    private static void divide(int number1, int number2) {
        int count = 0;
        while (number1 > number2) {
            number1 -= number2;
            count += 1;
        }
        System.out.println(number1 + " / " + number2 + " = " + count);
    }

}
