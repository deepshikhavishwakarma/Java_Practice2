package CodePractice2.Codeday32_InnerClass.schoolManagementSystem;

public class School {
    static class Student {
        String name;
        int id;
        int age;

        public Student(String name, int id, int age) {
            this.name = name;
            this.id = id;
            this.age = age;
        }

        public void displayStud() {
            System.out.println("Student name : " + name);
            System.out.println("Student Id   : " + id);
            if (age >= 18) {
                System.out.println("Student age  : " + age);
            } else {
                System.out.println("Student age  : " + age);
                System.out.println("Invalid age for graduation");
            }
        }
    }

    static class Teacher{
        String name;
        int id;
        int age;

        public Teacher(String name, int id, int age) {
            this.name = name;
            this.id = id;
            this.age = age;
        }
        public void displayTeacher(){
            if(age<60){
                System.out.println("----Teacher details----");
                System.out.println("Teacher name : "+name);
                System.out.println("Teacher Id   : "+id);
                System.out.println("Teacher age  : "+age);
            }else {
                System.out.println("Teacher age  : "+age);
                System.out.println("Teacher is eligible for retirement.");
            }
        }
    }
    public static void main(String[] args) {
    School.Teacher th = new School.Teacher("Deepali",1234,91);
    th.displayTeacher();
        System.out.println();
    School.Student sh = new School.Student("Shikha",19,11);
    sh.displayStud();
    }
}
