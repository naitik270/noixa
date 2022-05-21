package io.appaxion.init.Activity;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.gson.Gson;
import io.appaxion.init.Adapter.DisplayDataAdp;
import io.appaxion.init.ApiClasses.ClsLoginParams;
import io.appaxion.init.Global.ClsGlobal;
import io.appaxion.init.Global.ClsNameVal;
import io.appaxion.init.Global.ClsUserInfo;
import io.appaxion.init.R;

import java.util.ArrayList;
import java.util.List;

public class DisplayActivity extends AppCompatActivity {

    RecyclerView rv_displayUser_description;
    ClsLoginParams passObj;
    ImageView iv_logout, iv_back;
    ClsUserInfo userInfo;
    TextView txt_company_name;
    private List<ClsNameVal> mList;
    DisplayDataAdp mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        userInfo = new ClsUserInfo();
        userInfo = ClsGlobal.getUserInfo(DisplayActivity.this);

        txt_company_name = findViewById(R.id.txt_company_name);
        iv_logout = findViewById(R.id.iv_logout);
        iv_back = findViewById(R.id.iv_back);
        rv_displayUser_description = findViewById(R.id.rv_displayUser_description);
        rv_displayUser_description.setLayoutManager(new LinearLayoutManager(DisplayActivity.this));
        rv_displayUser_description.addItemDecoration(new DividerItemDecoration(DisplayActivity.this,
                DividerItemDecoration.VERTICAL));

        passObj = (ClsLoginParams) getIntent().getSerializableExtra("passObj");
        Log.d("--login--", "passObj: " + new Gson().toJson(passObj));
        txt_company_name.setText("User Token Information");
        mAdapter = new DisplayDataAdp(DisplayActivity.this);

        iv_logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                LogoutAlert();
            }
        });
        iv_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });
        viewData();
    }


    void viewData() {
        mList = new ArrayList<>();
        mList.add(new ClsNameVal("Token: ", passObj.getSessionToken()));
        mAdapter.addItemList(mList);
        rv_displayUser_description.setAdapter(mAdapter);
    }


    void LogoutAlert() {
        LayoutInflater inflater = getLayoutInflater();
        View alertLayout = inflater.inflate(R.layout.message_logout_prompt, null);

        TextView tvMessage = alertLayout.findViewById(R.id.tvPromptMessage);

        AlertDialog alertDialog = new AlertDialog.Builder(DisplayActivity.this,
                R.style.AppCompatAlertDialogStyle).create(); //Read Update.
        alertDialog.setView(alertLayout);
        alertDialog.setTitle("Confirmation");
        tvMessage.setText(getResources().getString(R.string.logout_message));

        alertDialog.setButton(Dialog.BUTTON_POSITIVE, "Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                ClsGlobal.autoLogout(getApplicationContext());
                Intent i = new Intent(DisplayActivity.this, LoginActivity.class);
                i.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(i);
            }
        });
        alertDialog.setButton(Dialog.BUTTON_NEGATIVE, "No", new DialogInterface.OnClickListener() {

            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
            }
        });

        alertDialog.setCancelable(false);
        alertDialog.show();
    }

    @Override
    public void onBackPressed() {
        Toast.makeText(this, "Click on logout icon...!", Toast.LENGTH_SHORT).show();
    }

}