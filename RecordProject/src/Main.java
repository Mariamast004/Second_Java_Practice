

public class Main {
    public static void main(String[] args) {

        Student student = null;
        for (int i = 1; i <= 5; i++) {
            student = new Student("592300" + i,
                    switch (i) {
                        case 1 -> "Mary";
                        case 2 -> "Carol";
                        case 3 -> "Tim";
                        case 4 -> "Harry";
                        case 5 -> " Lisa";
                        case 6 -> "Mama";

                        default -> "invalid input";

                    },
                    "05/11/1985",
                    "Java Master class"


            );
        }
        System.out.println(student);


    }
}