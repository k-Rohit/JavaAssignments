package Assignment2;

import java.util.ArrayList;
import java.util.Scanner;

public class UserInput {
    Scanner scanner = new Scanner(System.in);

    // Function for taking array as an input from the user.
    int[] inputArray(int[] arr){
        for(int i=0; i< arr.length; i++){
            arr[i] = scanner.nextInt();
        }
        return arr;
    }


    // Function for taking an arrayList as an input from the user.
    ArrayList<Integer> inputArrayList(ArrayList<Integer> arrayList){
        System.out.println("Enter the size of the ArrayList");
        int length = scanner.nextInt();
        for(int i=0; i<length; i++){
            int ele = scanner.nextInt();
            arrayList.add(ele);
        }
        return arrayList;
    }
}
