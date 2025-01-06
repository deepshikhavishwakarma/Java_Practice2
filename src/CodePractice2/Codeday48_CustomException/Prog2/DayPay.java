package CodePractice2.Codeday48_CustomException.Prog2;

public class DayPay {
    private static double calculateSalary(Employee e){
        double pay=0;
        if(e.getHrs()<0){
            return -1;
        }
        if(e.getHrs()<=40 && e.getBasepay()>=8){
            pay =e.getHrs()*e.getBasepay();
        } else if (e.getHrs()>40 && e.getHrs()<60 && e.getBasepay()>=8) {
            pay = (40*e.getBasepay()+((e.getHrs()-40)*e.getBasepay()*1.5));
        }else{
            System.out.println("Working hrs should not be more than 60.");
            return 0.0;
        }
        return pay;
    }
    public static String displayEmployeeDetails(Employee e){
        return " Employee [Name: "+e.getName()+", id: "+e.getId()+",No. of hours worked: "+e.getHrs()+", Base Pay: "+e.getBasepay()+", Payed: "+calculateSalary(e)+" ]";
    }
}
