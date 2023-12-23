package resource;

import bean.ApiResponce;
import bean.UserBean;
import db.DB;

public class AuthResource {
    public ApiResponce register(UserBean bean) {
            UserBean user = DB.addUser(bean);

            if (user==null) {
                return  new ApiResponce(400,"Error", null);
            }else {
                return  new ApiResponce(200,"Success", user);
            }
    }


    public  ApiResponce login(UserBean bean) {
        UserBean user = DB.getUser(bean);
        if (user==null) {
            return  new ApiResponce(400,"Error", null);
        }else {
            return  new ApiResponce(200,"Success", user);
        }
    }



}
