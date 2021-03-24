package com.example.asus.afinal;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Student_2 extends AppCompatActivity {

    private EditText studentUserEditText, studentPasswordEditText;
    private Button studentLoginButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_2);

        studentUserEditText = findViewById(R.id.studentUserId);
        studentPasswordEditText = findViewById(R.id.studentPasswordId);
        studentLoginButton = findViewById(R.id.studentLoginButton);

        studentLoginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Student_2.this, Student_2_1.class);
                startActivity(i);
            }
        });
    }
}
