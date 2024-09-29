package CodePractice2.Codeday34_Polymorphism;
class Employee{
    protected String name;
    protected String role;

    public Employee(String name,String role) {
        this.name = name;
        this.role = role;
    }
    public void displayInfo(){
        System.out.println("Employee Name    "+name);
        System.out.println("Employee Role    "+role);
    }
    public double calculateSalary(){
        return 0.0;
    }
}
class Manager extends Employee{
    private double baseSalary;
    private double bonus;

    public Manager(String name, String role, double baseSalary, double bonus) {
        super(name, role);
        this.baseSalary = baseSalary;
        this.bonus = bonus;
    }

    @Override
    public double calculateSalary(){
        return (bonus+baseSalary);
    }
    @Override
    public void displayInfo(){
        System.out.println("Employee Name      "+name);
        System.out.println("Employee Role      "+role);
        System.out.println("Employee Salary    "+baseSalary);
        System.out.println("Employee Bonus     "+bonus);
        System.out.println("Total Salary       "+calculateSalary());
    }

}
class Programmer extends Employee{
    private double baseSalary;
    private double overTimePay;

    public Programmer(String name, String role, double baseSalary, double overTimePay) {
        super(name, role);
        this.baseSalary = baseSalary;
        this.overTimePay = overTimePay;
    }
    @Override
    public double calculateSalary(){
        return (baseSalary+overTimePay);
    }

    @Override
    public void displayInfo(){
        System.out.println("Employee Name      "+name);
        System.out.println("Employee Role      "+role);
        System.out.println("Employee Salary    "+baseSalary);
        System.out.println("Employee Bonus     "+overTimePay);
        System.out.println("Total Salary       "+calculateSalary());
    }
}
public class EmployeeTest {
    public static void main(String[] args) {
        System.out.println("----------MAnager DETAILS----------");
        Employee e1 = new Employee("Deepshikha","Developer");
        //e1.displayInfo();
        Manager m1 = new Manager("Deepshikha","Developer",50000,5000);
        m1.displayInfo();
        System.out.println();
        System.out.println("----------PROGRAMMER DETAILS----------");
        Programmer p1 = new Programmer("Kirti","Automation",30000,4500);
       // e1.displayInfo();
        p1.displayInfo();
    }
}
