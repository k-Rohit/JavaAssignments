package Assignment5;

import Assignment5.Shape;

import java.util.Scanner;

public class Circle extends Shape {

    @Override
    public void calculateArea() {
        Scanner scanner = new Scanner(System.in);
        double r = 21;
        double area = Math.PI * Math.pow(r,2);
        System.out.println("Area of Circle = " + area);
    }
}
