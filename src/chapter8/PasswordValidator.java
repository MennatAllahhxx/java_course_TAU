package chapter8;

public class PasswordValidator {
    private String oldPassword;
    private String newPassword;
    private String userName;

    public String getOldPassword() {
        return oldPassword;
    }

    public void setOldPassword(String oldPassword) {
        this.oldPassword = oldPassword;
    }

    public String getNewPassword() {
        return newPassword;
    }

    public void setNewPassword(String newPassword) {
        this.newPassword = newPassword;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public PasswordValidator(String userName, String oldPassword, String newPassword) {
        setOldPassword(oldPassword);
        setNewPassword(newPassword);
        setUserName(userName);
    }

    public String validatePassword() {
        //, contain an uppercase letter, contain a special character.
        if(getNewPassword().length() < 8){
            return "password must be at least eight characters long";
        }

        if (getNewPassword().equals(getOldPassword())) {
            return "new password must be different from the old password";
        }

        if (getNewPassword().contains(getUserName())) {
            return "password mustn't contain the username";
        }

        boolean containsUpperCase= false;
        boolean containsSpecialCharacter= false;
        String message;

        for (int i = 0; i < getNewPassword().length(); i++) {
            if (!containsUpperCase && Character.isUpperCase(getNewPassword().charAt(i))) {
                containsUpperCase = true;
            }
            if (!containsSpecialCharacter && !Character.isAlphabetic(getNewPassword().charAt(i)) && !Character.isDigit(getNewPassword().charAt(i))) {
                containsSpecialCharacter = true;
            }

            if (containsUpperCase && containsSpecialCharacter) {
                setOldPassword(getNewPassword());
                return "password is valid and set successfully";
            }
        }

        if (!containsUpperCase) return "password must contain 1 uppercase letter";
        else return "password must contain at least 1 special character";
    }
}