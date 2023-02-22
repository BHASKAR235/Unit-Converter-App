package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;


import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button button;
    private TextView textView;
    private EditText editText;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        button=findViewById(R.id.button);
//        textView=textView.findViewById(R.id.textView2);
//        editText=findViewById(R.id.editTextNumber);

        textView=findViewById(R.id.textView2);
        editText=findViewById(R.id.editTextNumber);



        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "click listener working", Toast.LENGTH_SHORT).show();

                String s=editText.getText().toString();  // 1kg =2.20462262

                int kg=Integer.parseInt(s);
                double pound=2.20462262*kg;
                textView.setText("the value of pound in kg is "+pound);
            }
        });

    }
}