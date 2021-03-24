package com.example.asus.afinal;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class SignUp extends AppCompatActivity {

    private EditText emailText, passText;
    private Button signupButton;
    private ProgressBar progressBar;
    private FirebaseAuth mAuth;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        emailText = findViewById(R.id.e1Id);
        passText = findViewById(R.id.e2Id);
        signupButton = findViewById(R.id.signButtonId);
        progressBar = findViewById(R.id.progressBarId);

        mAuth = FirebaseAuth.getInstance();

        signupButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String email = emailText.getText().toString();
                String pass = passText.getText().toString();
                progressBar.setVisibility(View.VISIBLE);
                //Toast.makeText(SignUp.this, ""+email+ " "+pass,Toast.LENGTH_SHORT).show();

                if(email.isEmpty()){
                    emailText.setError("Email is required.");
                    emailText.requestFocus();
                    return;
                }
                if(pass.isEmpty()){
                    passText.setError("Password is required.");
                    passText.requestFocus();
                    return;
                }
                if(pass.length()<6){
                    passText.setError("Minimum length of password should be 6");
                    passText.requestFocus();
                    return;
                }

                mAuth.createUserWithEmailAndPassword(email,pass).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {

                        progressBar.setVisibility(View.GONE);
                        if(task.isSuccessful()){
                            //Toast.makeText(SignUp.this, "Successful",Toast.LENGTH_SHORT).show();
                            startActivity(new Intent(SignUp.this,Teacher_1_2.class));
                        }
                        else{

                            Toast.makeText(SignUp.this, "Failed",Toast.LENGTH_SHORT).show();
                        }
                    }
                });
            }
        });
    }
}

/*

<TextView
        android:textSize="17sp"
        android:id="@+id/signupTextView1Id"
        android:text="Already have an account?"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content" />

    <TextView
        android:textSize="20sp"
        android:textStyle="bold"
        android:id="@+id/signupTextView2Id"
        android:text="Login here"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content" />

 */
