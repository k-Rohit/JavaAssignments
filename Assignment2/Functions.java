package Assignment2;

import java.util.Arrays;
import java.util.Scanner;
import java.util.ArrayList;


public class Functions {
    // Creating the object of the scanner class for taking the input from the user
    Scanner scanner = new Scanner(System.in);
    UserInput userInput = new UserInput();


    // Function that takes an array as an input and splits it into two arrays
    // odd and even the odd array contains all the odd elements and
    // the even array contains all the even element
    void splitOddEven(int[] oddArray, int[] evenArray, int lengthOfArray) {
        int evenCount = 0;
        int oddCount = 0;
        for (int i = 0; i < lengthOfArray; i++) {

            int oddOrEven = scanner.nextInt();
            if (oddOrEven % 2 == 0) {
                evenArray[evenCount] = oddOrEven;
                evenCount += 1;
            } else {
                oddArray[oddCount] = oddOrEven;
                oddCount += 1;
            }
        }
    }

    // Function for finding 2 neighboring numbers in an
    //array with the smallest distance to each. The function returns
    //the index of the 1st number.
    int returnIndex(int[] array) {
//        System.out.println("Input the array");
//        for (int i = 0; i < array.length; i++) {
//            System.out.println("Enter element" + i + " :");
//            array[i] = scanner.nextInt();
//        }

        Arrays.sort(array);
        int index = 0;
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < array.length - 1; i++) {
            int diffInValue = array[i + 1] - array[i];
            if (diffInValue < min) {
                min = diffInValue;
                index = i;
            }
        }
        return index;
    }

        // Function to convert an array into ArrayList
        public ArrayList<Integer> arrayToArrayList(int[] arr) {
            ArrayList<Integer> list = new ArrayList<>();
            for (int i = 0; i < arr.length; i++) {
                list.add(arr[i]);
            }
            return list;
        }

        // Function to convert ArrayList into array
        public  int[] arrayListToArray(ArrayList<Integer> list) {
            int[] array = new int[5];
            int[] arr = userInput.inputArray(array);
            for (int i = 0; i < list.size(); i++) {
                arr[i] = list.get(i);
            }
            return arr;
        }

        // Function implementing a switch case for calling the two functions when they are required
        void ArrayToList_ListToArray(int[] arr, ArrayList<Integer> arrayList){
            System.out.println("1. Convert array to arraylist");
            System.out.println("2. Convert arraylist to array");
            int choice = 0;
            System.out.println("Enter your chocie");
            choice = scanner.nextInt();
            switch (choice){
                case 1:
                    arrayList = arrayToArrayList(arr);
                    System.out.println(arrayList);
                    break;
                case 2:
                    arr = arrayListToArray(arrayList);
                    System.out.println(Arrays.toString(arr));
                    break;
            }
        }
}
