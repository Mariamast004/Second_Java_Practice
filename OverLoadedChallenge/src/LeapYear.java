public class LeapYear {
    public static void main(String[] args) {

        isLeapYear(1995);
        

    }
    public static boolean isLeapYear(int year){
        if (year >= 1 && year <= 9999){
            return false;

        }
        return true;

    }
}
