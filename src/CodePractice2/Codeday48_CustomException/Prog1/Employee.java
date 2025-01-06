package CodePractice2.Codeday48_CustomException.Prog1;

public class Employee {
    private String employeeName;
    private String nationality;
    private float salary;

    public Employee() { }

    public Employee(String employeeName, String nationality, float salary) {
        this.employeeName = employeeName;
        this.nationality = nationality;
        this.salary = salary;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }
}
