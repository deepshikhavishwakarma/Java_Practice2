package CodePractice2.Codeday46_MergeConcepts;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class filesinputoutput {
    public static void main(String args[]) throws IOException {
        InputStream obj = new FileInputStream("C:\\Users\\deeps\\Downloads\\Batch_36_Task_Date_20thNov.txt");
        System.out.print(obj.available());
    }
}
