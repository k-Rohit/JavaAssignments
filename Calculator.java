package Calculator;

import java.util.Objects;
import java.util.Scanner;

public class Calculator {

    // Creating an object of the UserInput class be able to use the input functions of it.

     UserInput input = new UserInput();
    Scanner sc = new Scanner(System.in);

//     int option;
     void addition(){
         int sum = 0; // Initialising an integer variable for storing the sum
         int number = 0;
         String choice = "y"; // initialising a choice variable whose value will be asked by the user to enter .
         // Running a while loop which will give the user option to enter as many number they want before entering
         // the termination condition.
        while (Objects.equals(choice, "y")){

           sum = sum  + input.numberInput(number);
            System.out.println("Do you want to enter more numbers");
            choice = sc.next();
        }
        System.out.println("The sum of the entered numbers are :"+ sum);
     }

    void subtraction(){
        int difference = 0; // Initialising an integer variable for storing the difference
        int number = 0;
        String choice = "y";// initialising a choice variable whose value will be asked by the user to enter .
        // Running a while loop which will give the user option to enter as many number they want before entering
        // the termination condition.
        while (Objects.equals(choice, "y")){
           difference = difference  - input.numberInput(number);
            System.out.println("Do you want to enter more numbers");
            choice = sc.next();
        }
        System.out.println("The sum of the entered numbers are :"+ difference);
    }

    void multiplication(){
         int result = 1; // Initialising an integer variable for storing the result of multiplication
         int number = 1;
        String choice = "y";
        // Running a while loop which will give the user option to enter as many number they want before entering
        // the termination condition.
         while(Objects.equals(choice, "y")){
             result = result * input.numberInput(number);
             System.out.println("Do you want to enter more numbers");
             choice = sc.next();
         }
         System.out.println("The result after multiplying the numbers is :" + result);
    }

    void division(float number1, float number2){
         float result = number1/number2;
        System.out.println("The result after dividing the numebrs is :" + result);
    }

    int sumOfArray(int[] array){
         int sum = 0;
         // Taking the array as input using the function created in the UserInput class.
         input.arrayInput(array);
         for(int i=0; i<array.length; i++){
             sum = sum + array[i];
         }
        System.out.println(sum);
         return sum;
    }



    float variance(int[] array){

         int sum = sumOfArray(array); // Using the function defined previously to calculate the sum of the array.
        float mean = sum/array.length; // Finding the mean of the array by dividing the sum of the elements of the array
        // by the number of elements in the array.
         float numerator = 0; //  creating a numerator variable for storing the numerator value of th e variance formula
         for(int i=0; i<array.length; i++){
             numerator = (float) (numerator + Math.pow((array[i] - mean),2));
         }
         float result = numerator/array.length;
        System.out.println("The Variance of the array is:" + result);
        return result;
    }

    float standardDeviation(int[] array){
         // Standard deviation is equal to the square root of the variance
        // Using the sqrt (Square Root function) of the Math library to find out of the square root and hence standard deviation.
         float result = (float)Math.sqrt(variance(array));
        System.out.println("The Standard Deviation of the array is :" + result);
        return result;
    }




}
