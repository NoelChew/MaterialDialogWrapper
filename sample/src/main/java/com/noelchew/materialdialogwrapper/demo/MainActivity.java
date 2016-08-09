package com.noelchew.materialdialogwrapper.demo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.noelchew.materialdialogwrapper.library.AlertDialogUtil;

public class MainActivity extends AppCompatActivity {

    Button btnTest;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnTest = (Button) findViewById(R.id.button_test);
        btnTest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialogUtil.showAlertDialogMessage(MainActivity.this, "Test");
            }
        });
    }
}
