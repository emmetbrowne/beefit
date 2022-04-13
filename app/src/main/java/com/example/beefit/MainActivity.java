package com.example.beefit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button CreateWorkoutButton = findViewById(R.id.createWorkoutButton);
        CreateWorkoutButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent CreateIntent = new Intent(getApplicationContext(), CreateWorkoutActivity.class);
                startActivity(CreateIntent);
            }
        });

        Button SelectWorkoutButton = findViewById(R.id.selectWorkoutButton);
        SelectWorkoutButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent SelectIntent = new Intent(getApplicationContext(), SelectWorkoutActivity.class);
                startActivity(SelectIntent);
            }
        });
    }
}