package com.example.test;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Switch;

public class MainActivity extends AppCompatActivity {

    String[] courses = { "C", "Data structures",
            "Interview prep", "Algorithms",
            "DSA with java", "OS" };

    private EditText edt1;
    private Spinner spin1;
    private Switch swi1;
    private Button bt1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setupViews();
    }

    private void setupViews() {
        bt1= findViewById(R.id.button);
        edt1 = findViewById(R.id.edittext);
        spin1 = findViewById(R.id.spinner);
        swi1 = findViewById(R.id.switch1);

        //ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(context:this,R.array.courses, android.R.layout.simple_spinner_item);

        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String curses = edt1.getText().toString();

            }
        });

        }

}