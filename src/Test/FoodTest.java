package Test;

class Food{
    public String executeRecipe(){
        return "Preparing the ingredients for cooking...";
    }
}
class Pizza extends Food{
    @Override
    public String executeRecipe(){
        return "Adding cheese, sauce, and toppings...";
    }
}
class Burger extends Food{
    @Override
    public String executeRecipe(){
        return "Grilling the patties and assembling the burger...";
    }
}
class Salad extends Food{
    @Override
    public String executeRecipe(){
        return "Mixing fresh vegetables and dressing...";
    }
}


public class FoodTest {
    public static void main(String[] args) {
        Salad s1 = new Salad();
        Burger b1 = new Burger();
        Pizza p1 = new Pizza();
        Food f1 = new Food();
        System.out.println(f1.executeRecipe()+"\nI am food");
        System.out.println();
        System.out.println(p1.executeRecipe()+"\nI am a pizza");
        System.out.println();
        System.out.println(b1.executeRecipe()+"\nI am a burger");
        System.out.println();
        System.out.println(s1.executeRecipe()+"\nI am a salad");
        System.out.println();

    }
}
