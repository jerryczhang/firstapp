package com.example.firstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    public static final String EXTRA_MESSAGE = "com.example.myfirstapp.MESSAGE";
    AnimationDrawable wolfAnimation;
    boolean animationOn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView wolfImage = (ImageView) findViewById(R.id.wolf_anim);
        wolfImage.setBackgroundResource(R.drawable.wolf);
        wolfAnimation = (AnimationDrawable) wolfImage.getBackground();
    }

    public void sendMessage(View view) {
        Intent intent = new Intent(this, DisplayMessageActivity.class);
        EditText editText = (EditText) findViewById(R.id.editText);
        String message = editText.getText().toString();
        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);
    }

    public void animateWolf(View view) {
        animationOn = !animationOn;
        if (animationOn) {
            wolfAnimation.start();
        }
        else {
            wolfAnimation.stop();
        }
    }
}
