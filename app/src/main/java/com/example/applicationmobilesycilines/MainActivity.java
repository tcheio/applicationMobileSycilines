package com.example.applicationmobilesycilines;

import androidx.appcompat.app.AppCompatActivity;
import androidx.transition.Visibility;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.applicationmobile.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Button login;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        login= (Button) findViewById(R.id.login);


        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                
            }
        });
    }


}
