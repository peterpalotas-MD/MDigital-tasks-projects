public class PasswordChecker {

    public boolean validatePassword(String password) {
        if (password.length() >= 8 &&
                password.matches(".*[a-zA-Z].*") &&
                password.matches(".*\\d.*")) {
            return true;
        }

        return false;

    }

}


