//WAP for the following requirement:
//1. Create an outer class
//2. Create a static inner class
//3. SIC contains private Non Static data member,static method, and non static method.
//4. Outer class has main method Access all the data members and methods of SIC from main method in outer class.

package CodePractice2.Codeday31_InnerClass;

public class Teacher {
    static class Student{
        private int noOfStudent;

        public Student(int noOfStudent) {
            this.noOfStudent = noOfStudent;
        }

        public static void classSection(){
            System.out.println("Sixth Class Student");
        }
        public void noOFStud(){

            System.out.println("Number of Students "+noOfStudent);
        }
    }

    public static void main(String[] args) {
        Teacher.Student st = new Teacher.Student(23);//object creation of static inner classs.
        Student.classSection();//static method
        st.noOFStud();//non static method
    }
}
