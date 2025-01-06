package CodePractice2.Codeday44_Serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class StudentDataDeserilization {
    public static void main(String[] args) throws ClassNotFoundException {

        FileInputStream fis=null;
        ObjectInputStream ois=null;

        try {
            fis=new FileInputStream("F:\\StudentValueData");
            try {
                ois=new ObjectInputStream(fis);
                Student s= (Student) ois.readObject();
                System.out.println(s);
            } catch (IOException e) {

                e.printStackTrace();
            }

        } catch (FileNotFoundException e) {

            e.printStackTrace();
        }
    }
}
