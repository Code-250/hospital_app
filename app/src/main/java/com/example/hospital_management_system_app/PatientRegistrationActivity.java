package com.example.hospital_management_system_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.qouramobileapp.R;

public class PatientRegistrationActivity extends AppCompatActivity {

    private TextView regPatientQuestion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_patient_registration);

        regPatientQuestion = findViewById(R.id.regPatientQuestion);
        regPatientQuestion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PatientRegistrationActivity.this, RegisterActivity.class);
                startActivity(intent);
            }
        });
    }
}