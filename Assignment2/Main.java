// Name - Kumar Rohit
// PRN - 21070126052
// Division - AIML - A3


package Assignment2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        UserInput userInput = new UserInput();
        Functions functions = new Functions();
        ArrayList<Integer> arrayList= new ArrayList<>();



        System.out.println("Enter the number of elements you want in the array");
        int sizeOfArray = scanner.nextInt();
        int[] array = new int[sizeOfArray];
        int evenArray[] = new int[5];
        int oddArray[] = new int[5];

        array = userInput.inputArray(array);
        System.out.println(Arrays.toString(array));


        // Splitting the array into odd and even -


        functions.splitOddEven(evenArray,oddArray,sizeOfArray);
        System.out.println(Arrays.toString(evenArray));
        System.out.println(Arrays.toString(oddArray));

        System.out.println("The first index where the distance between the two neighboring elements is minimun is" +
        functions.returnIndex(array));

        functions.ArrayToList_ListToArray(array,arrayList);

    }
}
