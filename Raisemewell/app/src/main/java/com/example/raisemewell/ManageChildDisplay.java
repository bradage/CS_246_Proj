package com.example.raisemewell;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class ManageChildDisplay extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_manage_child_display);
    }

    /**Called when the user taps the Add Child Button*/
    public void addChild(View view) {
        Intent intent = new Intent(this, AddChildDisplay.class);
        startActivity(intent);
    }
}