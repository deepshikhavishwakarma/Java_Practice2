package CodePractice2.Codeday47_MethodOverloading_Overriding;

class Program03{
    public void display(int x, float y){
        System.out.println(x+y);
    }
    public double display(int p, double q){
        return (p+q);
    }
    public static void main(String args[]){
        Program03 program = new Program03();
        program.display(4, 5.0);
        System.out.println(program.display(4,5.0));
    }
}

