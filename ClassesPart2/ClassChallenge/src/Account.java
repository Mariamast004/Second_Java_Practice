public class Account {

    private  String numbers;
    private double balance;
    private  String customerName;
    private String customerEmail;
    private String customerPhone;

    public Account(){
        System.out.println("Empty constructor called ");
    }
    public Account(String numbers, double balance,String customerName,String email, String phone){
        System.out.println("Account constructor with parameters called ");
        this.numbers = numbers;
        this.balance = balance;
        this.customerName = customerName;
        this.customerEmail = email;
        this.customerPhone = phone;
    }

    public Account(String customerName, String customerEmail, String customerPhone) {
        this("9999", 100.55, customerName, customerEmail, customerPhone);
       // this.customerName = customerName;
        //this.customerEmail = customerEmail;
        //this.customerPhone = customerPhone;
    }

    public void depositFunds(double depositAmount){
        balance += depositAmount;
        System.out.println("Deposit of $ " + "made. New balance is $ " + balance);

    }
    public void withdrawFunds(double withdrawalAnount){
        if (balance - withdrawalAnount < 0){
            System.out.println("Insufficient Funds! You only have $ " + balance + " in your account");
        }
        else {
            balance -= withdrawalAnount;
            System.out.println("withdrawal of $ " + withdrawalAnount + " processed, Remaining balance = $ " + balance);
        }
    }

    public String getNumbers() {
        return numbers;
    }

    public void setNumbers(String numbers) {
        this.numbers = numbers;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public String getCustomerPhone() {
        return customerPhone;
    }

    public void setCustomerPhone(String customerPhone) {
        this.customerPhone = customerPhone;
    }
}
