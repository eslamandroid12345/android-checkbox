package com.example.checkbox;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    protected TextView textView;
    protected CheckBox checkBoxPhp;
    protected CheckBox checkBoxJava;
    protected CheckBox checkBoxPython;
    protected CheckBox checkBoxRuby;
    protected Button button;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

         textView = (TextView) findViewById(R.id.textView);
         checkBoxPhp = (CheckBox) findViewById(R.id.php);
         checkBoxJava = (CheckBox) findViewById(R.id.java);
         checkBoxPython  = (CheckBox) findViewById(R.id.python);
         checkBoxRuby  = (CheckBox) findViewById(R.id.ruby);
         button = (Button) findViewById(R.id.button);

         button.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {

                 StringBuilder stringBuilder = new StringBuilder();

                 if(checkBoxPhp.isChecked()){
                     stringBuilder.append(checkBoxPhp.getText().toString()).append("\n");
                 }

                 if(checkBoxJava.isChecked()){
                     stringBuilder.append(checkBoxJava.getText().toString()).append("\n");

                 }

                 if(checkBoxPython.isChecked()){
                     stringBuilder.append(checkBoxRuby.getText().toString()).append("\n");
                 }

                 if(checkBoxRuby.isChecked()){
                     stringBuilder.append(checkBoxRuby.getText().toString()).append("\n");
                 }

                 textView.setText(stringBuilder);
             }
         });
    }
}