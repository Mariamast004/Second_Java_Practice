public class Main {
    public static void main(String[] args) {
        Account bobsAccount = new Account(" 12345 ",  1000.00 , " Bob Brown ", "myemail@bob.com", "099326441");

       // bobsAccount.setNumbers("12345");
        //bobsAccount.setBalance(1000.00);
        //bobsAccount.setCustomerName("Bob Brown");
        //bobsAccount.setCustomerEmail("myemail@bob.com");
        //bobsAccount.setCustomerPhone("099326441");



        bobsAccount.withdrawFunds(100.0);
        bobsAccount.depositFunds(250);
        bobsAccount.withdrawFunds(50);

        bobsAccount.withdrawFunds(200);

        bobsAccount.depositFunds(100);
        bobsAccount.withdrawFunds(45.55);
        bobsAccount.withdrawFunds(54.46);
        bobsAccount.withdrawFunds(54.45);

        Account MamasAccount = new Account("Mama", "mama@gmail.com", "12345");
        System.out.println("AccountNo:" + MamasAccount.getNumbers() + "; name " + MamasAccount.getCustomerName());
    }
}