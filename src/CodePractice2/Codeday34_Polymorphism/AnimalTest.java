package CodePractice2.Codeday34_Polymorphism;

 class Animal {
  public void sound(){
      System.out.println("Animal have different sound.");
  }
}
class Bird extends Animal{
     @Override
    public void sound(){
        System.out.println("Birds sound is too sweet.");
    }
}
class Cat extends Animal{
    @Override
    public void sound(){
        System.out.println("Cat sound miaow .");
    }
}
public class AnimalTest{
    public static void main(String[] args) {
     Bird b1 = new Bird();
     b1.sound();
     Cat c1 = new Cat();
     c1.sound();

    }
}


