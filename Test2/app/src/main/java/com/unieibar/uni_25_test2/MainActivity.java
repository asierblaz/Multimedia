package com.unieibar.uni_25_test2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements RadioGroup.OnCheckedChangeListener, CheckBox.OnCheckedChangeListener {

    RadioGroup rg1;
    TextView lbl_choice1;
    CheckBox cb1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rg1 = (RadioGroup)findViewById(R.id.rg_options1);
        rg1.setOnCheckedChangeListener(this);

        lbl_choice1 = (TextView)findViewById(R.id.lbl_choice1);

        cb1 = (CheckBox)findViewById(R.id.cb1_football);
        cb1.setOnCheckedChangeListener(this);
    }

    @Override
    public void onCheckedChanged(RadioGroup radioGroup, int i) {
        switch (i)
        {
            case R.id.rg1_op1:
                lbl_choice1.setText("Psss... ya tu sabe.");
                break;
            case R.id.rg1_op2:
                lbl_choice1.setText("YOU... WIN!!!");
                break;
            case R.id.rg1_op3:
                lbl_choice1.setText("Psss... go home and cry.");
                break;
            case R.id.rg1_op4:
                lbl_choice1.setText("Ya tu NO sabe.");
                break;
            default:
                break;
        }
    }

    @Override
    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
        if (b)
        {
            lbl_choice1.setText("OK");
        }
        else
        {
            lbl_choice1.setText("NO OK");
        }
    }
}