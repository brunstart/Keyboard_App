package com.example.keyboard;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toast myToast = Toast.makeText(this.getApplicationContext(),"Keyboard Installed",
                Toast.LENGTH_SHORT);
        myToast.show();

        ActivityCompat.finishAffinity(this);
        System.exit(0);
    }
}