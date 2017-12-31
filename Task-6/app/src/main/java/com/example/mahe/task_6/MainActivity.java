package com.example.mahe.task_6;

import android.opengl.Visibility;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        boolean second = false;
        FirstFragment firstFrag = new FirstFragment();
        getSupportFragmentManager().beginTransaction().add(R.id.container,firstFrag,"firstFrag").commit();
        Button b1 = (Button)findViewById(R.id.contbt);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SecondFragment secondFrag = new SecondFragment();
                getSupportFragmentManager().beginTransaction().replace(R.id.container,secondFrag,"secondFrag").addToBackStack(null).commit();
                ((Button)findViewById(R.id.contbt)).setVisibility(View.INVISIBLE);
            }

        });
    }
}
