package com.example.lenovo.simplecalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void onButtonClickAdd(View v)
    {
        EditText e1=(EditText)findViewById(R.id.editText);
        EditText e2=(EditText)findViewById(R.id.editText2);
        TextView v1=(TextView)findViewById(R.id.textView2);
        int num1=Integer.parseInt(e1.getText().toString());
        int num2=Integer.parseInt(e2.getText().toString());
        int add=num1+num2;
        v1.setText(Integer.toString(add));

    }
    public void onButtonClickedSub(View v)
    {
        EditText e1=(EditText)findViewById(R.id.editText);
        EditText e2=(EditText)findViewById(R.id.editText2);
        TextView v1=(TextView)findViewById(R.id.textView2);
        int num1=Integer.parseInt(e1.getText().toString());
        int num2=Integer.parseInt(e2.getText().toString());
        int sub=num1-num2;
        v1.setText(Integer.toString(sub));
    }
    public void onButtonClickedMul(View v)
    {
        EditText e1=(EditText)findViewById(R.id.editText);
        EditText e2=(EditText)findViewById(R.id.editText2);
        TextView v1=(TextView)findViewById(R.id.textView2);
        int num1=Integer.parseInt(e1.getText().toString());
        int num2=Integer.parseInt(e2.getText().toString());
        int mul=num1*num2;
        v1.setText(Integer.toString(mul));
    }
    public void onButtonClickedDiv(View v)
    {
        EditText e1=(EditText)findViewById(R.id.editText);
        EditText e2=(EditText)findViewById(R.id.editText2);
        TextView v1=(TextView)findViewById(R.id.textView2);
        int num1=Integer.parseInt(e1.getText().toString());
        int num2=Integer.parseInt(e2.getText().toString());
        int div=num1/num2;
        v1.setText(Integer.toString(div));
    }

}
