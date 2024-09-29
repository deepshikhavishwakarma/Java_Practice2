package CodePractice2.Codeday39_ExceptionHandling.PasswordValidationSystem;

public class PasswordValidator {

    public static boolean validatePassword(String password) throws InvalidPasswordException {
        if((password.length()==8) && (password.contains("$")||password.contains("#")||password.contains("&")||password.contains("@"))){
          return true;
        }else if(password.contains(" ")){
            return false;
        } else {
            return true;
        }
//        return true;
    }
}
