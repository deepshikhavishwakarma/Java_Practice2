package CodePractice2.Codeday45_Stream.day1.day3;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Person{
    private String name;
    private int age;
    private String gender;

    public Person(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                '}';
    }
}
public class PersonTestor {
    public static void main(String[] args) {
        List<Person> list = new ArrayList<>();
        list.add(new Person("Bob",30,"Male"));
        list.add(new Person("Charlie",20,"Male"));
        list.add(new Person("David",23,"Male"));
        list.add(new Person("Frank",25,"Male"));
        list.add(new Person("Alice",25,"Female"));
        list.add(new Person("Eve",28,"Female"));
        list.add(new Person("Grace",26,"Female"));
//       list.stream().anyMatch()
       Map<String,List<Person>> lp= list.stream().collect(Collectors.groupingBy(Person::getGender,Collectors.toList()));
      lp.forEach((x,y)-> System.out.println(x+"  \n"+y));
    }
}
