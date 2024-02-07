public class SalariedEmployee extends Employee {
      double annualSalary;
     boolean isRetired;


    public SalariedEmployee(String name, String birthDate, long employeeId, String endDate, String hireDate, double annualSalary) {
        super(name, birthDate, employeeId, endDate, hireDate);
        this.annualSalary = annualSalary;
    }
   // @Override
    ////public double collectPay(){
      //  return (int) annualSalary/26;

}
