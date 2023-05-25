package com.example.dreamytravelertwo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainPage extends AppCompatActivity {

    private Button libraryButton;
    private Button menuButton;
    private Button settingsButton;
    private Button logoutButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_page);

        libraryButton = findViewById(R.id.bttn_library);
        menuButton = findViewById(R.id.bttn_menu);
        settingsButton = findViewById(R.id.bttn_settings);
        logoutButton = findViewById(R.id.bttn_signout);

        libraryButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openLibrary();
            }
        });

        menuButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMenu();
            }
        });

        settingsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openSettings();
            }
        });

        logoutButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                logout();
            }
        });
    }

    private void openLibrary() {
        Toast.makeText(this, "Открыта библиотека", Toast.LENGTH_SHORT).show();
    }

    private void openMenu() {
        Toast.makeText(this, "Открыто меню", Toast.LENGTH_SHORT).show();
    }

    private void openSettings() {
        Toast.makeText(this, "Открыты настройки", Toast.LENGTH_SHORT).show();
    }

    private void logout() {
        Toast.makeText(this, "Выход из аккаунта", Toast.LENGTH_SHORT).show();

        Intent intent = new Intent(MainPage.this, LoginActivity.class);
        startActivity(intent);
        finish();
    }
}