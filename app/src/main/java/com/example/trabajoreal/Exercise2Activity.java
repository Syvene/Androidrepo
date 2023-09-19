package com.example.trabajoreal;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;
import android.widget.EditText;
import android.widget.Spinner;

import androidx.appcompat.app.AppCompatActivity;

public class Exercise2Activity extends AppCompatActivity {
    private RadioGroup radioGroupCheese;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercise2);

        radioGroupCheese = findViewById(R.id.radioGroupCheese);

        Button buttonCalculateTotal = findViewById(R.id.buttonCalculateTotal);
        buttonCalculateTotal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculateTotal();
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

    private void calculateTotal() {
        int selectedId = radioGroupCheese.getCheckedRadioButtonId();
        RadioButton radioButton = findViewById(selectedId);

        boolean extraCheese = radioButton.getId() == R.id.radioButtonYes;

        EditText quantityEditText = findViewById(R.id.editTextQuantity);
        int quantity = Integer.parseInt(quantityEditText.getText().toString());

        Spinner spinnerType = findViewById(R.id.spinnerType);
        int basePrice = spinnerType.getSelectedItemPosition() == 0 ? 2000 : 3000;

        if (extraCheese) {
            basePrice += 1000;
        }

        int price = basePrice * quantity;

        Toast.makeText(this, "El total a pagar es: $" + price, Toast.LENGTH_SHORT).show();
    }
}
