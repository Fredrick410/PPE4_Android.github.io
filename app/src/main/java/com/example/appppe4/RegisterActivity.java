package com.example.appppe4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class RegisterActivity extends AppCompatActivity {

    private EditText edUsername;
    private EditText edPassword;
    private EditText edConfirmPassword;
    private Button btnCreateUser;

    private final String CREDENTIAL_SHARED_PREF = "our_shared_pref";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registre);


        edUsername = findViewById(R.id.ed_username);
        edPassword = findViewById(R.id.ed_password);
        edConfirmPassword = findViewById(R.id.ed_confirm_pwd);
        btnCreateUser = findViewById(R.id.btn_create_user);

        btnCreateUser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String strPassword = edPassword.getText().toString();
                String strConfirmPassword = edConfirmPassword.toString();
                String strUsername = edUsername.getText().toString();


                if (strPassword != null && strConfirmPassword !=null && strPassword.equalsIgnoreCase(strConfirmPassword)){
                    SharedPreferences credentials = getSharedPreferences(CREDENTIAL_SHARED_PREF, MODE_PRIVATE);
                    SharedPreferences.Editor editor = credentials.edit();
                    editor.putString("Password", strPassword);
                    editor.putString("Username", strUsername);
                    editor.commit();

                    RegisterActivity.this.finish();
                }

            }
        });

       /* for the insert(utiliateur)
                insert into utilisateur (numUtilisateur, raisonSociale, login, password,type)
        VALUES (4,'Matheo' ,'tholdiuser', 'matheo', 'dsi') */





    }
}