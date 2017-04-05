package com.noche.noche_1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main2Activity extends AppCompatActivity implements View.OnClickListener {
    Button res ,bar, club;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        res = (Button) findViewById(R.id.btn_restaurant);
        res.setOnClickListener( this);

        bar= (Button) findViewById(R.id.btn_bar);
        bar.setOnClickListener( this);

        club = (Button) findViewById(R.id.btn_club);
        club.setOnClickListener( this);

    }


    @Override
    public void onClick(View v) {
        if (v==res){
            Intent intent = new Intent(Main2Activity.this, Main3Activity.class);
            startActivity(intent);
        }
        else if (v==bar){
            Intent intent = new Intent(Main2Activity.this, Main4Activity.class);
            startActivity(intent);
        }
        else if (v==club){
            Intent intent = new Intent(Main2Activity.this, Main5Activity.class);
            startActivity(intent);
        }


    }
}
