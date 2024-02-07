import java.util.ArrayList;

record Customer(String name, ArrayList<Double> transactions){
    public  Customer(String name, double initialDeposit){
        this(name.toUpperCase(), new ArrayList<Double>(500));
        transactions.add(initialDeposit);
    }
}
public class  Bank{

    public static void main(String[] args) {
        Customer bob = new Customer("Bob S", 1000);
        System.out.println(bob);

        Bank bank = new Bank("Chase");
        bank.addNewCustomer("Jane A", 500.0);
        System.out.println(bank);




    }
    private String name;

    private ArrayList<Customer> customers = new ArrayList<>(5000);

    public Bank(String name){
        this.name = name;
    }

    @Override
    public String toString() {
        return "Bank{" +
                "name='" + name + '\'' +
                ", customers=" + customers +
                '}';
    }

    private  Customer getCustomer(String customerName){
        for (var customer : customers){
            if (customer.name().equalsIgnoreCase(customerName)){
                return  customer;
            }
        }
        System.out.printf("Customer (%s) wasn't found %n ", customers);
        return null;
    }
    private void addNewCustomer(String customerName, double initialDeposit) {
        if (getCustomer(customerName) == null) {
            Customer customer = new Customer(customerName, initialDeposit);
            customers.add(customer);
            System.out.println("New customer added: " + customer);
        }
    }
    public void  addTransaction(String name, double transactionAmount){
        Customer customer = getCustomer(name);
        if (customer != null){
            customer.transactions().add(transactionAmount);
        }
    }
}

