package com.example.applicationmobilesycilines;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.applicationmobile.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Button login;
        Button traversee;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        login= findViewById(R.id.login);
        traversee = findViewById(R.id.Traversee);

        login.setOnClickListener(v -> {
            Intent loginPage = new Intent(getApplicationContext(), LoginPage.class);
            startActivity(loginPage);
        });

        traversee.setOnClickListener(v -> {
            Intent traverseePage = new Intent(getApplicationContext(), ListeTraversee.class);
            startActivity(traverseePage);
        });
    }


}
