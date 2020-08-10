package com.example.Hello_Toast_W7;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private int mCount = 0 ;
    private TextView mShowCount;
    private TextView mCountTextView;
    public static final String COUNT_MESSAGE = "com.example.android.Hello_Toast_W7.MESSAGE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mShowCount = (TextView) findViewById(R.id.show_count);
    }

    public void launchSecondActivity(View view)
    {
        Intent intent = new Intent(this, SecondActivity.class);
        String message = mShowCount.getText().toString();
        intent.putExtra(COUNT_MESSAGE,message);
        startActivity(intent);
    }

    public void countUp(View view)
    {
        ++mCount;
        if (mShowCount != null)
            mShowCount.setText(Integer.toString(mCount));
    }
}