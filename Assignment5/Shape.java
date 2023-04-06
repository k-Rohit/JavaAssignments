package Assignment5;

import java.util.Scanner;

abstract public class Shape {

    // Here Shape is an abstract class with one implemented method
    // and one abstract method

    public  static void showShape(String shape){
        System.out.println("Shape is "+ shape);
    }
    // This abstract method would be overridden in the other classes
    // for calculating the area of given shape
    abstract public void calculateArea();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("------Menu------");
        System.out.println("Calculate Area and Volume");
        System.out.println("1. Calculate Area");
        System.out.println("2. Calculate Volume");
        System.out.println("3. Exit from the program");
        System.out.println("Enter your choice");
        int choice = scanner.nextInt();
        while (true) {
            switch (choice) {
                case 1:
                    System.out.println("Calculate Area of \n" +
                            "1. Circle\n" +
                            "2. Rectangle\n" +
                            "3. Sphere\n" +
                            "4. Cylinder\n" +
                            "5. Pyramid\n" +
                            "6. exit");
                    System.out.println("Choose the shape");
                    int chooseShape = scanner.nextInt();
                    switch (chooseShape){
                        case 1:
                            Shape.showShape("Circle");
                            Circle circle = new Circle();
                            circle.calculateArea();
                            break;

                        case 2:
                            Shape.showShape("Rectangle");
                            Rectangle rectangle = new Rectangle();
                            rectangle.calculateArea();
                            break;

                        case 3:
                            Shape.showShape("Sphere");
                            Sphere sphere = new Sphere();
                            sphere.calculateArea();
                            break;

                        case 4:
                            Shape.showShape("Cylinder");
                            Cylinder cylinder = new Cylinder();
                            cylinder.calculateArea();
                            break;

                        case 5:
                            Shape.showShape("Pyramid");
                            Pyramid pyramid = new Pyramid();
                            pyramid.calculateArea();
                            break;

                        case 6:
                            System.exit(0);

                        default:
                            System.out.println("Enter a valid choice");
                    }
                    break;

                case 2:
                    System.out.println("Calculate Volume of \n" +
                            "1. Sphere\n" +
                            "2. Cylinder\n" +
                            "3. Pyramid\n" +
                            "4. Exit");

                    chooseShape = scanner.nextInt();
                    switch (chooseShape){
                        case 1:
                            Sphere sphere = new Sphere();
                            sphere.calculateVolume();
                            break;

                        case 2:
                            Cylinder cylinder = new Cylinder();
                            cylinder.calculateVolume();
                            break;

                        case 3:
                            Pyramid pyramid = new Pyramid();
                            pyramid.calculateVolume();
                            break;

                        case 4:
                            System.exit(0);

                        default:
                            System.out.println("Enter a valid choice");
                    }

                case 3:
                    System.exit(0);
            }

        }
    }
}
