package com.example.quicksum;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    private int sum;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void buttonClicked(View view) {
        Button button = (Button)view;

        int number = Integer.parseInt(button.getText().toString());
        sum += number;
        TextView textView = (TextView) findViewById(R.id.sum);
        String result = "" + sum;
        textView.setText(result);
    }
    public void buttonClear(View view) {
        sum = 0;
        TextView textView = (TextView) findViewById(R.id.sum);
        String result = "" + sum;
        textView.setText(result);

    }

}
