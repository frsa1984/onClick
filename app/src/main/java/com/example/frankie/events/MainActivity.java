package com.example.frankie.events;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView display;
    Button button;
    Button reset;
    Boolean isClicked;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        display = (TextView) findViewById(R.id.display); // When we use parenthesis (TextView) we are casting object to type Textview
        button = (Button) findViewById(R.id.button);
        reset = (Button) findViewById(R.id.reset);
        isClicked = false;
    }
    public void doSomething (View v){
        Log.d("TEST1","Button doSomething was clicked" + " The button ID is "+v.getId());

        if(isClicked==false) {
            display.setText("Ha, you just clicked the button!");
        }else if(isClicked==true){
            display.setText("Ha, you just click the button again!");
        }
        isClicked = true;
    }
    public void doReset (View v){
        Log.d("TEST1","Button doReset was clicked" + " The button ID is "+v.getId());
        isClicked = false;
        display.setText("");
    }
}
