package com.tn.smartapp.mybasiccalculator;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button button1, button2, button3, button4;
    private TextView res,text1,text2;
    private EditText num1, num2;
   private Typeface tf1 ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }

    private void init() {
        Button b1 = findViewById(R.id.button1);
        Button b2 = findViewById(R.id.button2);
        Button b3 = findViewById(R.id.button3);
        Button b4 = findViewById(R.id.button4);

        TextView to = findViewById(R.id.num1);
        TextView too = findViewById(R.id.num2);
        TextView rs = findViewById(R.id.res);
tf1 = Typeface.createFromAsset(getAssets(),"tf1.ttf");
text1.setTypeface(tf1);
text2.setTypeface(tf1);
res.setTypeface(tf1);

        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
        button3.setOnClickListener(this);
        button4.setOnClickListener(this);


    }

    @Override
    public void onClick(View view) {
        String numn = num1.getText().toString();
        String numm = num2.getText().toString();

        switch(view.getId()) {

        case R.id.button1:
            int addition = Integer.parseInt(numn) + Integer.parseInt(numm);
            res.setText(String.valueOf(addition));
            break;

        case R.id.button2:
            int suss = Integer.parseInt(numn) - Integer.parseInt(numm);
            res.setText(String.valueOf(suss));
            break;

        case R.id.button3:
            int imult = Integer.parseInt(numn) * Integer.parseInt(numm);
            res.setText(String.valueOf(imult));
            break;

        case R.id.button4:
            try {
                int divv = Integer.parseInt(numn) / Integer.parseInt(numm);
                res.setText(String.valueOf(divv));
            } catch (Exception e){
            res.setText("Cannot divide");
    }
    break;
        }
    }
}
