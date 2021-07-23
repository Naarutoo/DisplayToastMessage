package com.example.displaytoastmessage;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button bt1 = findViewById(R.id.Button1);
        Button bt2 = findViewById(R.id.Button2);
        Button bt3 = findViewById(R.id.Button3);

        bt1.setOnClickListener(this);
        bt2.setOnClickListener(this);
        bt3.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
switch(v.getId()){
    case R.id.Button1:
        Toast.makeText(this,"Button one clicked",Toast.LENGTH_SHORT).show();
        break;
    case R.id.Button2:
        Toast.makeText(this,"Button 2 is clicked",Toast.LENGTH_SHORT).show();
        break;
    case R.id.Button3:
        Toast.makeText(this,"Button 3 is clicked",Toast.LENGTH_SHORT).show();
        break;
}
    }
}