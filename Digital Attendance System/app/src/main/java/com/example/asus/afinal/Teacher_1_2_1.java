package com.example.asus.afinal;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.TextView;

public class Teacher_1_2_1 extends AppCompatActivity implements View.OnClickListener {

    private Spinner spinner1,spinner2;
    String[] course_names,batch_names;
    private Button button1,button2;
    private TextView textView;
    private DatePickerDialog datePickerDialog;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_teacher_1_2_1);

        batch_names = getResources().getStringArray(R.array.batch_names);
        course_names = getResources().getStringArray(R.array.course_names);

        spinner1 = findViewById(R.id.teacherspinner1Id);
        spinner2 = findViewById(R.id.teacherspinner2Id);
        button1 = findViewById(R.id.datepickerbuttonId);
        button2 = findViewById(R.id.teacher_1_2_1submitButtonId);
        textView = findViewById(R.id.teacher1_2_1text3Id);

        ArrayAdapter<String> adapter= new ArrayAdapter<String>(this,R.layout.spinner,R.id.TViewId,batch_names);
        spinner1.setAdapter(adapter);

        ArrayAdapter<String> adapter1= new ArrayAdapter<String>(this,R.layout.spinner,R.id.TViewId,course_names);
        spinner2.setAdapter(adapter1);

        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        //for select date
        if (v == button1){

            DatePicker datePicker = new DatePicker(this);
            int currentDay = datePicker.getDayOfMonth();
            int currentMonth= (datePicker.getMonth())+1;
            int currentYear= datePicker.getYear();

            datePickerDialog = new DatePickerDialog(this,

                    new DatePickerDialog.OnDateSetListener() {
                        @Override
                        public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
                            textView.setText(dayOfMonth+"/"+(month+1)+"/"+year);
                        }
                    },currentYear,currentMonth,currentDay);
            datePickerDialog.show();
        }
        //for submit

        if (v == button2)
        {
            Intent i = new Intent(Teacher_1_2_1.this, Teacher_1_2_1_2.class);
            startActivity(i);
        }
    }
}
