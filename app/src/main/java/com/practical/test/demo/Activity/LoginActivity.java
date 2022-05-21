package com.practical.test.demo.Activity;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;

import com.google.gson.Gson;
import com.practical.test.demo.ApiClasses.ApiPostViewModel;
import com.practical.test.demo.ApiClasses.ClsLoginParams;
import com.practical.test.demo.Global.ClsGlobal;
import com.practical.test.demo.Global.ClsUserInfo;
import com.practical.test.demo.R;

public class LoginActivity extends AppCompatActivity {


    Button btn_login;
    EditText edt_login, edt_pass;
    ApiPostViewModel mApiPostViewModel;
    private ProgressDialog pd;
    ClsUserInfo obj;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        mApiPostViewModel = new ViewModelProvider(this).get(ApiPostViewModel.class);
        obj = new ClsUserInfo();
        obj = ClsGlobal.getUserInfo(LoginActivity.this);
        Log.d("--Name--", "Status: " + obj.getLoginStatus());
        initView();

      /*  if (obj.getLoginStatus().equalsIgnoreCase("ACTIVE")) {
            ClsGlobal.setUserInfo(obj, LoginActivity.this);
            startActivity(new Intent(getApplicationContext(), MainActivity.class));
        }*/
    }

    void initView() {
        btn_login = findViewById(R.id.btn_login);
        edt_login = findViewById(R.id.edt_login);
        edt_pass = findViewById(R.id.edt_pass);

        btn_login.setOnClickListener(view -> {
            if (validation(view)) {
                try {
                    LoginAPI(view);
                } catch (Exception e) {
                    Log.d("--login--", "Exception: " + e.getMessage());
                }
            }
        });
    }


    private Boolean validation(View view) {

        if (edt_login.getText() == null || edt_login.getText().toString().trim().isEmpty()) {
            ClsGlobal.errorMsg(this, view, "User Name is required...!", 0);
            edt_login.requestFocus();
            return false;
        }
        if (edt_pass.getText() == null || edt_pass.getText().toString().trim().isEmpty()) {
            ClsGlobal.errorMsg(this, view, "Password is required...!", 0);
            edt_pass.requestFocus();
            return false;
        }
        return true;
    }

    void LoginAPI(View view) {
        pd = ClsGlobal._prProgressDialog(this, "Check User Name & Password...!", false);
        pd.show();

        ClsLoginParams objParams = new ClsLoginParams();
        objParams.setApiKey(getResources().getString(R.string.api_key));
        objParams.setMethod(getResources().getString(R.string.set_method));
        objParams.setSessionTimeout(320000000);
        objParams.setUsername(edt_login.getText().toString().trim());
        objParams.setPassword(edt_pass.getText().toString().trim());
        objParams.setOneSignalId(getResources().getString(R.string.set_one_signal_id));
        objParams.setAppLogin(true);
        objParams.setDirection(getResources().getString(R.string.direction));
        objParams.setUserAgent("test");
        objParams.setUserIp(getResources().getString(R.string.set_user_ip));
        objParams.setClientType(getResources().getString(R.string.client_type));

        Log.d("--login--", "LoginAPI: " + new Gson().toJson(objParams));

        mApiPostViewModel.callLoginAPIModel(objParams).observe(this, mObj -> {
            Log.d("--login--", "LoginAPI: " + mObj.getResult());
            if (mObj.getResult() != null) {
                if (mObj.getResult().equalsIgnoreCase("OK")) {
                    ClsGlobal.errorMsg(this, view, "Login successfully...!", 1);
                    obj.setUserName(mObj.getFullName());
                    obj.setLoginStatus("ACTIVE");
                    ClsGlobal.setUserInfo(obj, LoginActivity.this);
                    startActivity(new Intent(getApplicationContext(), DisplayActivity.class)
                            .putExtra("passObj", mObj));
                } else {
                    ClsGlobal.errorMsg(this, view, mObj.getError(), 0);
                }
            }
            pd.dismiss();
        });
    }
}