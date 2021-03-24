package com.example.asus.afinal;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Teacher_1_2 extends AppCompatActivity implements View.OnClickListener {

    private Button attendanceButton, notificationButton,studentprofileButton,profileButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_teacher_1_2);

        attendanceButton = findViewById(R.id.attendanceButtonId);
        notificationButton = findViewById(R.id.notificationButtonId);
        studentprofileButton = findViewById(R.id.studentprofileButtonId);
        profileButton = findViewById(R.id.profileButtonId);

        attendanceButton.setOnClickListener(this);
        notificationButton.setOnClickListener(this);
        studentprofileButton.setOnClickListener(this);
        profileButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        Intent i;
        if(v == attendanceButton){
            i = new Intent(Teacher_1_2.this, Teacher_1_2_1.class);
            startActivity(i);
        }
        if(v == notificationButton){
            i = new Intent(Teacher_1_2.this, Teacher_1_2_2.class);
            startActivity(i);
        }
        if(v == studentprofileButton){
            i = new Intent(Teacher_1_2.this, Teacher_1_2_3.class);
            startActivity(i);
        }
        if(v == profileButton){
            i = new Intent(Teacher_1_2.this, Teacher_1_2_4.class);
            startActivity(i);
        }
    }
}
