package com.javaguy.seanc.myportforlioapp;

import android.content.Context;
import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button[] buttons = new Button[6];
        
        buttons[0] = (Button)findViewById(R.id.button);
        buttons[1] = (Button)findViewById(R.id.button2);
        buttons[2] = (Button)findViewById(R.id.button3);
        buttons[3] = (Button)findViewById(R.id.button4);
        buttons[4] = (Button)findViewById(R.id.button5);
        buttons[5] = (Button)findViewById(R.id.button6);



        for(int i = 0; i < buttons.length; ++i){
            buttons[i].setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    String appName = ((Button)v).getText().toString();
                    Context context = getApplicationContext();
                    CharSequence text = appName;
                    int duration = Toast.LENGTH_SHORT;

                    Toast toast = Toast.makeText(context, text, duration);
                    toast.show();
                }
            });


        }

    }
}
