package golfScore;

public class Task {




    public static String golfScore(int strokes, int par){
        if(strokes == 1){
            return "hole in one";
        }
        //this variable represents how much ahead (or behind ) of the par the shot was
        int offBy = par-strokes;

        if(offBy>=2){
            return "Eagle";
        }
        else if(offBy<-2){
            return "Quit";
        }else{


            switch (offBy){
                case 1:
                    return "Birdie";
                case 0:
                    return "par";
                case -1:
                    return "Bogey";
                case -2:
                    return "Double Bogey";
            }
        }
        return "Error";
    }

    static void main(String[] args) {
        System.out.println(golfScore(20,5));
    }
}
