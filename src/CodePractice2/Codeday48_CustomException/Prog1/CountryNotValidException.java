package CodePractice2.Codeday48_CustomException.Prog1;

public class CountryNotValidException extends Exception{

    public CountryNotValidException() {
    }

    public CountryNotValidException(String message) {
        super(message);
    }
}
