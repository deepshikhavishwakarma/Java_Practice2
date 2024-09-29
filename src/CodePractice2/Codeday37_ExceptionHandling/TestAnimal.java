package CodePractice2.Codeday37_ExceptionHandling;

import org.w3c.dom.ls.LSOutput;

class Animal{
    private String name;
    private int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                '}';
    }
}
class Dog extends Animal{
    public Dog(String name, int age) {
        super(name, age);
    }

    public void printDogDetails(Animal e){
        System.out.println("Dog name "+e.getName());
        System.out.println("Dog name "+e.getAge());
    }

    @Override
    public String toString() {
        return "Dog{}";
    }
}
public class TestAnimal {
    public static void main(String[] args) {
        Animal a1 = new Dog("Tommy",5);
          Dog d=(Dog)a1;
          d.printDogDetails(d);





    }





}
