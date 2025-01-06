package CodePractice2.Codeday48_CustomException.Prog2;

class Employee {
    private String name;
    private int id;
    private int hrs;
    private int basepay;

    public Employee(String name, int id, int hrs, int basepay) {
        this.name = name;
        this.id = id;
        this.hrs = hrs;
        this.basepay = basepay;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public int getHrs() {
        return hrs;
    }

    public int getBasepay() {
        return basepay;
    }
}
public class EmployeeTester{
    public static void main(String[] args) {
        Employee e = new Employee("Deep",123,50,17);
        System.out.println(DayPay.displayEmployeeDetails(e));
    }
}
