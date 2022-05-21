package com.practical.test.demo.Global;

import com.practical.test.demo.ApiClasses.ClsLoginParams;

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
