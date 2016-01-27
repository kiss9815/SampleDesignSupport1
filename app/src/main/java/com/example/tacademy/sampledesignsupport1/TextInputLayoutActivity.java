package com.example.tacademy.sampledesignsupport1;

import android.graphics.Color;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class TextInputLayoutActivity extends AppCompatActivity {

    FloatingActionButton fabButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_text_input_layout);

        fabButton = (FloatingActionButton)findViewById(R.id.fab_snackbar);

        fabButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Snackbar.make(v, "SnackBar...", Snackbar.LENGTH_SHORT)
                        .setAction("히힛", new View.OnClickListener() { //히힛을 누르면 동작
                            @Override
                            public void onClick(View v) {
                                Toast.makeText(TextInputLayoutActivity.this, "Snackbar Action", Toast.LENGTH_SHORT).show();

                            }
                        }).setActionTextColor(Color.YELLOW)
                        .show();
            }
        });
    }
}
