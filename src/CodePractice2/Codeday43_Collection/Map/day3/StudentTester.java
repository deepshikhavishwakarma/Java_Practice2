package CodePractice2.Codeday43_Collection.Map.day3;

import java.util.*;

class Student implements  Comparable<Student>{
    private String name;
    private int id;
    private String course;

    public Student(String name, int id, String course) {
        this.name = name;
        this.id = id;
        this.course = course;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public String getCourse() {
        return course;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return id == student.id && Objects.equals(name, student.name) && Objects.equals(course, student.course);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, id, course);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", course='" + course + '\'' +
                '}';
    }

        @Override
        public int compareTo(Student o) {
            return this.getName().compareTo(o.getName());

        }

}
public class StudentTester {
    public static void main(String[] args) {
        HashMap<Student,String> hm = new HashMap<>();
        hm.put(new Student("",6,"English"),"English");
        hm.put(new Student("fDeep",7,"Physics"),"Physics");
        hm.put(new Student("sDeep",89,"Hindi"),"Hindi");
        hm.put(new Student("yDeep",9,"Math"),"Math");
        hm.put(new Student("wDeep",3,"History"),"History");
List<Student> list = new ArrayList<>(hm.keySet());
Collections.sort(list);
        System.out.println(list);
        System.out.println(hm);
        System.out.println();
    }
}
