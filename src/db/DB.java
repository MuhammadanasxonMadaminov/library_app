package db;

import bean.UserBean;

import java.util.ArrayList;
import java.util.List;

public class DB {
    private final static List<UserBean> users = new ArrayList<UserBean>();

    public static UserBean session = null;
    public static UserBean addUser(UserBean bean) {
        if(checkUserExistByLogin(bean.getLogin())) {
            return null;
        }
        bean.setId(users.size());
        users.add(bean);
        return bean;
    }

    public static UserBean getUser(UserBean bean) {
        for(UserBean user : users) {
            if(user.getLogin().equals(bean.getLogin()) && user.getPassword().equals(bean.getPassword())) {
                return  user;
            }
        }
        return null;
    }

    public static boolean checkUserExistByLogin(String login) {
        for(UserBean user : users) {
            if(user.getLogin().equals(login)) {
                return true;
            }
        }
        return false;
    }
}
