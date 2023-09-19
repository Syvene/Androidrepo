package com.example.trabajoreal;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Exercise4Activity extends AppCompatActivity {
    private EditText editTextGrade1;
    private EditText editTextGrade2;
    private EditText editTextGrade3;
    private TextView textViewResult;
    private TextView textViewPassFail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercise4);

        editTextGrade1 = findViewById(R.id.editTextGrade1);
        editTextGrade2 = findViewById(R.id.editTextGrade2);
        editTextGrade3 = findViewById(R.id.editTextGrade3);
        textViewResult = findViewById(R.id.textViewResult);
        textViewPassFail = findViewById(R.id.textViewPassFail);

        Button buttonCalculate = findViewById(R.id.buttonCalculate);
        buttonCalculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculateAverage();
            }
        });

        Button buttonBack = findViewById(R.id.buttonBack);
        buttonBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });



    }

    private void calculateAverage() {
        double grade1 = Double.parseDouble(editTextGrade1.getText().toString());
        double grade2 = Double.parseDouble(editTextGrade2.getText().toString());
        double grade3 = Double.parseDouble(editTextGrade3.getText().toString());

        double average = (grade1 + grade2 + grade3) / 3;
        String resultMessage = "Promedio final = " + String.format("%.2f", average);

        String passFailMessage;
        if (average >= 4.5) {
            passFailMessage = "Aprobado";
        } else {
            passFailMessage = "Reprobado";
        }

        textViewResult.setText(resultMessage);
        textViewResult.setVisibility(View.VISIBLE);

        textViewPassFail.setText(passFailMessage);
        textViewPassFail.setVisibility(View.VISIBLE);
    }
}
