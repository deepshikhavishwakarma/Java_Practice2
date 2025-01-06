package CodePractice2.Codeday45_Stream.day1;

import java.util.List;

class Student{
    String name;
    String course;

    public Student(String name, String course) {
        this.name = name;
        this.course = course;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", course='" + course + '\'' +
                '}';
    }
}
public class StudentFilter {
    public static void main(String[] args) {
        List<Student> students =  List.of((new Student("Alice", "Java")),
        (new Student("Bob", "Python")),(new Student("Charlie", "Java")),
                (new Student("David", "C++")),
        (new Student("Eve", "JavaScript")));
        students.stream().filter(x->x.getCourse().equals("Java")).forEach(System.out::println);
    }
}
