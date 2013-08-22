package com.example.myswipeimageviewer;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.content.Intent;
import android.widget.Button;
import android.view.View;
import android.view.View.OnClickListener;

public class MainActivity extends Activity {

    // The varible for the Button
    Button buttonStart;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Get the view from activity_main.xml
        setContentView(R.layout.activity_main);

        // Locate the button in activity_main.xml
        buttonStart=(Button)findViewById(R.id.button);

        // Capture butoon clicks
        buttonStart.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                // Go to the new Activity to see the Dia Show
                Intent intent = new Intent(MainActivity.this, SlideActivity.class);
                startActivity(intent);
            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}
