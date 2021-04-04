package com.example.exam.foodanddrink;

import android.app.Dialog;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity {
    EditText etEmail;
    EditText etPassword;
    Storage storage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        etEmail = findViewById(R.id.et_email);
        etPassword = findViewById(R.id.et_password);
        storage = new Storage(this);
    }

    public void login(View view) {
        if (!etEmail.getText().toString().isEmpty() && !etPassword.getText().toString().isEmpty()) {
            if (etEmail.getText().toString().equals(storage.getEmail()) && etPassword.getText().toString().equals(storage.getPassword())) {
                startActivity(new Intent(LoginActivity.this, MainActivity.class));
                finish();
            }else {
                createDialog("Error Auth", "email or password incorrect");
            }
        } else {
            createDialog("Fields empty", "plz, enter your email and password");
        }
    }

    // the dialog will show for the user when adding to favorite without doing login
    public void createDialog(String title, String content) {
        //set up dialog
        final Dialog dialog = new Dialog(this);
        dialog.setContentView(R.layout.dialog_layout);
        dialog.getWindow().setGravity(Gravity.CENTER);
        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        dialog.getWindow().setLayout(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        dialog.setCancelable(true);

        //set up text
        TextView tvTitle = dialog.findViewById(R.id.tv_title_dialog_layout);
        tvTitle.setText(title);

        TextView tvContent = dialog.findViewById(R.id.tv_content_dialog_layout);
        tvContent.setText(content);

        //set up button
        Button btnYes = dialog.findViewById(R.id.btn_yes_dialog_layout);
        btnYes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.cancel();
            }
        });
        // now that the dialog is set up, it's time to show it
        dialog.show();
    }

}