public class Main {

    public static void main(String[] args) {
        int count = 0;

        for ( int i = 10; i <= 50; i++) {
            if (isPrime(i)) {
                System.out.println("number" + i + "is a prime number ");
                count++;
            }
        }
        System.out.println("Total number of prime numbers between 10 and 50 is " + count);
    }
}
