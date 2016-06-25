package com.example.luffy.orderapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.text.NumberFormat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void tambah(View view) {
        display(1);
    }

    public void kurang(View view) {
        display(-1);
    }



    private void display(int number) {
        TextView quantityTextView = (TextView) findViewById(R.id.quantity_text_view);
        TextView priceTextView = (TextView) findViewById(R.id.price_text_view);
        int existing = Integer.parseInt(String.valueOf(quantityTextView.getText()));
        number = number+existing;
        if(number < 1) number = 0;
        quantityTextView.setText("" + number);
        int itemPrice=20;
        double price = number * itemPrice;
        priceTextView.setText("" + NumberFormat.getCurrencyInstance().format(price));

    }

    public void order(View view){
        TextView orderTextView = (TextView) findViewById(R.id.order_text_view);
        TextView quantityTextView = (TextView) findViewById(R.id.quantity_text_view);
        TextView priceTextView = (TextView) findViewById(R.id.price_text_view);
        String jumlah = String.valueOf(quantityTextView.getText());
        String harga = String.valueOf(priceTextView.getText());
        orderTextView.setText("Jumlah Pesanan "+jumlah+" dengan harga "+harga+" ");
    }
}