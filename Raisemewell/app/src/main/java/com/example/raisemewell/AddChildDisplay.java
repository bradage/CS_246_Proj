package com.example.raisemewell;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class AddChildDisplay extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_child_display);
    }

    protected void addName() {childname = insert();}

    protected void addReward() {
       rewardName = insert();
       rewardValue = insert();
     }

    protected void removeReward() {
        rewardName = delete();
        rewardName = delete();
     }

    private string childName;
    private string rewardName;
    private int rewardValue;
}