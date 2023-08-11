package com.example.bottomnav;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextPaint;
import android.widget.TextView;

public class Splash extends AppCompatActivity {
    TextView tv2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(new Intent(Splash.this,MainActivity.class));
                finish();
            }
        },5000);

        tv2 = findViewById(R.id.tv2);

        TextPaint paint = tv2.getPaint();
        float width = paint.measureText("META");

        Shader shader = new LinearGradient(0,0,width,tv2.getTextSize(),
                new int[] {
                        Color.parseColor("#F7BC45"),
                        Color.parseColor("#ED3833"),
                        Color.parseColor("#CA3466"),
                        Color.parseColor("#CA3466"),
                        Color.parseColor("#C6356D"),
                }, null, Shader.TileMode.CLAMP);

        tv2.getPaint().setShader(shader);

    }
}