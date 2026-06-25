public class fizzBuzz {


    static void main() {
        System.out.println(fizzBuzzTask(15, 30));

    }
    public static String fizzBuzzTask(int number){

        if(number % 15 == 0){
            return "FizzBuzz";
        }else if(number % 3 == 0){
            return "Fizz";
        }else if(number % 5 == 0) {
            return "Buzz";
        }
        return Integer.toString(number);
    }

    public static String fizzBuzzTask(int start, int end){
        StringBuilder sb = new StringBuilder();
        for(int i = start; i<=end; i++){
            if(i % 15 == 0){
                sb.append("FizzBuzz ");
            }else if(i % 3 == 0){
                sb.append("Fizz ");
            }else if(i % 5 == 0) {
                sb.append("Buzz ");
            }
            else{
                sb.append(Integer.toString(i) + " ");

            }

        }
        return sb.toString();

    }








}
