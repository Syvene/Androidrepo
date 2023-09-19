package com.example.trabajoreal;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Locale;

public class Exercise1Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercise1);

        EditText editTextAmount = findViewById(R.id.editTextAmount);
        RadioGroup radioGroupConversion = findViewById(R.id.radioGroupConversion);

        Button buttonConvert = findViewById(R.id.buttonConvert);
        buttonConvert.setOnClickListener(v -> convertCurrency(editTextAmount, radioGroupConversion));


        Button buttonBack = findViewById(R.id.buttonBack);
        buttonBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

    }

    private void convertCurrency(EditText editText, RadioGroup radioGroup) {
        double amount = Double.parseDouble(editText.getText().toString());
        boolean pesosToDollars = ((RadioButton) findViewById(R.id.radioButtonToDollar)).isChecked();

        double result;
        if (pesosToDollars) {
            result = amount / 780;
        } else {
            result = amount * 780;
        }

        String message = pesosToDollars ? "Dólares: " : "Pesos: ";
        message += String.format(Locale.US, "%.2f", result);

        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();

    }




}
