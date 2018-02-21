package com.example.rohitsingh.drinkcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.view.View.OnClickListener;
import android.widget.ImageView;



public class MainActivity extends AppCompatActivity {
        int x=0;
    Button b1;
    TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b1 = (Button) findViewById(R.id.button);
        final ImageView i1 = (ImageView) findViewById(R.id.imageView);
        tv = (TextView) findViewById(R.id.textView);

        b1.setOnClickListener(new OnClickListener()
        {
            @Override
            public void onClick(View view) {
                x++;
                TextView Y =(TextView) findViewById(R.id.num);
                if(x>=0&&x<=3) {
                    Y.setText("" + x);
                    if (x == 1) {
                        i1.setImageResource(R.drawable.empty);
                    }
                    else if (x == 2) {
                        i1.setImageResource(R.drawable.half);
                    }
                    else if (x == 3) {
                        i1.setImageResource(R.drawable.full);
                    }
                }
                else{
                    Y.setText("");
                    tv.setText("Please Go And Urinate");
                }
            }
        });
    }




}
