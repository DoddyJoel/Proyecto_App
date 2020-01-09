package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

import com.mikhaellopez.circularimageview.CircularImageView;

public class MenuActivity extends AppCompatActivity {

    private CircularImageView energia,mapa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        energia=(CircularImageView) findViewById(R.id.energia);
        mapa=(CircularImageView) findViewById(R.id.mapa);

        energia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MenuActivity.this,Device_Bluetooth.class);
                startActivity(intent);
            }
        });
    }
}
