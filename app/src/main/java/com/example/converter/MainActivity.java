package com.example.converter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Calculate(android.view.View view) {

        RadioButton degreeRadioButton = findViewById(R.id.radio_button_degree);
        EditText inputEditText = findViewById(R.id.editText);
        TextView textView = findViewById(R.id.textView);

//        Toast.makeText(this, "Зачем вы нажали?", Toast.LENGTH_SHORT).show();

          if (inputEditText.getText().length() == 0) {
            Toast.makeText(getApplicationContext(), "Введите угол",
                    Toast.LENGTH_LONG).show();
            return;
        }
        textView.setText("@string/degree");
        double inputValue = Double.parseDouble(inputEditText.getText().toString());
        if (degreeRadioButton.isChecked()) {
            textView.setText("@string/degree");
        } else {
            textView.setText(String.valueOf(Math.sin(inputValue)));
        }
    }

}