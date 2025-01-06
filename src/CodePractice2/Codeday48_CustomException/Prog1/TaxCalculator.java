package CodePractice2.Codeday48_CustomException.Prog1;

public class TaxCalculator {
    public static double calculateTax(Employee e1) throws CountryNotValidException, NameNotValidException, NotEligibleForTaxException {
      //  Employee e1=new Employee();

        if(!e1.getNationality().equalsIgnoreCase("Indian")){
            throw new CountryNotValidException(Messages.countrymsg);
        }
        else if (e1.getEmployeeName().trim().isEmpty()|| e1.getEmployeeName()==null) {
            throw new NameNotValidException(Messages.namemsg);
        }
        double tax=0;
        if(e1.getSalary()>=100000){
            tax=(e1.getSalary()*8/100);
        }else if(e1.getSalary()>=50000 && e1.getSalary()<100000){
            tax=(e1.getSalary()*6/100);
        }else if(e1.getSalary()>=30000 && e1.getSalary()<50000){
            tax=(e1.getSalary()*5/100);
        }else if(e1.getSalary()>=10000 && e1.getSalary()<30000){
            tax=(e1.getSalary()*4/100);
        }else{
            throw new NotEligibleForTaxException(Messages.taxmsg);
        }
        return tax;
    }
}
