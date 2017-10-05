package com.thanhtam.drawablelevellist0305;

import android.graphics.drawable.LevelListDrawable;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    ImageView imgHinh;
    Button btnStart;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imgHinh = (ImageView)findViewById(R.id.imageViewHinh);
        btnStart = (Button)findViewById(R.id.buttonStart);

        btnStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                LevelListDrawable listDrawable = (LevelListDrawable) imgHinh.getDrawable();
                int levelcurrent = listDrawable.getLevel();
                imgHinh.setImageLevel((levelcurrent + 1)%5);

            }
        });
    }
}
