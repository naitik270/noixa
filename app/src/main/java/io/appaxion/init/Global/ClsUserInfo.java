package io.appaxion.init.Global;

import io.appaxion.init.ApiClasses.ClsLoginParams;

public class ClsUserInfo {


    String UserName = "";

    public String getLoginStatus() {
        return LoginStatus;
    }

    public void setLoginStatus(String loginStatus) {
        LoginStatus = loginStatus;
    }

    String LoginStatus = "";

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String userName) {
        UserName = userName;
    }


}
