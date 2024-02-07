public class Employee extends Worker {
    private long employeeId;
    private String hireDate;




    public Employee(String name, String birthDate, long employeeId, String endDate,  String hireDate) {
        super(name, birthDate, endDate);
        this.employeeId = employeeId;
        this.hireDate = hireDate;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeId=" + employeeId +
                ", hireDate='" + hireDate + '\'' +
                '}';
    }



    public String getCollectPay() {
        return "";
    }
}
