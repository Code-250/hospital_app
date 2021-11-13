package com.example.hospital_management_system_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.qouramobileapp.R;

public class DoctorRegistrationActivity extends AppCompatActivity {

    private TextView regDocQuestion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_doctor_registration);

        regDocQuestion = findViewById(R.id.regDocQuestion);
        regDocQuestion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DoctorRegistrationActivity.this, RegisterActivity.class);
                startActivity(intent);
            }
        });
    }
}