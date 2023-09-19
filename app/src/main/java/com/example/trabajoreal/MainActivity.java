package com.example.trabajoreal;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button buttonExercise1 = findViewById(R.id.buttonExercise1);
        Button buttonExercise2 = findViewById(R.id.buttonExercise2);
        Button buttonExercise3 = findViewById(R.id.buttonExercise3);
        Button buttonExercise4 = findViewById(R.id.buttonExercise4);

        buttonExercise1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Exercise1Activity.class);
                startActivity(intent);
            }
        });

        buttonExercise2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Exercise2Activity.class);
                startActivity(intent);
            }
        });

        buttonExercise3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Exercise3Activity.class);
                startActivity(intent);
            }
        });



        buttonExercise4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Exercise4Activity.class);
                startActivity(intent);
            }
        });


    }
}
