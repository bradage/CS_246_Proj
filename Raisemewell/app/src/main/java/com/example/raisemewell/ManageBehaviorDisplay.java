package com.example.raisemewell;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.InputType;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class ManageBehaviorDisplay extends AppCompatActivity {

    private String _behavior;
    private int _behaviorWeight;
    private String _behaviorType ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_manage_behavior_display);
    }

    /**Called when the user taps the + button */
    public void addBehavior(View view) {
        Intent intent = new Intent(this, AddBehaviorDisplay.class);
        startActivity(intent);
    }
//    public void addBehavior(View v){
//        AlertDialog.Builder builder = new AlertDialog.Builder(this);
//        builder.setTitle("Add New Behavior");
//        // Set up the input
//        final EditText behaviorInput = new EditText(this);
//// Specify the type of input expected; this, for example, sets the input as a password, and will mask the text
//        behaviorInput.setHint("Enter Behavior");
//        behaviorInput.setInputType(InputType.TYPE_CLASS_TEXT | InputType.TYPE_TEXT_VARIATION_NORMAL);
//        builder.setView(behaviorInput);
//        builder.setMessage("Enter BehaviorWeight");
//        final EditText behaviorWeightInput = new EditText(this);
//// Specify the type of input expected; this, for example, sets the input as a password, and will mask the text
//        behaviorWeightInput.setInputType(InputType.TYPE_CLASS_NUMBER | InputType.TYPE_TEXT_VARIATION_NORMAL);
//        builder.setView(behaviorWeightInput);
////        builder.setMessage("Enter BehaviorType");
////        EditText behaviorTypeInput = new EditText(this);
////// Specify the type of input expected; this, for example, sets the input as a password, and will mask the text
////        behaviorTypeInput.setInputType(InputType.TYPE_CLASS_NUMBER | InputType.TYPE_TEXT_VARIATION_NORMAL);
////        builder.setView(behaviorTypeInput);
//
//// Set up the buttons
//        builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
//            @Override
//            public void onClick(DialogInterface dialog, int which) {
//               _behavior = behaviorInput.getText().toString();
//                _behaviorWeight = Integer.parseInt(behaviorWeightInput.getText().toString());
////               _behaviorType = behaviorTypeInput.getText().toString();
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

    //    public goodBehavior () {
//        println.("Good Behavoir");
//        println.();
//    }
//    public badBehavior () {
//        println.("Bad Behavior");
//        println.();
//    }
}