package com.example.appppe4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText edUsername;
    private EditText edPassword;
    private Button btnLogin;
    private Button btnSignUp;

    private String login = "fred", password="123", _login, _password;


    private final String CREDENTIAL_SHARED_PREF = "our_shared_pref";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        edUsername = findViewById(R.id.ed_username);
        edPassword = findViewById(R.id.ed_password);

        btnLogin = findViewById(R.id.btn_login);
        btnSignUp = findViewById(R.id.btn_signup);

        btnSignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                 Intent intent = new Intent( MainActivity.this, RegisterActivity.class);
                startActivity(intent);
            }
        });



        btnLogin.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {

                        _login=edUsername.getText().toString();
                        _password=edPassword.getText().toString();

                    Log.v("v",login);
                        Log.v("v",_login);
                        Log.v("v",password);
                        Log.v("v",_password);


                        if(_login.equals(login) && _password.equals(password)){
                            Log.v("test",_password);
                            Intent intent = new Intent(MainActivity.this, MenuActivity.class);
                            startActivity(intent);
                        }






                /*SharedPreferences credentials = getSharedPreferences(CREDENTIAL_SHARED_PREF, MODE_PRIVATE);
                String strUsername = credentials.getString("Username", null);
                String strPassword = credentials.getString("Password", null);

                String username_from_ed = edUsername.getText().toString();
                String password_from_ed = edPassword.getText().toString();

                if (strUsername != null && username_from_ed !=null && strUsername.equalsIgnoreCase(username_from_ed)) {
                    if (strPassword != null && password_from_ed !=null && strPassword.equalsIgnoreCase(password_from_ed)) {

                        Toast.makeText(getApplicationContext(), "Login Sucessful", Toast.LENGTH_SHORT).show();
                    }else{
                        Toast.makeText(getApplicationContext(), "Login Failed", Toast.LENGTH_SHORT).show();
                    }
                }else {
                    Toast.makeText(getApplicationContext(), "Login Failed", Toast.LENGTH_SHORT).show();
                }*/
            }
        });

    }

}