package com.example.assg2_025;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Object TextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
         TextView = (TextView) findViewById(R.id.TextView);

         for (int i = 0; i<=9; i++ )
         {
             findViewById(getResources().getIdentifier("btn"+i, "id" , getPackageName()))
              .setOnClickListener(new View.OnClickListener() {
                  @Override
                  public void onClick(View view) {
                      TextView.append(((Button) V).getText());
                  }
              });
         }
         findViewById(R.id.btn_opn).setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {
                 int counter;
                 if(counter >4)
                     finish();
                 else if(TextView.getText().toString().trim().equals("1234"))
                 {
                     counter = 0;
                     startActivity(new Intent(MainActivity.this, safe.class));
                 }
                 else
                     Toast.makeText(MainActivity.this, "Wrong key!!, counter"+counter , Toast.LENGTH_SHORT).show();
                 counter++;
             }
         });
        findViewById(R.id.btn_bck).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String textViewString = textView.getText().toString().trim();
                //checking if the field is empty
                if(textViewString.equals(""))
                    return;
                //removing the last element
                TextView.setText(textViewString.substring(0,textViewString.length()-1));
            }
        });
    }
}