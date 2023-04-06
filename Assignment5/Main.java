package Assignment5;

import java.util.Scanner;

public class Main {

    // Switch case for calculating the area and volume of given shape

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("------Menu------");
        System.out.println("Calculate Area and Volume");
        System.out.println("1. Calculate Area");
        System.out.println("2. Calculate Volume");
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
                            "5. Pyramid");
                    System.out.println("Choose the shape");
                    int chooseShape = scanner.nextInt();
                    switch (chooseShape){
                        case 1:

                    }

            }

        }
    }

}
