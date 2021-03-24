package com.example.asus.afinal;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

public class Teacher_1_2_1_2 extends AppCompatActivity implements View.OnClickListener {

    private Spinner spinner;
    private Button button1,button2,button3,button4,button5,button6,button7,button8,button9,button10,button11,button12,button13,button14,button15,button16,button17,button18;
    String[] absent_present_names;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_teacher_1_2_1_2);


        absent_present_names = getResources().getStringArray(R.array.absent_present_names);

        spinner = findViewById(R.id.teacher_grid_spinner1Id);
        button1 = findViewById(R.id.studentId1);
        button2 = findViewById(R.id.studentId2);
        button3 = findViewById(R.id.studentId3);
        button4 = findViewById(R.id.studentId4);
        button5 = findViewById(R.id.studentId5);
        button6 = findViewById(R.id.studentId6);
        button7 = findViewById(R.id.studentId7);
        button8 = findViewById(R.id.studentId8);
        button9 = findViewById(R.id.studentId9);
        button10 = findViewById(R.id.studentId10);
        button11 = findViewById(R.id.studentId11);
        button12 = findViewById(R.id.studentId12);
        button13 = findViewById(R.id.studentId13);
        button14 = findViewById(R.id.studentId14);
        button15 = findViewById(R.id.studentId15);
        button16 = findViewById(R.id.studentId16);
        button17 = findViewById(R.id.studentId17);
        button18 = findViewById(R.id.studentId18);

        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
        button3.setOnClickListener(this);
        button4.setOnClickListener(this);
        button5.setOnClickListener(this);
        button6.setOnClickListener(this);
        button7.setOnClickListener(this);
        button8.setOnClickListener(this);
        button9.setOnClickListener(this);
        button10.setOnClickListener(this);
        button11.setOnClickListener(this);
        button12.setOnClickListener(this);
        button13.setOnClickListener(this);
        button14.setOnClickListener(this);
        button15.setOnClickListener(this);
        button16.setOnClickListener(this);
        button17.setOnClickListener(this);
        button18.setOnClickListener(this);


        ArrayAdapter<String> adapter= new ArrayAdapter<String>(this,R.layout.spinner,R.id.TViewId,absent_present_names);
        spinner.setAdapter(adapter);

        String value = spinner.getSelectedItem().toString();

        if(value == "All Present")
        {
            button1.setBackgroundColor(Color.GREEN);
            button1.setText("Present");
            button2.setBackgroundColor(Color.GREEN);
            button2.setText("Present");
            button3.setBackgroundColor(Color.GREEN);
            button3.setText("Present");
        }

        if(value == "All Absent")
        {
            button1.setBackgroundColor(Color.RED);
            button1.setText("Absent");
            button2.setBackgroundColor(Color.RED);
            button2.setText("Absent");
            button3.setBackgroundColor(Color.RED);
            button3.setText("Absent");
        }

    }

    @Override
    public void onClick(View v) {
        if(v==button1)
        {
            button1.setBackgroundColor(Color.GREEN);
            button1.setText("Present");
        }

        if(v==button2)
        {
            button2.setBackgroundColor(Color.GREEN);
            button2.setText("Present");
        }

        if(v==button3)
        {
            button3.setBackgroundColor(Color.GREEN);
            button3.setText("Present");
        }

        if(v==button4)
        {
            button4.setBackgroundColor(Color.GREEN);
            button4.setText("Present");
        }

        if(v==button5)
        {
            button5.setBackgroundColor(Color.GREEN);
            button5.setText("Present");
        }

        if(v==button6)
        {
            button6.setBackgroundColor(Color.GREEN);
            button6.setText("Present");
        }

        if(v==button7)
        {
            button7.setBackgroundColor(Color.GREEN);
            button7.setText("Present");
        }

        if(v==button8)
        {
            button8.setBackgroundColor(Color.GREEN);
            button8.setText("Present");
        }

        if(v==button9)
        {
            button9.setBackgroundColor(Color.GREEN);
            button9.setText("Present");
        }

        if(v==button10)
        {
            button10.setBackgroundColor(Color.GREEN);
            button10.setText("Present");
        }

        if(v==button11)
        {
            button11.setBackgroundColor(Color.GREEN);
            button11.setText("Present");
        }

        if(v==button12)
        {
            button12.setBackgroundColor(Color.GREEN);
            button12.setText("Present");
        }

        if(v==button13)
        {
            button13.setBackgroundColor(Color.GREEN);
            button13.setText("Present");
        }

        if(v==button14)
        {
            button14.setBackgroundColor(Color.GREEN);
            button14.setText("Present");
        }

        if(v==button15)
        {
            button15.setBackgroundColor(Color.GREEN);
            button15.setText("Present");
        }

        if(v==button16)
        {
            button16.setBackgroundColor(Color.GREEN);
            button16.setText("Present");
        }

        if(v==button17)
        {
            button17.setBackgroundColor(Color.GREEN);
            button17.setText("Present");
        }

        if(v==button18)
        {
            button18.setBackgroundColor(Color.GREEN);
            button18.setText("Present");

        }
    }
}