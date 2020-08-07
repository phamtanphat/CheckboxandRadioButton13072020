package com.example.checkboxandradiobutton13072020;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements CompoundButton.OnCheckedChangeListener{

    CheckBox mCbAndroid,mCbIos,mCbPhp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mCbAndroid = findViewById(R.id.checkboxAndroid);
        mCbIos = findViewById(R.id.checkboxIos);
        mCbPhp = findViewById(R.id.checkboxPhp);

        mCbAndroid.setOnCheckedChangeListener(this);
        mCbIos.setOnCheckedChangeListener(this);
        mCbPhp.setOnCheckedChangeListener(this);
    }

    @Override
    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
        switch (compoundButton.getId()){
            case R.id.checkboxAndroid :
                if (b){
                    Toast.makeText(MainActivity.this, "Choose android", Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(MainActivity.this, "Cancel Android", Toast.LENGTH_SHORT).show();
                }
                break;
            case R.id.checkboxIos :
                if (b){
                    Toast.makeText(MainActivity.this, "Choose ios", Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(MainActivity.this, "Cancel ios", Toast.LENGTH_SHORT).show();
                }
                break;
            case R.id.checkboxPhp :
                if (b){
                    Toast.makeText(MainActivity.this, "Choose php", Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(MainActivity.this, "Cancel php", Toast.LENGTH_SHORT).show();
                }
                break;
        }
    }
}