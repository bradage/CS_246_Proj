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

//    public void addChild(View v){
//        AlertDialog.Builder builder = new AlertDialog.Builder(this);
//        builder.setTitle("Add New Child");
//        // Set up the input
//        final EditText childNameInput = new EditText(this);
//// Specify the type of input expected; this, for example, sets the input as a password, and will mask the text
//        childNameInput.setHint("Enter Child Name");
//        childNameInput.setInputType(InputType.TYPE_CLASS_TEXT | InputType.TYPE_TEXT_VARIATION_NORMAL);
//        builder.setView(childNameInput);
//        builder.setMessage("Enter Reward Name");
//        final EditText rewardNameInput = new EditText(this);
//// Specify the type of input expected; this, for example, sets the input as a password, and will mask the text
//        rewardNameInput.setInputType(InputType.TYPE_CLASS_TEXT | InputType.TYPE_TEXT_VARIATION_NORMAL);
//        builder.setView(rewardNameInput);
////        builder.setMessage("Enter Reward Value");
////        EditText rewardValueInput = new EditText(this);
////// Specify the type of input expected; this, for example, sets the input as a password, and will mask the text
////        rewardValueInput.setInputType(InputType.TYPE_CLASS_NUMBER | InputType.TYPE_TEXT_VARIATION_NORMAL);
////        builder.setView(rewardValueInput);
//
//// Set up the buttons
//        builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
//            @Override
//            public void onClick(DialogInterface dialog, int which) {
//               _childName = childNameInput.getText().toString();
////               _rewardName = rewardNameInput.getText().toString();
//                _rewardValue = Integer.parseInt(rewardValueInput.getText().toString());
//            }
//        });
//        builder.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
//            @Override
//            public void onClick(DialogInterface dialog, int which) {
//                dialog.cancel();
//            }
//        });
//
//        builder.show();
//    }
}