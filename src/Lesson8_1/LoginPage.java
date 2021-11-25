package Lesson8_1;

public abstract class LoginPage {

    protected void login(){
        System.out.println("usernameSelector" + usernameSelector());
        System.out.println("passwordSelector" + passwordSelector());
        System.out.println("loginBtnSelector" + loginBtnSelector());
    }

    protected abstract String usernameSelector();
    protected abstract String passwordSelector();
    protected abstract String loginBtnSelector();
}
