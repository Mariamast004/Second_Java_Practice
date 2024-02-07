import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int even = 0, Odd = 0;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter The Limit : ");
        int numbers = in.nextInt();
        int a[] = new int[numbers];
        for (int i = 0; i < numbers; i++){
            System.out.println("Enter a[ " + i + " ] value : ");
            a[i] = in.nextInt();
        }
        for (int element : a){
            if (element % 2 == 0){
                even++;
            }
        }
        else {
            odd++;

        }
    }
}