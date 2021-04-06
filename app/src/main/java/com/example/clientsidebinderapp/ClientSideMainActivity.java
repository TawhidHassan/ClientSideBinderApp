package com.example.clientsidebinderapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ClientSideMainActivity extends AppCompatActivity implements View.OnClickListener {
    private static final String TAG=ClientSideMainActivity.class.getSimpleName();
    private Context mContext;

    public static final int GET_RANDOM_NUMBER_FLAG =0;
    private boolean mIsBound;
    private int randomNumberValue;

    private Intent serviceIntent;

    private TextView textViewRandomNumber;
    private Button buttonBindService,buttonUnBindService,buttonGetRandomNumber;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mContext=getApplicationContext();
        textViewRandomNumber=(TextView)findViewById(R.id.textViewRandomNumber);

        buttonBindService=(Button)findViewById(R.id.buttonBindService);
        buttonUnBindService=(Button)findViewById(R.id.buttonUnBindService);
        buttonGetRandomNumber=(Button)findViewById(R.id.buttonGetRandomNumber);

        buttonGetRandomNumber.setOnClickListener(this);
        buttonBindService.setOnClickListener(this);
        buttonUnBindService.setOnClickListener(this);

        serviceIntent=new Intent();
    }



    @Override
    public void onClick(View view) {
        switch (view.getId()){
            
            default:break;
        }
    }
}

