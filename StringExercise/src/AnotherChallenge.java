import java.util.Scanner;

public class AnotherChallenge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your name ?" );
        String name  = scanner.nextLine();

        System.out.println("Hello %s, old  are you? ");

        int age = scanner.nextInt();

        System.out.println("%d is an execellent age to start programming ." + age);

        scanner.close();

    }
}
