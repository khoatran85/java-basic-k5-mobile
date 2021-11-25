package Lesson8_1;

public class InternalLoginPage extends LoginPage {

    @Override
    protected String usernameSelector() {
        return "aaa";
    }

    @Override
    protected String passwordSelector() {
        return "bbb";
    }

    @Override
    protected String loginBtnSelector() {
        return "ccc";
    }
}
