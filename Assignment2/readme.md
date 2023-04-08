## This program illustrates the implementation of Arrays and Arraylists

### Problem Statement - 

1. W.a.p that declares two arrays named ‘even’ and ‘odd’. Accept
numbers from the user and move them to respective arrays depending on
whether they are even or odd.

2. Implement a java function that finds 2 neighboring numbers in an
array with the smallest distance to each. The function should return the
index of the 1st number.

3. Write a Java program to convert an array into ArrayList and vice
versa.

The program contains 3 java files -
1. UserInput - For taking the input of array from the user
2. Main - containing the main method
3. Functions - Contains all the required function -
      1.void splitOddEven(int[] oddArray, int[] evenArray, int lengthOfArray)
        Function that takes an array as an input and splits it into two arrays
        odd and even the odd array contains all the odd elements and
        the even array contains all the even element
     
      2. int returnIndex(int[] array)
         Function for finding 2 neighboring numbers in an
         array with the smallest distance to each. The function returns
         the index of the 1st number.
       
      3. public  int[] arrayListToArray(ArrayList<Integer> list)
         Function to convert ArrayList into array 
         This function takes and arraylist as asn input and then stores the elements in the list
         into an array.
         
      4.void ArrayToList_ListToArray(int[] arr, ArrayList<Integer> arrayList)
        Function to convert an array into ArrayList
        This function converts takes array as input and then adds each of 
        the element in the list.
        
