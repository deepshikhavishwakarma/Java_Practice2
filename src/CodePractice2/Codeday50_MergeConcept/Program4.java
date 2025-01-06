package CodePractice2.Codeday50_MergeConcept;

class maths{
    public int fun(int ii){
        return(ii > 0 ? ii :ii * -1);
    }
    public long fun(long ll){
        return(ll > 0 ? ll :ll * -1);
    }
    public double fun( double dd){
        return(dd > 0 ? dd :dd * -1);
    }
}
public class Program4
{
    public static void main(String[] args){
        maths obj = new maths();
        int i = -25;
        int j ;
        long l = -100000l ;
        long m;
        double d = -12.34;
        double e;
        j = obj.fun(i);//25
        m = obj.fun(l);//100000l
        e = obj.fun(d);//12.34
        System.out.println(j + "  " + m + "  " + e);

    }
}
