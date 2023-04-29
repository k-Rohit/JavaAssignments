package exceptionhandling;

import java.util.Scanner;

class FactorialException1 extends RuntimeException{
    public FactorialException1(String message){
        super(message);
    }
}

public class Factorial {
    public static void main(String[] args) {
        System.out.println("This is a program for calculating the factorial of a number");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of which the factorial is required");
        int n = Integer.parseInt(args[0]);
        if (n < 0 || n > 20)
        {
            throw new FactorialException1("Please enter a valid range");
        }
        int factorial = 1;
        for (int i = 1; i < n; i++) {
            factorial = factorial * i;
        }
        System.out.println(factorial);
    }
}
