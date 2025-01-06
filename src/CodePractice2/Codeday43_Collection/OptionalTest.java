package CodePractice2.Codeday43_Collection;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class OptionalTest {
    public static void main(String[] args) {
        List<Optional> l1 = new ArrayList<Optional>();
//      l1.add(null);
        l1.add(Optional.of("MyString"));
        l1.add(Optional.of("Java"));
        l1.add(Optional.of("Python"));
        l1.add(Optional.of("Devops"));
        l1.add(Optional.of("Spring"));
        l1.add(Optional.of("Html"));
        for (Optional<String> value:l1 ) {
            if(value.isPresent()){
                System.out.println(value.get().toUpperCase());
            }else{
                System.out.println("Value not found");
            }

        }
    }
}
