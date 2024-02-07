public class SecondAndMinuteChallenge {
    public static void main(String[] args) {
        System.out.println(getDurationString(3945) );


    }
    public static String getDurationString(int seconds){
        // Two step approach to get hours
        int minutes = seconds/60;
        int hours = minutes/60;
        System.out.println("hours = " + hours);

        //one step approach to get hours
        int hours1 = seconds/3600;
        System.out.println("hours1 = " + hours1);

        int remainingMinutes = minutes % 60;
        System.out.println("minutes = " + minutes);
        System.out.println("remaining = " + remainingMinutes
        );

        int remainingSeconds = seconds % 60;
        System.out.println("remainingSeconds = " + remainingSeconds);
        return hours + "h" + remainingMinutes + "m" + remainingSeconds + "s";

    }
    public static String getDurationString(int minutes, int seconds){

        return "";
    }
}