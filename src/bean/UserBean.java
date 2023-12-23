package bean;

import bean.BaseIdBean;

public class UserBean  extends BaseIdBean {
    private String login;
    private String password;

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public UserBean() {
    }

    public UserBean(String login, String password) {
        this.login = login;
        this.password = password;
    }
}
