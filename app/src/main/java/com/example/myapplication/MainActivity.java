package com.example.myapplication;

import android.view.View;
import android.widget.*;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    TextView textView;
    Button button;
    EditText editText;
    String textS;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView=findViewById(R.id.alterThisOne);
        button=findViewById(R.id.btnSend);
        editText=findViewById(R.id.edtName);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textS=editText.getText().toString();
                textView.setVisibility(View.VISIBLE);
                textView.setText(textS);
            }
        });




    }


}