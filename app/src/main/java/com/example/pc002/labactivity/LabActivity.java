package com.example.pc002.labactivity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

public class LabActivity extends AppCompatActivity implements View.OnClickListener {

    private View.OnClickListener clickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Toast.makeText(LabActivity.this, "Variable Listener", Toast.LENGTH_LONG).show();
        }
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lab);

       Button ordinaryButton = findViewById(R.id.ordinary_button);
       ImageButton imageButton =findViewById(R.id.image_button);
       Button buttonWithIconAtLeft = findViewById(R.id.button_with_icon_at_left);
       Button buttonWithIconAtRight = findViewById(R.id.button_with_icon_at_right);

//       ordinaryButton.setOnClickListener(new View.OnClickListener(){
//           @Override
//           public void onClick(View view) {
//               Toast.makeText(LabActivity.this, "Ordinary button is clicked", Toast.LENGTH_SHORT).show();
//
//           }
//
//           @Override
//           protected Object clone() throws CloneNotSupportedException {
//               return super.clone();
//           }
//       });
//
//       imageButton.setOnClickListener(clickListener);
//       buttonWithIconAtLeft.setOnClickListener(clickListener);
//       buttonWithIconAtRight.setOnClickListener(this);
        ordinaryButton.setOnClickListener(this);
        imageButton.setOnClickListener(this);
        buttonWithIconAtLeft.setOnClickListener(this);
        buttonWithIconAtRight.setOnClickListener(this);
       }

    @Override
    public void onClick(View view) {
        //Toast.makeText(this, "Activity Listener", Toast.LENGTH_LONG).show();
        int id = view.getId();
        switch (id){
            case R.id.ordinary_button:
                Toast.makeText(this,"Ordinary button is clicked", Toast.LENGTH_LONG).show();
                break;
            case R.id.image_button:
                Toast.makeText(this,"Image button is clicked", Toast.LENGTH_LONG).show();
                break;
            case R.id.button_with_icon_at_left:
                Toast.makeText(this,"Icon Left button is clicked", Toast.LENGTH_LONG).show();
                break;
            case R.id.button_with_icon_at_right:
                Toast.makeText(this,"Icon right button is clicked", Toast.LENGTH_LONG).show();
                break;
        }

    }
}



