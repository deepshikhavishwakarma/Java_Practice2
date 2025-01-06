package CodePractice2.Codeday48_CustomException.Prog1;

public class NameNotValidException extends Exception{
    public NameNotValidException() {
    }

    public NameNotValidException(String message) {
        super(message);
    }
}
