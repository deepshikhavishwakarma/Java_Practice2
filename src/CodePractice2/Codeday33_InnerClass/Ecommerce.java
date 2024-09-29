package CodePractice2.Codeday33_InnerClass;

public class Ecommerce {
    class Clothing{
        String brand;
        String size;
        String color;
        double price ;

        public Clothing(String brand, String size, String color, double price) {
            this.brand = brand;
            this.size = size;
            this.color = color;
            this.price = price;
        }
        public double calculateDiscount(){
            double discountPercentage = 0.0;
            if(price>=1000 && price <2500){
                discountPercentage = price*0.1;
            }else if(price >=2500 && price <4500){
                discountPercentage = price*0.2;
            }else if(price >=4500){
                discountPercentage = price*0.3;
            }else{
               discountPercentage = 0;
            }
           return discountPercentage;
        }
        public void displayDetails(){
            System.out.println("\n------------CLOTHES------------");
            System.out.println("Brand Name        "+brand);
            System.out.println("Size              "+size);
            System.out.println("Colour            "+color);
            System.out.println("Price             "+price);
            System.out.println("Discount          "+calculateDiscount());
            System.out.println("Total Price       "+(price-calculateDiscount()));
        }

    }
    static class Laptop{
        String brand;
        String processor;
        int RAM;
        int storage;
        double price;

        public Laptop(String brand, String processor, int RAM, int storage, double price) {
            this.brand = brand;
            this.processor = processor;
            this.RAM = RAM;
            this.storage = storage;
            this.price = price;
        }
        public double calculateExtendedPrice(int warrantyYears){
            double extendedPrice = (price*0.1)*warrantyYears;
          return extendedPrice;
        }
        public void displayDetails(){
            System.out.println("\n------------LAPTOP------------");
            System.out.println("Brand Name        "+brand);
            System.out.println("Processor         "+processor);
            System.out.println("RAM               "+RAM+"GB");
            System.out.println("Storage           "+storage+"TB");
            System.out.println("Price             "+price);
            System.out.println("Warranty Year     "+2);
            System.out.println("Total Price       "+(price+calculateExtendedPrice(2)));
        }
    }


    public static void main(String[] args) {
        Ecommerce.Clothing cl = new Ecommerce().new Clothing("Nike","L","Brown",2500);
        cl.displayDetails();
        Ecommerce.Laptop l1 = new Ecommerce.Laptop("Dell","Zensor",4,1,45000);
        l1.displayDetails();
    }
}
