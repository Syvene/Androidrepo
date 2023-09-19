package com.example.trabajoreal;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Exercise3Activity extends AppCompatActivity {
    private EditText editTextCatetoC;
    private EditText editTextCatetoB;
    private TextView textViewResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercise3);

        editTextCatetoC = findViewById(R.id.editTextCatetoC);
        editTextCatetoB = findViewById(R.id.editTextCatetoB);
        textViewResult = findViewById(R.id.textViewResult);

        Button buttonCalculateHypotenuse = findViewById(R.id.buttonCalculateHypotenuse);
        buttonCalculateHypotenuse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculateHypotenuse();
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

    private void calculateHypotenuse() {
        double catetoC = Double.parseDouble(editTextCatetoC.getText().toString());
        double catetoB = Double.parseDouble(editTextCatetoB.getText().toString());

        double hypotenuse = Math.sqrt(catetoC * catetoC + catetoB * catetoB);

        textViewResult.setText("Hipotenusa: " + String.format("%.2f", hypotenuse));
        textViewResult.setVisibility(View.VISIBLE);
    }
}
