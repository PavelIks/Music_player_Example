package com.example.androidservice;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClick(View view)
    {
        Toast.makeText(getApplicationContext(), "+click!", Toast.LENGTH_SHORT).show();
        Intent i = new Intent(this, MediaService.class);
        if(view.getId() == R.id.button1)
        {
            startService(i);
        }
        if(view.getId() == R.id.button2)
        {
            stopService(i);
        }
    }
}