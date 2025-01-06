package CodePractice2.Codeday43_Collection.Comparable_Comparator;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Employee implements Comparable<Employee>{
    private Integer id;
    private String name;
    private String Skills;

    public Employee(int id, String name, String skills) {
        this.id = id;
        this.name = name;
        Skills = skills;
    }

    public Integer getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSkills() {
        return Skills;
    }

    public void setSkills(String skills) {
        Skills = skills;
    }

    @Override
    public String toString() {
        return  "id=" + id +
                ", name='" + name + '\'' +
                ", Skills='" + Skills + "\n";
    }

    @Override
    public int compareTo(Employee emp) {
        int i = (this.getId().compareTo(emp.getId()));
        return i;

    }
}
public class EmployeeTest {
    public static void main(String[] args) {
        List<Employee> list = new ArrayList<Employee>();
//        list.add(123,"Rama","java");
        list.add(new Employee(125,"Rama","Java"));
        list.add(new Employee(123,"Shyama","Python"));
        list.add(new Employee(125,"Sita","C#"));
        list.add(new Employee(126,"Geeta","Html"));
        Collections.sort(list);
        System.out.println(list);

    }
}
