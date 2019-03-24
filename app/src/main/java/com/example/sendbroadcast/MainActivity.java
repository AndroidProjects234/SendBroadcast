package com.example.sendbroadcast;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void SendOutBroadcast(View view){
        Intent i=new Intent();
        i.setAction("com.example.sendbroadcast");   //We only want to listen from this broadcast
        i.setFlags(Intent.FLAG_INCLUDE_STOPPED_PACKAGES);   //Compatible with all android versions
        sendBroadcast(i);   //Send broadcast to all android system

    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        return super.onOptionsItemSelected(item);
    }
}
