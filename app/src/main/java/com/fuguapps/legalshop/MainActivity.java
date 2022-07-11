package com.fuguapps.legalshop;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void increaseQuantity(View view) {
        TextView quantity = findViewById(R.id.textQuantity);
        int q = Integer.parseInt(quantity.getText().toString());
        q = q + 1;
        quantity.setText(q+"");
    }

    public void decreaseQuantity(View view) {
        TextView quantity = findViewById(R.id.textQuantity);
        int q = Integer.parseInt(quantity.getText().toString());
        q = q - 1;
        quantity.setText(q+"");
    }
}