package com.example.MudrakPatel_COMP304Lab1_Ex1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Initialize the button and editText
        Button sendButton = (Button) findViewById(R.id.sendButton);
        final EditText inputEditText = (EditText) findViewById(R.id.inputEditText);

        //Attaching the tap/click event handler on sendButton
        sendButton.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                if(inputEditText.getText().toString() == null||
                        inputEditText.getText().toString().isEmpty()){
                    Toast.makeText(getApplicationContext(), "Text box field must not be empty!", Toast.LENGTH_SHORT).show();
                }else{
                    Intent intent = new Intent(getApplicationContext(),Activity2.class);
                    intent.putExtra("intentData",inputEditText.getText().toString());
                    startActivity(intent);
                }

            }
        });
    }
}
