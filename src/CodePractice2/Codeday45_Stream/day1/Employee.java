package CodePractice2.Codeday45_Stream.day1;

import java.util.ArrayList;
import java.util.List;

public class Employee {
    String id;
    String name;
    double salary;

    public Employee(String id, String name,double salary) {
        this.id = id;
        this.name = name;
        this.salary=salary;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }

    public static void main(String[] args) {
        List<Employee> list=new ArrayList<>();
        list.add(new Employee("101","Deep",53945.4));
        list.add(new Employee("103","vaishali",83434.9));
        list.add(new Employee("102","shikha",24244.8));
        list.add(new Employee("104","siddhi",23423.6));
        list.add(new Employee("106","reena",31121.34));
        list.stream().filter(x-> x.getSalary()>30000).forEach(System.out::println);
    }

}
