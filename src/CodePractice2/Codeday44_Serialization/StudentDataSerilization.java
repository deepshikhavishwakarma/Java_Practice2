package CodePractice2.Codeday44_Serialization;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class StudentDataSerilization {
    public static void main(String[] args) {
        Student s=new Student("Def", 102, "mumbai");

        FileOutputStream fos=null;
        ObjectOutputStream oos=null;

        try {
            fos =new FileOutputStream
                    ("F:\\StudentValueData");
            try {
                oos=new ObjectOutputStream(fos);
                oos.writeObject(s);
                System.out.println("Data is serilized");
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
}

