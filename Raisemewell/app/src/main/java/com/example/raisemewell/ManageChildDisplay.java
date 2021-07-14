package com.example.raisemewell;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class ManageChildDisplay extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_manage_child_display);
    }

    public void addChild(View view) {
        Intent intent = new Intent(this, AddChildDisplay.class);
        startActivity(intent);
    }

//// public void addChild(View v){
//        AlertDialog.Builder builder = new AlertDialog.Builder(this);
//        builder.setTitle("Add Child");
//        // Set up the input
//        final EditText childInput = new EditText(this);
//// Specify the type of input expected; this, for example, sets the input as a password, and will mask the text
//        childInput.setHint("Enter Child Name");
//        childInput.setInputType(InputType.TYPE_CLASS_TEXT | InputType.TYPE_TEXT_VARIATION_NORMAL);
//        builder.setView(childInput);
//        builder.setMessage("Enter Reward");
//        final EditText rewardNameInput = new EditText(this);
//// Specify the type of input expected; this, for example, sets the input as a password, and will mask the text
//        rewardNameInput.setInputType(InputType.TYPE_CLASS_TEXT | InputType.TYPE_TEXT_VARIATION_NORMAL);
//        builder.setView(rewardNameInput);
////        builder.setMessage("Enter Reward Value");
////        EditText rewardValueInput = new EditText(this);
////// Specify the type of input expected; this, for example, sets the input as a password, and will mask the text
////        rewardValueInput.setInputType(InputType.TYPE_CLASS_NUMBER | InputType.TYPE_TEXT_VARIATION_NORMAL);
////        builder.setView(rewardvalueInput);
//
//// Set up the buttons
//        builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
//            @Override
//            public void onClick(DialogInterface dialog, int which) {
//               _childName = childNameInput.getText().toString();
////              _rewardName = rewardNameInput.getText().toString();
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