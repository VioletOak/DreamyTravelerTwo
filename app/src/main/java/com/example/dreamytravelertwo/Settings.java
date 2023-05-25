package com.example.dreamytravelertwo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Settings extends AppCompatActivity {

    private Button changeUsernameButton;
    private Button changeEmailButton;
    private Button changePasswordButton;
    private Button instructionButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);

        changeUsernameButton = findViewById(R.id.bttn_change_username);
        changeEmailButton = findViewById(R.id.bttn_change_email);
        changePasswordButton = findViewById(R.id.bttn_change_password);
        instructionButton = findViewById(R.id.bttn_instruction);

        changeUsernameButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                changeUsername();
            }
        });

        changeEmailButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                changeEmail();
            }
        });

        changePasswordButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                changePassword();
            }
        });

        instructionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showInstruction();
            }
        });
    }

    private void changeUsername() {
        Toast.makeText(this, "Изменение ника", Toast.LENGTH_SHORT).show();
    }

    private void changeEmail() {
        Toast.makeText(this, "Изменение e-mail", Toast.LENGTH_SHORT).show();
    }

    private void changePassword() {
        Toast.makeText(this, "Изменение пароля", Toast.LENGTH_SHORT).show();
    }

    private void showInstruction() {
        Toast.makeText(this, "Инструкция", Toast.LENGTH_SHORT).show();
    }
}
