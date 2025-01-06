package CodePractice2.Codeday45_Stream.day1.day6;

import CodePractice2.Codeday48_CustomException.Prog1.Employee;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Employee1{
    String name;
    int age;
    double salary ;
    String department;

    public Employee1(String name, int age, double salary, String department) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "Employee1{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                ", department='" + department + '\'' +
                '}';
    }
    public static Employee1 getHiked(Employee1 emp)
    {
        if(emp.age>25)
        {
            emp.setSalary(emp.getSalary()+emp.getSalary()*0.1);
        }
        return emp;
    }
}
public class IncreaseSalary{
    public static void main(String[] args) {
        List<Employee1> list = List.of(
                new Employee1("Deep",24,450000,"Software Development"),
                new Employee1("Radha",47,78900,"Mern Stack"),
                new Employee1("Sita",45,34000,"DB Manager"),
                new Employee1("Sohan",22,45000,"Finance"),
                new Employee1("Rahul",34,67000,"Technical Support")
        );
// Hike 10 %
        System.out.println("Hike 10 % in Salary . ");
      list.stream().map(Employee1::getHiked).toList().forEach(System.out::println);

     System.out.println("Highest Paid Salary.");
     
      /*  Map<String, List<Employee1>> l = list.stream().max(Comparator.comparing(Employee1::salary)).stream()
                .collect(Collectors.groupingBy(Employee1::department,Collectors.toList()));
        System.out.println(l);*/

        Employee1 employee1= list.stream().sorted(Comparator.comparingDouble(Employee1::getSalary).reversed()).findFirst().get();
        System.out.println(employee1);
    }
}
