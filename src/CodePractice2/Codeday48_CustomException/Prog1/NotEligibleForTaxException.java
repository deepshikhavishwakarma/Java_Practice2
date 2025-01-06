package CodePractice2.Codeday48_CustomException.Prog1;

public class NotEligibleForTaxException extends Exception{
    public NotEligibleForTaxException() {
    }

    public NotEligibleForTaxException(String message) {
        super(message);
    }
}
