package com.example.asus.afinal;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private TextView textView;
    private Button teacherButton, studentButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        teacherButton = findViewById(R.id.teacherButtonId);
        studentButton = findViewById(R.id.studentButtonId);

        teacherButton.setOnClickListener(this);
        studentButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        Intent intent;

        if(v == teacherButton){
            intent = new Intent(MainActivity.this, Teacher_1.class);
            startActivity(intent);
        }
        if(v == studentButton) {
            intent = new Intent(MainActivity.this, Student_2.class);
            startActivity(intent);
        }
    }

    @Override
    public void onBackPressed() {

        AlertDialog.Builder alertDialogBuilder;
        alertDialogBuilder = new AlertDialog.Builder(MainActivity.this);

        //alertDialogBuilder.setIcon(R.drawable.ic_priority_high_black_24dp);
        alertDialogBuilder.setTitle(R.string.exit_title);
        alertDialogBuilder.setMessage(R.string.exit_msg);
        alertDialogBuilder.setCancelable(false);

        alertDialogBuilder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                finish();
            }
        });
        alertDialogBuilder.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
            }
        });
        AlertDialog alertDialog = alertDialogBuilder.create();
        alertDialog.show();
    }
}
