package com.example.dreamytravelertwo;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class LoginActivity extends AppCompatActivity {

    private EditText usernameEditText;
    private EditText passwordEditText;
    private Button loginButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        usernameEditText = findViewById(R.id.bttn_change_username);
        passwordEditText = findViewById(R.id.bttn_change_password);
        loginButton = findViewById(R.id.bttn_login_two);

        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String username = usernameEditText.getText().toString();
                String password = passwordEditText.getText().toString();

                if (validateInput(username, password)) {
                    login(username, password);
                }
            }
        });
    }
    private boolean validateInput(String username, String password) {
        if (TextUtils.isEmpty(username) || TextUtils.isEmpty(password)) {
            Toast.makeText(this, "Пожалуйста, заполните все поля", Toast.LENGTH_SHORT).show();
            return false;
        }
        return true;
    }
    private void login(String username, String password) {
        if (username.equals("ваше_имя_пользователя") && password.equals("ваш_пароль")) {
            Toast.makeText(this, "Вход выполнен успешно", Toast.LENGTH_SHORT).show();

            // Завершаем активность входа и переходим на главный экран
            finish();
            // Или можно перейти на другую активность
            // Intent intent = new Intent(LoginActivity.this, MainActivity.class);
            // startActivity(intent);
        } else {
            Toast.makeText(this, "Ошибка входа. Проверьте данные и повторите попытку.", Toast.LENGTH_SHORT).show();
        }
    }
}
