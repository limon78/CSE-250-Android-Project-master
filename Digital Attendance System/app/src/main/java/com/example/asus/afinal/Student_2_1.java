package com.example.asus.afinal;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

public class Student_2_1 extends AppCompatActivity {

    private TextView textView;
    private Spinner spinner;
    private Button button;
    String[] course_names;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_2_1);

        course_names = getResources().getStringArray(R.array.course_names);

        textView = findViewById(R.id.student_2_1textId);
        spinner = findViewById(R.id.studentSpinnerID);
        button = findViewById(R.id.student_2_1submitbuttonId);

        ArrayAdapter<String> adapter= new ArrayAdapter<String>(this,R.layout.spinner,R.id.TViewId,course_names);
        spinner.setAdapter(adapter);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Student_2_1.this, Student_2_1_2.class);
                startActivity(i);
            }
        });
    }
}
