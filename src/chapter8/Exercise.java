package chapter8;

public class Exercise {
    public static void main(String[] args) {
        PasswordValidator passwordValidator;

        passwordValidator= new PasswordValidator("mennahassan", "Pass123-", "passWord12-");
        System.out.println(passwordValidator.validatePassword());

        passwordValidator= new PasswordValidator("mennahassan", "Pass123-", "mennahassan123-");
        System.out.println(passwordValidator.validatePassword());

        passwordValidator= new PasswordValidator("mennahassan", "Pass123-", "pass");
        System.out.println(passwordValidator.validatePassword());

        passwordValidator= new PasswordValidator("mennahassan", "Pass123-", "Pass123-");
        System.out.println(passwordValidator.validatePassword());

        passwordValidator= new PasswordValidator("mennahassan", "Pass123-", "passWord12");
        System.out.println(passwordValidator.validatePassword());

        passwordValidator= new PasswordValidator("mennahassan", "Pass123-", "password12-");
        System.out.println(passwordValidator.validatePassword());
    }
}