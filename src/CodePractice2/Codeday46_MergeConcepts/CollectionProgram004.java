package CodePractice2.Codeday46_MergeConcepts;

import java.util.Vector;

class Employee{
    int id;
    String name;
    public Employee(int id, String name) {
        super();
        this.id = id;
        this.name = name;
    }
    @Override
    public String toString() {
        return "Employee [id=" + id + ", name=" + name + "]";
    }


}
public class CollectionProgram004 {
    public static void main(String[] args) {
        Vector<Object> v1=new Vector();
        v1.add(10);
        v1.add(new Employee(1,"abc"));
        v1.add("hello");

        System.out.print(v1.removeElement(10)+" ");
        System.out.print(v1.removeElement(new Employee(1,"abc")));


    }
}