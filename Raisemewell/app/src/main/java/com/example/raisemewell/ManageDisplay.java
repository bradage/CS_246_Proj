package com.example.raisemewell;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class ManageDisplay extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_manage_display);
    }

    /**Called when the user taps the Manage Kids*/
//    public void manageKids(View view) {
//        Intent intent = new Intent(this, ManageKids.class);
//        startActivity(intent);
//    }

    /**Called when the user taps the Manage Behaviors*/
    public void manageBehaviors(View view) {
        Intent intent = new Intent(this, ManageBehaviorDisplay.class);
        startActivity(intent);
    }

//    public class ManageDisplay {
        // Display buttons for each
//        public manageKids () {
//            println.("Manage Kids");
//
//        }
//        public manageBehavior () {
//            println.("Manage Behavior");
//
//        }
//        public manageAccount () {
//            println.("Manage Account");
//
//        }
//    }
}