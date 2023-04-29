// Name - Kumar Rohit
// PRN - 21070126052
// Division - AIML - A3

package Assignment7;

public class Functions {
        double[] result =new double[1]; // 1  is the size of the array which means there are 2 elements 0 and 1
        double[] result_array=new double[7]; // This array is for returning results of array operations
        public double[]  performAdditionoperation(double[] numbers)

        {
            result[0]=numbers[0]+numbers[1];


            return result;  // result is an array form beacuse the addition of array elements in this case the numbers can only be saved in an array
        }
        public double[] performSubtractionoperation(double[] numbers)
        {
            result[0]=numbers[0]-numbers[1];



            return result;
        }
        public double[] performMultiplicationoperation(double [] numbers )
        {
            result[0]=numbers[0]*numbers[1];



            return result;

        }
        public double[] performDivisionoperation(double [] numbers) throws ArithmeticException{

            result[0]=numbers[0]/numbers[1];





            return result;
        }
        public void   compare(double [] numbers)
        {
            if (numbers[0]>numbers[1]){
                System.out.println("Number 1 is greater than number 2");


            }
            else if (numbers[0]==numbers[1])
            {
                System.out.println("Number 1 is equal to number 2");

            }
            else{
                System.out.println("Number 1 is less than number 2 ");
            }

        }
        public void  absolute(double [] numbers)
        {
            System.out.println("Absolute value of number 1 is "+Math.abs(numbers[0]));

            System.out.println("Absolute value of number 2 is "+Math.abs(numbers[1]));


        }




}
