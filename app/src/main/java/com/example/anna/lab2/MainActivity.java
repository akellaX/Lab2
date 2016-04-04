package com.example.anna.lab2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import com.example.anna.lab2.student;

import java.util.TreeSet;

public class MainActivity extends AppCompatActivity {

    Button add;
    Button clear;
    Button show;
    TextView words;
    EditText name;
    EditText mark;
    TreeSet<student> tree = new TreeSet<student>(new studentcomp());

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        add=(Button) findViewById(R.id.button);
        clear=(Button) findViewById(R.id.button2);
        show=(Button) findViewById(R.id.button3);
        words=(TextView)findViewById(R.id.textView);
        name=(EditText)findViewById(R.id.editText);
        mark=(EditText)findViewById((R.id.editText2));

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                student temp=new student(name.getText().toString(),Integer.parseInt(mark.getText().toString()));
                tree.add(temp);

            }
        } );
        show.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

               words.setText(tree.toString());
            }
        });
        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tree.clear();
                words.setText(tree.toString());

            }
        });


    }

}
