package weeklyRoutine;

public class Task {

    static void main(String[] args) {
        int dayOfWeek = 6;

        System.out.println(dayOfWeek <= 5 ? "Weekday" : "Not weekday");
        switch (dayOfWeek){
            case 2:
                System.out.println("Go to the gym");
                break;
            case 4:
                System.out.println("Go to the gym");
                break;
            case 7:
                System.out.println("Go gardening");
                break;
        }
    }
}
