package CodePractice2.Codeday48_CustomException.Prog1;

public class TaxSimulator {
    public static void main(String[] args)  {
        Employee e = new Employee("Deep","Indian",500000);
        try {
            System.out.println("Total tax: " + TaxCalculator.calculateTax(e));
        }
        catch(CountryNotValidException | NameNotValidException | NotEligibleForTaxException e1){
            System.err.println(e1.getMessage());
        }
    }
}
