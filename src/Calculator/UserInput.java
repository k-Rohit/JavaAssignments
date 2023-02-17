package Calculator;

import java.util.Scanner;

public class UserInput {

    // Creating an object of the Scanner class for taking input from the user.
     Scanner input = new Scanner(System.in);
    public  int numberInput(int number){
        System.out.println("Input the number");
        number = input.nextInt();
        return number;
    }

    void arrayInput(int[] array){
        System.out.println("Enter the elements of the array: ");
        for(int i=0; i<array.length; i++){
            array[i] = input.nextInt();
        }
    }
}
