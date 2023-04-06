package Assignment5;

import java.util.Scanner;

public class Pyramid extends Shape implements Volume{
    Scanner scanner = new Scanner(System.in);
    @Override
    public void calculateArea() {
            // Calculate the area of the base
            System.out.println("Enter the baseLength");
            double baseLength = scanner.nextDouble();
            System.out.println("Enter the baseWidth");
            double baseWidth = scanner.nextDouble();
            System.out.println("Enter the slantHeight");
            double slantHeight = scanner.nextDouble();


            double baseArea = baseLength * baseWidth;

            // Calculate the triangular faces' areas
            double triangularArea = (baseLength * slantHeight) / 2;

            // Calculate the total surface area
            double surfaceArea = baseArea + (triangularArea * 4);

            System.out.println("The surface area of the pyramid is "  + surfaceArea);

    }


    public static double pyramidVolume(double baseLength, double baseWidth, double height) {
        // Calculate the area of the base
        double baseArea = baseLength * baseWidth;

        // Calculate the volume
        double volume = (baseArea * height) / 3;

        return volume;
    }



    @Override
    public void calculateVolume() {
        System.out.println("Enter the baseLength");
        double baseLength = scanner.nextDouble();
        System.out.println("Enter the baseWidth");
        double baseWidth = scanner.nextDouble();
        System.out.println("Enter the height of the pyramid");
        double height = scanner.nextDouble();
        // Calculate the area of the base
        double baseArea = baseLength * baseWidth;

        // Calculate the volume
        double volume = (baseArea * height) / 3;

        System.out.println("The volume of the pyramid is " + volume);


    }
}
