package CodePractice2.Codeday45_Stream.day1.day6;

import CodePractice2.Codeday48_CustomException.Prog1.Employee;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

record Employee1(String name,int age,double salary ,String department){
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
      list.stream().filter(x->x.age()>25).map(x->x.salary()*0.1+x.salary()).toList().forEach(System.out::println);

        System.out.println("Highest Paid Salary.");
        Map<String, List<Employee1>> l =list.stream().max(Comparator.comparing(Employee1::salary)).stream()
                .collect(Collectors.groupingBy(Employee1::department,Collectors.toList()));
        System.out.println(l);
    }
}
