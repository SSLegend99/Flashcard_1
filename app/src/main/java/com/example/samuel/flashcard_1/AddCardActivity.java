package com.example.samuel.flashcard_1;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.EditText;

public class AddCardActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_card);


        findViewById(R.id.xButton).setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {

                finish();
            }
        });

        findViewById(R.id.saveButton).setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {

                Intent data = new Intent();
                data.putExtra("question", ((EditText)findViewById(R.id.questionField)).getText().toString());
                data.putExtra("answer", ((EditText)findViewById(R.id.answerField)).getText().toString());
                setResult(RESULT_OK, data);
                finish();
                finish();
            }
        });

    }

}
