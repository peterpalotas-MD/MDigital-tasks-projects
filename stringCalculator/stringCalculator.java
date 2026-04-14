import java.util.Arrays;

public class stringCalculator {


    static void main() {
        System.out.println(calculator("1 2 3"));
    }
    //variation for single number
    public static String calculator(String s){

        if(s.equals("")){
            return "";
        }
        String[] input = s.split(" ");
        for(int i = 0; i< input.length; i++){
            try {
                double d = Double.parseDouble(input[i]);
            } catch (NumberFormatException nfe) {
                return "Enter numbers please";
            }
            if(Integer.parseInt( input[i] )< 0){
                throw new ArithmeticException("No negatives allowed");


            }
        }
        if(input.length == 1){
            return input[0];
        } else if(input.length==2) {
            return Integer.toString(Integer.parseInt(input[0]) + Integer.parseInt(input[1]));
        }else if(input.length==3) {
            return Integer.toString(Integer.parseInt(input[0]) + Integer.parseInt(input[1]) + Integer.parseInt(input[2]));
        }
        else{
            return "Too many numbers entered, enter 1, 2 or 3 positive numbers";
        }

    }


}
