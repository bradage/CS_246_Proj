package com.example.raisemewell;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private Child[] _children;
    private String _password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**Called when the user taps the Settings Gear*/
    public void manageSettings(View view) {
        Intent intent = new Intent(this, ManageDisplay.class);
        startActivity(intent);
    }
}
