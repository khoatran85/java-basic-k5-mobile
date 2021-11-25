package Lesson8_1;

public class ExternalLoginPage extends LoginPage{
    @Override
    protected String usernameSelector() {
        return "ddd";
    }

    @Override
    protected String passwordSelector() {
        return "eee";
    }

    @Override
    protected String loginBtnSelector() {
        return "fff";
    }
}
