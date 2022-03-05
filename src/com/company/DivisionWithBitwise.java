package com.company;

import java.util.Scanner;

class DivisionWithBitwise {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter any two integer: ");
        int num1 = scan.nextInt(), num2 = scan.nextInt();
        System.out.println("Division is:" + division(num1, num2));
    }

    static int division(int num1, int num2) {
        int temp = 1;
        int result = 0;

        while (num2 <= num1) {
            num2 <<= 1;
            temp <<= 1;
        }

        while (temp > 1) {
            num2 >>= 1;
            temp >>= 1;
            if (num1 >= num2) {
                num1 -= num2;
                result += temp;
            }
        }
        return result;
    }
}