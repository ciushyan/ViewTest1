package com.example.viewtest1;

import android.graphics.Color;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView[] tv = new TextView[3];
    Button[] bt =new Button[3];
    CheckBox[] cb = new CheckBox[3] ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);

        LinearLayout linearLayout = new LinearLayout(this);
        linearLayout.setOrientation(LinearLayout.VERTICAL);
        setContentView(linearLayout);

        for(int i = 0 ; i<tv.length ; i++) {
            tv[i] = new TextView(this);
            tv[i].setText("No = "+ i);
            bt[i] = new Button(this);
            bt[i].setText("No =" + i);
            cb[i] = new CheckBox(this);
            cb[i].setText(" CheckBox " + i);

        }

        //定義Checkbox內容
        cb[0].setText("牛排");
        cb[1].setText("漢堡");
        cb[2].setText("汽水");

        cb[0].setTextColor(Color.RED);
        cb[1].setTextColor(Color.GREEN);
        cb[2].setTextColor(Color.BLUE);
        bt[0].setTextColor(Color.RED);
        bt[1].setTextColor(Color.GREEN);
        bt[2].setTextColor(Color.CYAN);

        tv[0].setTextColor(Color.BLACK);
        tv[1].setTextColor(Color.BLUE);
        tv[2].setTextColor(Color.CYAN);

        tv[0].setBackgroundColor(Color.RED);
        tv[1].setBackgroundColor(Color.GREEN);
        tv[2].setBackgroundColor(Color.GRAY);

        tv[0].setTextSize(14);
        tv[1].setTextSize(20);
        tv[2].setTextSize(25);

        tv[0].setTypeface(Typeface.create(Typeface.MONOSPACE , Typeface.BOLD));
        tv[1].setTypeface(Typeface.create(Typeface.SERIF , Typeface.ITALIC));
        tv[2].setTypeface(Typeface.create(Typeface.SERIF , Typeface.NORMAL));

        cb[0].setOnCheckedChangeListener(new SampCheck());
        cb[1].setOnCheckedChangeListener(new SampCheck());
        cb[2].setOnCheckedChangeListener(new SampCheck());


        linearLayout.addView(tv[0]);
        linearLayout.addView(tv[1]);
        linearLayout.addView(tv[2]);

        linearLayout.addView(bt[0]);
        linearLayout.addView(bt[1]);
        linearLayout.addView(bt[2]);

        linearLayout.addView(cb[0]);
        linearLayout.addView(cb[1]);
        linearLayout.addView(cb[2]);
    }

    private class SampCheck implements CompoundButton.OnCheckedChangeListener {
        @Override
        public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
            if(isChecked == true) {
                tv[1].setText(buttonView.getText() + "CheckBox click");
            }
            else if(isChecked == false) {
                tv[1].setText(buttonView.getText() + "CheckBox unchecked");

            }
        }
    }
}
