package com.noelchew.materialdialogwrapper.demo;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.afollestad.materialdialogs.MaterialDialog;
import com.noelchew.materialdialogwrapper.library.MaterialDialogWrapper;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";
    private Context context;
    Button btnTest;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        context = MainActivity.this;
        btnTest = (Button) findViewById(R.id.button_test);
        btnTest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MaterialDialogWrapper.showAlertDialogWithSelections(MainActivity.this, "Title", new MaterialDialog.ListCallback() {
                    @Override
                    public void onSelection(MaterialDialog dialog, View itemView, int position, CharSequence text) {

                        MaterialDialogWrapper.showAlertDialogWithOK(context, "Index: " + String.valueOf(position) + " " + text);
                    }
                }, "Item A", "Item B", "Item C");
            }
        });
    }
}
