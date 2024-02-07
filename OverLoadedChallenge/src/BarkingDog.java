public class BarkingDog {
    public static void main(String[] args) {
        shouldWakeUp(true,24);

    }
    public static void shouldWakeUp(boolean barking, int hourOfDay){
         barking = true;
        // hourOfDay = 0-23;

        if(hourOfDay < 0 || hourOfDay > 23) {
            System.out.println(false);
        } else {
            System.out.println(true);
        }
        return;
    }

}
