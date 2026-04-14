package divisibleBy;
// i love modular arithmetic <3
public class Task {
    public static boolean divisibleNum(int num){
        int[] nums = new int[] {3,5};
        for(int n : nums){
            while(num%n==0){
                num/=n;
            }
        }
        return (num==1);
    }
    static void main(String[] args) {
        for(int n =1; n<=500; n++){
            if(divisibleNum(n)){
                System.out.println(n);
            }
        }
    }

}
