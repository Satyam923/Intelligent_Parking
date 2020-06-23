package com.example.intelligentparking;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Mobile_no extends AppCompatActivity {

    Button b2;

    private EditText editText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mobile_no);
        b2= findViewById(R.id.buttonContinue);

        editText = findViewById(R.id.editTextMobile);

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String number = editText.getText().toString().trim();

                if(number.isEmpty()){

                    editText.setError("Number is Required");
                    editText.requestFocus();
                    return;
                }

                Intent intent = new Intent(Mobile_no.this,VerifyPhone.class);
                intent.putExtra("number",number);
                startActivity(intent);

            }
        });
    }
}