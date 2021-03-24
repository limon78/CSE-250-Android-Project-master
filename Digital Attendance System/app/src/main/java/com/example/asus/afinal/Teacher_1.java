package com.example.asus.afinal;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class Teacher_1 extends AppCompatActivity {

    private EditText teacherUserEditText, teacherPasswordEditText;
    private Button teacherLoginButton;
    private TextView textView1, textView2;
    private ProgressBar progressBar;
    private FirebaseAuth mAuth;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_teacher_1);

        teacherUserEditText = findViewById(R.id.teacherEmailId);
        teacherPasswordEditText = findViewById(R.id.teacherPasswordId);
        teacherLoginButton = findViewById(R.id.teacherLoginButton);
        textView1 = findViewById(R.id.teacher_1TextViewId);
        textView2 = findViewById(R.id.teacher_1SignUpId);
        progressBar = findViewById(R.id.loginProgressId);
        mAuth = FirebaseAuth.getInstance();

        textView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Teacher_1.this,SignUp.class));
            }
        });

        teacherLoginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String email = teacherUserEditText.getText().toString();
                String pass = teacherPasswordEditText.getText().toString();
                progressBar.setVisibility(View.VISIBLE);

                if(email.isEmpty()){
                    teacherUserEditText.setError("Email is required.");
                    teacherUserEditText.requestFocus();
                    return;
                }
                if(pass.isEmpty()){
                    teacherPasswordEditText.setError("Password is required.");
                    teacherPasswordEditText.requestFocus();
                    return;
                }

                mAuth.signInWithEmailAndPassword(email,pass).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {

                        progressBar.setVisibility(View.GONE);
                        if(task.isSuccessful()){
                            startActivity(new Intent(Teacher_1.this, Teacher_1_2.class));
                        }
                        else{
                            Toast.makeText(Teacher_1.this,"Login problem.",Toast.LENGTH_SHORT).show();
                        }
                    }
                });
            }
        });
    }
}
