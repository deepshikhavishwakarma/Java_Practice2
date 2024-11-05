package CodePractice2.Codeday43_Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class EmpComparator {
    private Integer id;
    private String name;
    private Double salary;

    public EmpComparator(Integer id, String name, Double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "EmpComparator{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary='" + salary + '\'' +
                '}';
    }
}
public class TestComparator  {
    public static void main(String[] args) {
        List<EmpComparator> list = new ArrayList<EmpComparator>();

        list.add(new EmpComparator(123,"Rama",23456.9));
        list.add(new EmpComparator(120,"Shyama",344456.9));
        list.add(new EmpComparator(110,"Sita",356456.9));
        list.add(new EmpComparator(150,"Naman",67658.90));


        Comparator<EmpComparator> em = new Comparator<EmpComparator>() {

            @Override
            public int compare(EmpComparator o1, EmpComparator o2) {
                return o1.getId() - o2.getId();
            }
        };

        Comparator<EmpComparator> em1 = new Comparator<EmpComparator>() { //Using Annonymous Inner class

            @Override
            public int compare(EmpComparator o1, EmpComparator o2) {
                return o1.getName().compareTo(o2.getName());
            }
        };
        Comparator<EmpComparator> em2 =(EmpComparator o1, EmpComparator o2)-> {  //Using Lambda expression
                return o1.getSalary().compareTo(o2.getSalary());
            };
//        list.forEach(list,em);

        Collections.sort(list,em);
        System.out.println(list);

    }
}
