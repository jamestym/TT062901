package com.james.yvtc.tt062901;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SecActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_sec);

        Intent it = getIntent();
        String str = it.getStringExtra(Intent.EXTRA_TEXT);
        TextView tv = (TextView) findViewById(R.id.textView);
        tv.setText(str);
    }
}
