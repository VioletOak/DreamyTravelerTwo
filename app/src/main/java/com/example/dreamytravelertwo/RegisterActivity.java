package com.example.dreamytravelertwo;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class RegisterActivity extends AppCompatActivity {

    private EditText usernameEditText;
    private EditText emailEditText;
    private EditText passwordEditText;
    private Button registerButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        usernameEditText = findViewById(R.id.bttn_change_username);
        emailEditText = findViewById(R.id.bttn_change_email);
        passwordEditText = findViewById(R.id.bttn_change_password);
        registerButton = findViewById(R.id.bttn_register_two);

        registerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String username = usernameEditText.getText().toString();
                String email = emailEditText.getText().toString();
                String password = passwordEditText.getText().toString();

                if (validateInput(username, email, password)) {
                    registerUser(username, email, password);
                }
            }
        });
    }
    private boolean validateInput(String username, String email, String password) {
        if (TextUtils.isEmpty(username) || TextUtils.isEmpty(email) || TextUtils.isEmpty(password)) {
            Toast.makeText(this, "Пожалуйста, заполните все поля", Toast.LENGTH_SHORT).show();
            return false;
        }
        return true;
    }

    private void registerUser(String username, String email, String password) {
        Toast.makeText(this, "Регистрация успешна", Toast.LENGTH_SHORT).show();
        //   finish();
        Intent intent = new Intent(RegisterActivity.this, MainActivity.class);
        startActivity(intent);
    }
}
  /**  private void register(String username, String email, String password) {
            if (isUsernameUnique(username) && isEmailUnique(email)) {
            Toast.makeText(this, "Регистрация выполнена успешно", Toast.LENGTH_SHORT).show();
            finish();
        } else {
            Toast.makeText(this, "Ошибка регистрации. Пожалуйста, проверьте данные и повторите попытку.",
   Toast.LENGTH_SHORT).show();
        }
    }
    private boolean isUsernameUnique(String username) {
        private boolean isEmailUnique (String email){
            return true;
        }
    }
}   **/