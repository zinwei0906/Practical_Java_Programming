/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practical3;

/**
 *
 * @author Wei
 */
public class Password {

    private String password = "";

    public Password(String password) throws InvalidPasswordException {
        String ErrorMessage = "";
        
        if (password == null || password.equals("")) {
            ErrorMessage += "\n\n\nInvalid Password : Password cannot be NULL or an Empty String. ";
        }

        if (password.length() < 7 && password.length() != 0) {
            ErrorMessage += "\n\n\nYour password should have at least 7 alpha-numeric characters. ";
        }

        int countNumber = 0;
        int countChar = 0;

        for (int num = 0; num < password.length(); num++) {
            char ch = password.charAt(num);
            if (Character.isDigit(ch)) {
                countNumber++;
            }
            if (Character.isLetter(ch)) {
                countChar++;
            }
        }
        if (countNumber == 0 && password.length() != 0) {
            ErrorMessage += "\nYour password should have at least 1 Digit.";
        }
        if (countChar == 0 && password.length() != 0) {
            ErrorMessage += "\nYour password should have at least 1 Letter.";
        }

        if (ErrorMessage == null || ErrorMessage.equals("")) {

        } else {
            throw new InvalidPasswordException(ErrorMessage);
        }

    }
}
