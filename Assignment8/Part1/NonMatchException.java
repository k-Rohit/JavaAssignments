package Assignment8;
import java.util.Objects;

public class NonMatchException extends RuntimeException{

    public NonMatchException(String message){
        super(message);
    }

    public static void main(String[] args) {
        checkString("Aus");
    }
    public static void checkString(String string){
        try {

            if(Objects.equals(string, "India")){
                System.out.println("True");
            }else{
                throw new NonMatchException("Enter string doesn't match India");
            }
        }catch (NonMatchException nonMatchException){
            System.out.println("Your entered string was " + string);
            nonMatchException.printStackTrace();
        }
    }
}
