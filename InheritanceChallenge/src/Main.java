public class Main {
    public static void main(String[] args) {
        Employee tim = new Employee("Tim", "11/11/1985", 77005, "01/01/1985", "21/02/2022");

        System.out.println(tim);
        System.out.println("Age = " + tim.getAge());
       System.out.println("Pay = " + tim.getCollectPay());



        SalariedEmployee joe = new SalariedEmployee("Joe", "11/11/1985", 12345, "01/01/2020", "03/03/2020",35000);
        System.out.println(joe);
        //System.out.println(("Joe's payCheck = $ " + joe.collectPay()));



    }
}