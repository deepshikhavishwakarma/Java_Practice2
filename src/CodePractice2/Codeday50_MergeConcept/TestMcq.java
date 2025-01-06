package CodePractice2.Codeday50_MergeConcept;

interface Sample {
    int x = 20;
    void m1();
}

class Example {
    Sample s;

    public Example(Sample s) {//sample obj
        super();
        this.s = s;
    }

}

public class TestMcq {
    public static void main(String[] args) {
        Sample s = () -> System.out.println(Sample.x);//20
        Example e = new Example(s);
        e.s = null;
        System.out.println(Sample.x);//20
        s.m1();//20
    }
}