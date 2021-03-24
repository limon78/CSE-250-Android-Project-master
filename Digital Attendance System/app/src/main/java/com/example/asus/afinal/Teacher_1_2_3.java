package com.example.asus.afinal;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Teacher_1_2_3 extends AppCompatActivity {

    private TextView textView;
    private EditText editText;
    private Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_teacher_1_2_3);

        textView = findViewById(R.id.enterstudentRegId);
        editText = findViewById(R.id.teacher1_2_3_EditTextId);
        button = findViewById(R.id.teacher1_2_3SubmitId);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Teacher_1_2_3.this, Teacher_1_2_3_1.class);
                startActivity(i);
            }
        });
    }
}
