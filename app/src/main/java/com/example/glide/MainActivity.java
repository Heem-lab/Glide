package com.example.glide;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class MainActivity extends AppCompatActivity {
private ImageView mImgDemo;
private Button button;
private final String url="https://i.pinimg.com/originals/f3/ed/88/f3ed880aa4aeb7ab19a58526e81b3d5b.jpg";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mImgDemo = (ImageView) findViewById(R.id.imgDemo);
        button = (Button) findViewById(R.id.btnLond);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Glide.with(MainActivity.this).load(url).into(mImgDemo);
            }
        });
    }
}
