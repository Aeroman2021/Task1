package com.company;

public class RecursiveMethod {
    private int count = 0;

    public void divide(int number1, int number2) {

        if (number1 < number2)
            System.out.println(" Division is:" + count);
        else {
            number1 -= number2;
            count += 1;
            divide(number1, number2);
        }
    }

    public void multiply(int number1, int number2) {

        if (number1 > number2)
            System.out.println(" The multiply is " + number1);
        else {
            number1 += number2;
            multiply(number1, number2);
        }
    }


}
