package CodePractice2.Codeday45_Stream.day1.day5;

import java.util.List;
import java.util.stream.Collectors;

record Employee(Integer Id, String name, Integer age, Double salary) {

}

public class EmployeeTest {
    public static void main(String[] args) {
        List<Employee> employees = List.of(
                new Employee(111, "Deep", 24, 86000.0),
                new Employee(222, "Shikha", 35, 4500.0),
                new Employee(333, "Rama", 44, 45600.0),
                new Employee(444, "Sudha", 21, 67000.0));

        //Stores Name into single list
        // List<String> collect = employees.stream().map(x -> x.name()).collect(Collectors.toList());

        //sort by age in descending order
        //List<Employee> collect = employees.stream().sorted((x1, x2) -> x2.age().compareTo(x1.age())).collect(Collectors.toList());

        // all names in Uppercase.
        //List<String> collect = employees.stream().map(x -> x.name().toUpperCase()).collect(Collectors.toList());

          //Sort data based on salary
          //List<Employee> collect = employees.stream().sorted((x1, x2) -> x2.salary().compareTo(x1.salary())).collect(Collectors.toList());

          //name in lowerr case
//        List<String> collect = employees.stream().map(x -> x.name().toLowerCase()).collect(Collectors.toList());

        // salary >30000
//        employees.stream().filter(x->x.salary()>30000).forEach(System.out::println);

        //First index in uppercase of given string
        List<String> collect = employees.stream().map(x -> x.name().toUpperCase().charAt(0) + x.name().substring(1)).collect(Collectors.toList());
        collect.forEach(System.out::println);
    }
}
