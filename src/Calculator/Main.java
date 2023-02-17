// Name - Kumar Rohit
// PRN - 21070126052
// Batch - 2021-2025

package Calculator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calculator calculator = new Calculator();


//        cal.addition();
//        cal.multiplication();
//        cal.division(23,2);
        int option;
        while (true){
            System.out.println("*****************");
            System.out.println("Input your choice");
            System.out.println("1- Addition");
            System.out.println("2- Subtraction");
            System.out.println("3- Multiplication");
            System.out.println("4- Division");
            System.out.println("5- Exiting the program");
            System.out.println("6- Sum of the array");
            System.out.println("7- Variance of the array");
            System.out.println("8- Standard Deviation of the array");
            System.out.println("*****************");
            System.out.println();
            System.out.println("Enter the option");
            option = sc.nextInt();

            switch (option) {

                case 1:
                    calculator.addition();
                    break;
                case 2:
                    calculator.subtraction();
                case 3:
                    calculator.multiplication();
                    break;
                case 4:
                    calculator.division(4,5);
                    break;
                case 5:
                    System.exit(0);
                    break;
                case 6:
                    System.out.println("Enter the size of the array");
                    int n1 = sc.nextInt();
                    int[] array1 = new int[n1];
                    calculator.sumOfArray(array1);
                    break;
                case 7:
                    System.out.println("Enter the size of the array");
                    int n2 = sc.nextInt();
                    int[] array2 = new int[n2];
                    calculator.variance(array2);
                    break;
                case 8:
                    System.out.println("Enter the size of the array");
                    int n3 = sc.nextInt();
                    int[] array3 = new int[n3];
                    calculator.standardDeviation(array3);
                    break;
                default:
                    System.out.println("Please enter a valid choice");
            }

        }
    }
}
