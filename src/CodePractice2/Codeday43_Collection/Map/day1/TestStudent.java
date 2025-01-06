package CodePractice2.Codeday43_Collection.Map.day1;

import java.util.*;

class Student{
    int id;
    String name;
    int age;

    public Student(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    @Override
    public int hashCode() {
        return id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return id == student.id && age == student.age && Objects.equals(name, student.name);
    }
}
public class TestStudent {
    public static void main(String[] args) {
        HashMap<Student,Integer> map1  = new HashMap<>();
        Student s1 = new Student(123,"Deep",89);
        Student s2 = new Student(234,"Shikha",90);
        Student s3 = new Student(234,"Shikha",90);
        map1.put(s1,1);
        map1.put(s2,2);
        map1.put(s3,3);
        for (Map.Entry<Student,Integer> entry:map1.entrySet()) {
            Student s4 = entry.getKey();
          int s5 = entry.getValue();
//          String s5 = entry.getValue();
            System.out.println("Key Details  "+s4);
            System.out.println(s4.id+" "+s4.name+" "+s4.age);

        }

//        System.out.println(map1.get("id"));

//        Set set = map1.entrySet();
//        Iterator itr = set.iterator();
//        while ((itr.hasNext())){
//            Map.Entry entry= (Map.Entry)itr.next();
//            System.out.println(entry.getKey() );
//
//        }
    }
}
