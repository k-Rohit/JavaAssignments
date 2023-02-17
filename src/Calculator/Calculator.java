package Calculator;

import java.util.Objects;
import java.util.Scanner;

public class Calculator {

     UserInput input = new UserInput();
    Scanner sc = new Scanner(System.in);

//     int option;
     void addition(){
         int sum = 0;
         int number = 0;
         String choice = "y";
        while (Objects.equals(choice, "y")){
           sum = sum  + input.numberInput(number);
            System.out.println("Do you want to enter more numbers");
            choice = sc.next();
        }
        System.out.println("The sum of the entered numbers are :"+ sum);
     }

    void subtraction(){
        int difference = 0;
        int number = 0;
        String choice = "y";
        while (Objects.equals(choice, "y")){
           difference = difference  - input.numberInput(number);
            System.out.println("Do you want to enter more numbers");
            choice = sc.next();
        }
        System.out.println("The sum of the entered numbers are :"+ difference);
    }

    void multiplication(){
         int result = 1;
         int number = 1;
        String choice = "y";
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
         input.arrayInput(array);
         for(int i=0; i<array.length; i++){
             sum = sum + array[i];
         }
        System.out.println(sum);
         return sum;
    }

    float variance(int[] array){

         int sum = sumOfArray(array);
        float mean = sum/array.length;
         float numerator = 0;
         for(int i=0; i<array.length; i++){
             numerator = (float) (numerator + Math.pow((array[i] - mean),2));
         }
         float result = numerator/array.length;
        System.out.println("The standard Deviation of the array is:" + result);
        return result;
    }

    float standardDeviation(int[] array){
         float result = (float)Math.sqrt(variance(array));
        System.out.println("The Standard Deviation of the array is :" + result);
        return result;
    }




}
