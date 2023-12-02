package com.example.dashboard;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class update extends AppCompatActivity {

    View vwadd, vwrmv, vwdlt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_update);

        vwadd = findViewById(R.id.vwadd);
        vwrmv = findViewById(R.id.vwrmv);
        vwdlt = findViewById(R.id.vwdlt);

        vwadd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent add;
                add = new Intent(update.this, add.class);
                startActivity(add);
            }
        });

        vwrmv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent remove;
                remove = new Intent(update.this, remove.class );
                startActivity(remove);
            }
        });

        vwdlt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent delete;
                delete = new Intent(update.this, delete.class);
                startActivity(delete);
            }
        });
    }
}