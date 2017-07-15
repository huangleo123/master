package com.united.master;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        ///这应该是第二条分支
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
}
