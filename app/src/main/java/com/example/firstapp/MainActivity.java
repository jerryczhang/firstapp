package com.example.firstapp;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    public static final String EXTRA_MESSAGE = "com.example.firstapp.MESSAGE";
    ImageView androidImage;
    int currentColor = 0;
    int[] colors = {Color.RED, Color.YELLOW, Color.BLUE};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        androidImage = (ImageView) findViewById(R.id.androidImageView);
        changeIconColor(androidImage);
    }

    public void sendMessage(View view) {
        Intent intent = new Intent(this, DisplayMessageActivity.class);
        EditText editText = (EditText) findViewById(R.id.editText);
        String message = editText.getText().toString();
        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);
    }

    public void changeIconColor(View view) {
        androidImage.setColorFilter(colors[currentColor++], PorterDuff.Mode.MULTIPLY);
        if (currentColor == colors.length) {
            currentColor = 0;
        }
    }

    public void gotoSum(View view) {
        Intent intent = new Intent(this, SumActivity.class);
        startActivity(intent);
    }

    public void launchGoogle(View view) {
        String google = "http://www.google.com";
        Uri googleAddress = Uri.parse(google);

        Intent gotoGoogle = new Intent(Intent.ACTION_VIEW, googleAddress);
        if (gotoGoogle.resolveActivity(getPackageManager()) != null) {
            startActivity(gotoGoogle);
        }
    }

    public void gotoList(View view) {
        Intent intent = new Intent(this, ListActivity.class);
        startActivity(intent);
    }
}
