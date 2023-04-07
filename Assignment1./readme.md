
## Java Assigment - 1

### Calulator Program - 

This is a program which allows user to perform various operations like -
1. Addition 
2. Subtraction
3. Multiplication
4. Division
5. Sum of the array
6. Variance of the array
7. Standard Deviation of the array

#### The various clases used in the program are - 
<ol>
<li> UserInput - This class contains the functions for taking the input from the user - numbers and array</li>
<li> Calculator - This class contains all the functions to perform the various operations mentioned above - </li>
 <li> Main - This class contains the main method to run the whole program , using the functions from all the classes</li>
   <ol>
    <li> The various functions used in the program are - </li>
      <li> void addition(int number) - This will take the input(numbers) from the users until the user enters the termination condition and a sum variable will hold the sum of the previous numbers and adding the next number to it.</li>
      <li> void subtraction(int number) - This will take the input(numbers) from the users until the user enters the termination condition and a difference variable will hold the difference of the previous numbers and subtracting the the next number from the difference.</li>
      <li> void multiplication(int number) - This will take the input(numbers) from the users until the user enters the termination condition and a result variable initialised to one will hold the result of the multiplication of the previous numbers and multiplying the next number to it.</li>
      <li> void division(float number1, float number2) - This function, named "division", takes two float values as input parameters, performs a division operation on them, and prints the result of the division operation.</li>
      <li> float variance(int[] array) - The "variance" function takes an array of integers and returns its variance, which measures how much the values vary from the mean. It calculates the mean, the squared differences from the mean, and divides by the number of elements to get the variance. The standard deviation is also printed.
       <li> int sumOfArray(int[] array) - This function returns the sum of the elements of the array.</li>
      <li> float standardDeviation(int[] array) - The "standardDeviation" function takes an array of integers and returns the standard deviation of the input array as a float value. It calculates the standard deviation by calling the "variance" function, then applies the square root function to the variance result. The function prints the standard deviation to the console and returns it.
