package com.example.a2fauthentication;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class HomeActivity extends AppCompatActivity {
    private TextView usersNameEdit;
    private Button logOutButtonEdit;
    DB DB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        usersNameEdit = findViewById(R.id.usersName);
        logOutButtonEdit = findViewById(R.id.logOutButton);

        DB = new DB(this);


        String email = getIntent().getStringExtra("email");
        String userName = DB.getUserNameByEmail(email);

        if (userName != null) {
            usersNameEdit.setText(userName);
        }

        logOutButtonEdit.setOnClickListener(view -> {
            Intent intent = new Intent(HomeActivity.this, LoginActivity.class);
            startActivity(intent);

        });
    }
}
