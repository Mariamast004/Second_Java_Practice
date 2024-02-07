public class ConsoleChallenge {
    public static void main(String[] args) {
        int currentYear = 2022;
        System.out.println(getInputFromConsole(currentYear));
        System.out.println(getInputFromScanner(currentYear));
    }
    public static String getInputFromConsole(int currentYear){
        String name = System.console().readLine("Hi what's your name?");
        System.out.println("Hi " + name + " THanks !");

        return " So you are " + name;
    }
    public static String getInputFromScanner(int currentYear){
        return  "";
    }
}
