public class Main {
    public static void main(String[] args) {
        int currentYear = 2022;
        String userDateOfBirth = "1999";

        int dateOfBirth = Integer.parseInt(userDateOfBirth);
        //int Year = Integer.parseInt(currentYear);
        System.out.println(" age = " + (currentYear - dateOfBirth));

        String usersAgeWithPartialYear = "22.5";
        double ageWithPartialYear = Double.parseDouble(usersAgeWithPartialYear);
        System.out.println("The user say he's " + ageWithPartialYear);
    }

}