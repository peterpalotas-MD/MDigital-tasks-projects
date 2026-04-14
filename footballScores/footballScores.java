import java.util.Arrays;

public class footballScores {

    static void main() {
        String[] scores = randomInput(38);
        System.out.println("The standings were: " + Arrays.toString(scores));

        System.out.println("X has scored : " + calculateScore(scores));
    }


    public static String[] randomInput(int n){
        String[] s = new String[n];


        for(int i =0; i < n; i++){

            //gen
            int score1 = (int) (Math.random()*10)%5;
            int score2 = (int) (Math.random()*10)%5;

            String score = "" + score1 + ":" + score2;
            s[i] = score;


        }

        return s;
    }
    //later can code random generator to test
    public static int calculateScore(String[] scores){

        int total = 0;
        for(String score : scores){


            String[] points = score.split(":");
            int x = Integer.parseInt(points[0]);
            int y = Integer.parseInt(points[1]);

            if(x > y){
                total+=3;
            }
            if(x<y){
            }
            if(x==y){
                total+=1;
            }


        }

        return total;
    }
}
