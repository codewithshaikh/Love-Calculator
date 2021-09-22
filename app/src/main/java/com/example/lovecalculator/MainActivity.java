package com.example.lovecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    EditText male,female;
    TextView tv;
    String result;
    private Button button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

      //  getSupportActionBar().setBackgroundDrawable(new ColorDrawable(getResources().getColor(R.color.purple_600)));

    }
    public void showResult(View v){
        male=(EditText) findViewById(R.id.editTextone);
        female=(EditText) findViewById(R.id.editText2);
        tv=(TextView) findViewById(R.id.textView2);
        button2 = findViewById(R.id.button2);
        String f=female.getText().toString();
        String m=male.getText().toString();
        String sum = m+f;
        sum=sum.toLowerCase();
        int value=sum.hashCode();

        Random random= new Random(value);
        result=(random.nextInt(100)+1)+"%";
        if(f.equals("")||m.equals(""))
        {
            Toast.makeText(this, "Enter Names", Toast.LENGTH_SHORT).show();
        }
        else {
            tv.setText("Great Percentage ="+result);
        }

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                male.getText().clear();
                female.getText().clear();
                tv.setText("");
                Toast.makeText(MainActivity.this, "All Clear", Toast.LENGTH_SHORT).show();
            }
        });

    }


}