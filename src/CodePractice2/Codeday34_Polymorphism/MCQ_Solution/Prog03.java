package CodePractice2.Codeday34_Polymorphism.MCQ_Solution;

class Prog03{
    public void display1(int x, float y){
        System.out.println(x+y);
    }
    public double display(int p, float q){
        return (p+q);
    }
    public static void main(String args[]){
        Prog03 program = new Prog03();
        program.display(4, 5.0f);
        System.out.println(program.display(4, 5.0f));
    }
}